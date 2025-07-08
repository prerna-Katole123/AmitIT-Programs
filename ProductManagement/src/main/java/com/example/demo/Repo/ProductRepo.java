package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.ProductDetails;

public interface ProductRepo extends JpaRepository<ProductDetails, Integer>{

}
