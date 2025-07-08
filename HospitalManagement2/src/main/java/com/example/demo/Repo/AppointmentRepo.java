package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer>{

}
