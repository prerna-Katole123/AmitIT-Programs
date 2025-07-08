package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{

}
