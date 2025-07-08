package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Doctor;
import com.example.demo.Repo.DoctorRepo;
@Service
public class DoctorService {
	@Autowired
	DoctorRepo dr;
	
	public void saveDoctor(Doctor d)
	{
		dr.save(d);
	}
	
	public Doctor getDoctor(int dId)
	{

		return dr.findById(dId).get();
	}
	public void deleteDoctor(int dId)
	{
		dr.deleteById(dId);
	}
	public void deleteAll()
	{
		dr.deleteAll();
	}

}
