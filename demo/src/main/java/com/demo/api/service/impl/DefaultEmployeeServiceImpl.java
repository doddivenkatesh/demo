package com.demo.api.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.api.dao.entity.EmployeeModel;
import com.demo.api.dao.repository.EmployeeDao;
import com.demo.api.service.EmployeeService;

@Service("employeeService")
public class DefaultEmployeeServiceImpl implements EmployeeService {
  @Autowired
	@Resource(name = "employeeDao")
	private EmployeeDao employeeDao;

	@Override
	public EmployeeModel save(EmployeeModel employee) {
		return employeeDao.save(employee);
	}

	@Override
	public List<EmployeeModel> getAllDetails() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}
	
}
