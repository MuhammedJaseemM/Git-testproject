package com.ibs.webapp.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibs.webapp.exception.ResourceNotFoundException;
import com.ibs.webapp.model.Product;
import com.ibs.webapp.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;

	// post a product into h2 database
	public void addProduct(Product product) {
		repo.save(product);

	}

	// update a product in the h2 database
	public Product updateProduct(int id, Product product) throws ResourceNotFoundException {
		List<Product> product1 = repo.findAll();
		Optional<Product> newProduct = Optional.of(product1.stream().filter(t -> t.getId() == id).findFirst().get());
		if (!newProduct.isPresent()) {
			throw new ResourceNotFoundException("Resource not found");
		} else {

			Product product2 = newProduct.get();
			product2.setId(product.getId());
			product2.setName(product.getName());
			product2.setDescription(product.getDescription());
			product2.setPrice(product.getPrice());
			repo.save(product2);
			return product2;
		}

	}

	// get all products from h2 database
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	// get a product by id from h2 database
	public Product getproduct(int id)throws ResourceNotFoundException {
		List<Product> product = repo.findAll();
		return product.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	// deleting a product from h2 database
	public void deleteProduct(int id)throws ResourceNotFoundException {
		List<Product> product = repo.findAll();
		Product newProduct = product.stream().filter(t -> t.getId() == id).findFirst().get();
		repo.delete(newProduct);
	}

}
