package com.ibs.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ibs.webapp.exception.ResourceNotFoundException;
import com.ibs.webapp.model.Product;
import com.ibs.webapp.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	// For Saving products
	@RequestMapping(method = RequestMethod.POST, value = "/product")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	// For Updating products
	@RequestMapping(method = RequestMethod.PUT, value = "/product/{id}")
	public void updateProduct(@RequestBody Product product, @PathVariable int id) throws ResourceNotFoundException {
		product.setId(id);
		productService.updateProduct(id, product);
	}

	// For Getting all products
	@RequestMapping("/product")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	// For Getting product based on id
	@RequestMapping("/product/{id}")
	public Product getTopic(@PathVariable int id) throws ResourceNotFoundException {
		return productService.getproduct(id);
	}

	// For Deleting product based on id
	@RequestMapping(method = RequestMethod.DELETE, value = "/product/{id}")
	public void deleteTopic(@PathVariable int id) throws ResourceNotFoundException {
		productService.deleteProduct(id);
	}

}
