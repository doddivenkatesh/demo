package com.demo.api.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.api.dao.entity.EmployeeModel;
import com.demo.api.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class Controller {
	@Autowired
	@Resource(name = "employeeService")
	EmployeeService employeeService;

	@PostMapping("/create")
	public EmployeeModel create(@RequestBody EmployeeModel employee) {
		EmployeeModel employeemodel = employeeService.save(employee);
		return employeemodel;

	}
	@GetMapping("/list")
	public List<EmployeeModel> getAllDetails(){
		return employeeService.getAllDetails();
		
	}

}
