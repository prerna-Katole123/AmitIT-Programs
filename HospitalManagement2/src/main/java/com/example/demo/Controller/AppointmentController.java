package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Appointment;
import com.example.demo.Service.AppointmentService;
@RestController
public class AppointmentController {
	@Autowired
	AppointmentService as;
	
	@PostMapping("appointment")
	public String addAppointment(@RequestBody Appointment a)
	{
		as.saveAppointment(a);
		return "appointment added";
	}
	
	@GetMapping("appointment/{aId}")
	public Appointment getAppointment(@PathVariable int aId)
	{
		return as.getAppointment(aId);
	}
	
	@DeleteMapping("appointment/{aId}")
	public String deleteAppointment(@PathVariable int aId)
	{
		as.deleteAppointment(aId);
		return"appointment deleted";
	}
	
	@DeleteMapping("appointments")
	public String deleteAll()
	{
		as.deleteAllAppointments();
		return "all appointment deleted";
	}

}
