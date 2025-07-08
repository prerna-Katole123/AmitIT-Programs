package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.ProductDetails;
import com.example.demo.Service.ProductService;
@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	
	@PostMapping("addProduct")
	String addProduct(@RequestBody ProductDetails p)
	{
		ps.saveProduct(p);
		return"product details added";
	}
	@DeleteMapping("delete/{id}")
	String deleteProduct(@PathVariable int id)
	{
		ps.deleteProduct(id);
		return "product details deleted";
		
	}

}
