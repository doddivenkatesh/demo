package com.demo.api.service;


import java.util.List;

import com.demo.api.dao.entity.EmployeeModel;

public interface EmployeeService {
	EmployeeModel save(EmployeeModel employee);
	List<EmployeeModel> getAllDetails();
}
