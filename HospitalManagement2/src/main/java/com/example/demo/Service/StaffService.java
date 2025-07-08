package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Staff;
import com.example.demo.Repo.StaffRepo;

@Service
public class StaffService {
	
	@Autowired
	StaffRepo sr;
	
	public void saveStaff(Staff s)
	{
		sr.save(s);
	}
	public void deleteStaff(int sId)
	{
		sr.deleteById(sId);
	}
	public Staff getStaff(int sId)
	{
		return sr.findById(sId).get();
	}
	public void deleteAll()
	{
		sr.deleteAll();
	}
	

}
