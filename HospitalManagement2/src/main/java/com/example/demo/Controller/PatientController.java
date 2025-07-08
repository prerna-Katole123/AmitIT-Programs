package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Patient;
import com.example.demo.Service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService ps;
	@PostMapping("patient")
	String addPatient(@RequestBody  Patient p)
	{
		ps.savePatient(p);
		return "patient added";
	}
	
	@GetMapping("patient/{pId}")
	Patient getPatient(@PathVariable int pId)
	{
		return ps.getPatient(pId);
	}

	@DeleteMapping("patient/{pId}")
	String deletePatient(@PathVariable int pId)
	{
		ps.deletePatient(pId);
		return "patient deleted";
	}
	@DeleteMapping("patient")
	public String deleteAll()
	{
		ps.deleteAll();
		return "all patients deleted";
	}
}
