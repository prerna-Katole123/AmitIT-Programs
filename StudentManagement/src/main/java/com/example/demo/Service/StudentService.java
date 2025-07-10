package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	public void saveStudent(Student s)
	{
		sr.save(s);
	}

}
