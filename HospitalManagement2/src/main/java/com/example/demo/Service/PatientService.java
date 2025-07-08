package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Patient;
import com.example.demo.Repo.PatientRepo;

@Service
public class PatientService {
	@Autowired
	PatientRepo pr;
	public void savePatient(Patient p)
	{
		pr.save(p);
	}
	 public Patient getPatient(int pId)
	{
		return pr.findById(pId).get();
	}
	public void deletePatient(int pId)
	{
		pr.deleteById(pId);
	}
	public void deleteAll()
	{
		pr.deleteAll();
	}
	

}
