package com.ibs.webapp;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import com.ibs.webapp.model.Product;
import com.ibs.webapp.repository.ProductRepo;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductTest {

	@Autowired
	private ProductRepo repo;

	// jUnit test for saving product
	@Test
	@Order(1)
	@Rollback(value = false)
	public void saveProduct() {

		Product product = new Product(1, "apple", "fruit", 150);
		repo.save(product);

		assertThat(product.getId()).isGreaterThan(0);
	}

	// jUnit test for getting products by id
	@Test
	@Order(2)
	public void getProduct() {

		Product product = repo.findById(1L).get();

		assertThat(product.getId()).isEqualTo(1L);
	}

	// jUnit test for getting all products
	@Test
	@Order(3)
	public void getAllProduct() {

		List<Product> product = repo.findAll();

		assertThat(product.size()).isGreaterThan(0);
	}

	// jUnit test for updating a product
	@Test
	@Order(4)
	@Rollback(value = false)
	public void updateProduct() {

		Product product = repo.findById(1L).get();
		product.setName("mango");
		Product newProduct = repo.save(product);

		assertThat(newProduct.getName()).isEqualTo("mango");
	}

	// jUnit test for deleting a product
	@Test
	@Order(5)
	@Rollback(value = false)
	public void deleteProduct() {

		Product product = repo.findById(1L).get();
		repo.delete(product);

		Product newProduct = null;

		Optional<Product> optionalProduct = repo.findById(1L);

		if (optionalProduct.isPresent()) {
			newProduct = optionalProduct.get();
		}

		assertThat(newProduct).isNull();

	}

}
