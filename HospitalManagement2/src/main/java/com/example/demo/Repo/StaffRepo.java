package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Staff;

public interface StaffRepo extends JpaRepository<Staff, Integer>{

}
