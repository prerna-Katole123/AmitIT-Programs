package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Doctor;
import com.example.demo.Service.DoctorService;
@RestController
public class DoctorController {
	
	@Autowired
	DoctorService ds;
	
	@PostMapping("doctor")
	public String addDoctor(@RequestBody Doctor d)
	{
		ds.saveDoctor(d);
		return "doctor added";
	}
	
	@DeleteMapping("doctor/{dId}")
	public String deleteDoctor(@PathVariable int dId)
	{
		ds.deleteDoctor(dId);
		return "doctor deleted";
	}
	@DeleteMapping("doctors")
	public String deleteAll()
	{
		ds.deleteAll();
		return"all doctors deleted";
	}
	@GetMapping("doctor/{dId}")
	Doctor getDoctor(@PathVariable int dId)
	{
		return ds.getDoctor(dId);
		
	}
	
	

}
