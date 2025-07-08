package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Staff;
import com.example.demo.Service.StaffService;
@RestController
public class StaffController {
	
	@Autowired
	StaffService ss;
	@PostMapping("staff")
	
	public String addStaff(@RequestBody Staff s)
	{
		ss.saveStaff(s);
		return "staff added";
	}
	
	@GetMapping("staff/{sId}")
	public Staff getStaff(@PathVariable int sId)
	{
		return ss.getStaff(sId);
	}
	
	@DeleteMapping("staff/{sId}")
	public String deleteStaff(@PathVariable int sId)
	{
		ss.deleteStaff(sId);
		return "staff deleted";
	}
	
	@DeleteMapping("staffs")
	public String deleteAll()
	{
		ss.deleteAll();
		return "all staff deleted";
	}

}
