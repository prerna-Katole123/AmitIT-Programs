package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;
@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	@PostMapping("addStudent")
	String addStudent(@RequestBody  Student s)
	{
		ss.saveStudent(s);
		return "student added successfully";
	}

}
