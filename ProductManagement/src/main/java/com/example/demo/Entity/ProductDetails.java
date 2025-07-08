package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductDetails {
	@Id
	private int productId;
	private String productName;
	private int productYear;
	private String productBarcode;
	private String productDepartment;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductYear() {
		return productYear;
	}
	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}
	public String getProductBarcode() {
		return productBarcode;
	}
	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}
	public String getProductDepartment() {
		return productDepartment;
	}
	public void setProductDepartment(String productDepartment) {
		this.productDepartment = productDepartment;
	}

}
