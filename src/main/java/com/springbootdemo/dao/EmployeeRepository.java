package com.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
