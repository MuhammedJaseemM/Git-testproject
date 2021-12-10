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

	
	// save product to h2 database
	public void addProduct(Product product) {
		repo.save(product);
	}
	

	// fetch all products from h2 database
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

	
	// fetch product based on id
	public Product getproduct(int id) throws ResourceNotFoundException {
		List<Product> product = repo.findAll();
		return product.stream().filter(t -> t.getId() == id).findFirst().get();
	}
	

	// delete product based on id
	public void delProduct(int id) throws ResourceNotFoundException {
		List<Product> product = repo.findAll();
		Product newProduct = product.stream().filter(t -> t.getId() == id).findFirst().get();
		repo.delete(newProduct);
	}

	
	// updating a product
	public void updateProduct(Product product) throws ResourceNotFoundException {
		List<Product> product1 = repo.findAll();
		Optional<Product> newProduct = Optional
				.of(product1.stream().filter(t -> t.getId() == product.getId()).findFirst().get());
		if (!newProduct.isPresent()) {
			throw new ResourceNotFoundException("Resource not found");
		} else {

			Product product2 = newProduct.get();
			product2.setId(product.getId());
			product2.setName(product.getName());
			product2.setDescription(product.getDescription());
			product2.setPrice(product.getPrice());
			repo.save(product2);
		}

		
	}
}
