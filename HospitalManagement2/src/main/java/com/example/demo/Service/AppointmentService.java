package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Appointment;
import com.example.demo.Repo.AppointmentRepo;
@Service
public class AppointmentService {
	
	
	@Autowired
	AppointmentRepo ar;
	
	public void saveAppointment(Appointment a)
	{
		ar.save(a);
	}
	public Appointment getAppointment(int aId)
	{
		return ar.findById(aId).get();
	}
	public void deleteAppointment(int aId)
	{
		ar.deleteById(aId);
	}
	public void deleteAllAppointments()
	{
		ar.deleteAll();
	}

}
