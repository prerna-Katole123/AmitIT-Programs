package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
	@Id
	private int pId;
	private String pName;
	private String pAddress;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	
	

}
