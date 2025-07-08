package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	@Id
	private int aId;
	private int aDate;
	private String aStatus;
	private int aTime;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public int getaDate() {
		return aDate;
	}
	public void setaDate(int aDate) {
		this.aDate = aDate;
	}
	public String getaStatus() {
		return aStatus;
	}
	public void setaStatus(String aStatus) {
		this.aStatus = aStatus;
	}
	public int getaTime() {
		return aTime;
	}
	public void setaTime(int aTime) {
		this.aTime = aTime;
	}
	
	

}
