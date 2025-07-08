package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.ProductDetails;
import com.example.demo.Repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo pr;
	
	public void saveProduct(ProductDetails p)
	{
		pr.save(p);
	}

	public void deleteProduct(int id)
	{
		pr.deleteById(id);
	}
}
