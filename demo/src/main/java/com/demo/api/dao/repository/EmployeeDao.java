package com.demo.api.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.api.dao.entity.EmployeeModel;

@Repository("employeeDao")
public interface EmployeeDao extends JpaRepository<EmployeeModel, Long>{
}
