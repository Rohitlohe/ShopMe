package com.application.MyApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.MyApp.entity.Product;
import com.application.MyApp.productDTO.ProductDTO;
import com.application.MyApp.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
@Autowired
	private  ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
	}

	@GetMapping
	public List<Product> getAll() {
		return service.getAllProducts();
		
	}
	@PostMapping
	public Product saveProduct(ProductDTO productdto) {
		return service.saveProducts(productdto);
	}
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody ProductDTO updatedProductdto) {
		return service.updateProducts(id, updatedProductdto);
	}
	@GetMapping("/{id}")
	public Product getById(@PathVariable Long id) {
		return service.getProductById(id);
	}


	@DeleteMapping("/{id}")
	public String delete(@PathVariable Long id) {
		return service.deleteProduct(id);
	}
}