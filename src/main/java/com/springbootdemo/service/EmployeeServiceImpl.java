package com.springbootdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdemo.dao.EmployeeRepository;
import com.springbootdemo.entity.Employee;
import com.springbootdemo.exceptionhandler.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepositor;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepositor) {
		this.employeeRepositor = employeeRepositor;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepositor.findAll();
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		Optional<Employee> result = employeeRepositor.findById(theId);
		
		Employee theEmployee=null;
		if(result.isPresent()) {
			theEmployee=result.get();
		}
		else {
			throw new EmployeeNotFoundException("Did not Find the Employee id - "+ theId);
		}
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		
		employeeRepositor.save(theEmployee);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
		employeeRepositor.deleteById(theId);
		
	}

}
