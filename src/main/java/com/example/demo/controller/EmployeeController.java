package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	EmployeeEntity employeeEntity;

	@PostMapping("/postEmployeeDetails")
	public EmployeeEntity saveMethod(@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.savedetails(employeeEntity);
	}

	@GetMapping("/getEmployeeDetails")
	public List<EmployeeEntity> getDetails() {
		return employeeService.getAll();
	}
	
	@PutMapping("/updateEmployeeDetails/{empId}")
	public EmployeeEntity update(@PathVariable Long empId,@RequestBody EmployeeEntity employeeEntity) {
		return employeeService.updateDeatails(empId,employeeEntity);
	}
	
	@DeleteMapping("/deleteEmployeeDetails/{empId}")
	public void delete(@PathVariable Long empId) {
		  employeeService.deleteDeatails(empId);
	}
	
}
