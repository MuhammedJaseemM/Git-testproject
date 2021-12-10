package com.ibs.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.ibs.webapp.exception.ResourceNotFoundException;
import com.ibs.webapp.model.Product;
import com.ibs.webapp.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	// Post products
	@RequestMapping("/")
	public String home() {
		return "post.jsp";
	}

	@RequestMapping("/addproduct")
	public String addProduct(Product product) {
		productService.addProduct(product);
		return "post.jsp";
	}
	

	// Get All Products
	@RequestMapping("/getproduct")
	public String getAllProducts(HttpServletRequest req) {
		HttpSession session = req.getSession();
		List<Product> product = productService.getAllProducts();
		session.setAttribute("product", product);
		return "showProduct.jsp";
	}
	

	// Get Product Based on id
	@RequestMapping("/getproductid")
	public ModelAndView getProduct(@RequestParam int id) throws ResourceNotFoundException {
		ModelAndView mv = new ModelAndView("showProduct.jsp");
		Product product = productService.getproduct(id);
		mv.addObject(product);
		return mv;
	}
	

	// delete product based on id
	@RequestMapping("delproduct")
	public String delProduct(@RequestParam int id) throws ResourceNotFoundException {
		productService.delProduct(id);
		return "post.jsp";
	}
	

	// update a product
	@RequestMapping("updateproduct")
	public String updateProduct(Product product) throws ResourceNotFoundException {
		productService.updateProduct(product);
		return "post.jsp";
	}
	

}
