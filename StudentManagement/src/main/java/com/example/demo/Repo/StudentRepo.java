package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
