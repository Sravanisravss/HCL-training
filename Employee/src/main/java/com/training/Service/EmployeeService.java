package com.training.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.Entity.Employee;
import com.training.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> findByNameEquals(String name){
		return employeeRepository.findByNameEquals(name);
	}
	
	public List<Employee> findByNameIsNot(String name){
		return employeeRepository.findByNameIsNot(name);
	}
	
	public List<Employee> findByBranchIsNull(){
		return employeeRepository.findByLocationIsNull();
	}
	
		
	public List<Employee> findByEmailAndAge(String email,Integer age){
		return employeeRepository.findByEmailAndAge(email,age);
		
	}
	
	public List<Employee> findByAgeLessThan(Integer age){
		return employeeRepository.findByAgeLessThan(age);
		
	}
	
	public List<Employee> findByAgeBetween(Integer startAge, Integer endAge){
		return employeeRepository.findByAgeBetween(startAge, endAge);
	}
	
	public List<Employee> findByNameOrderByName(String name){
		return employeeRepository.findByNameOrderByName(name);
	}
	
	public List<Employee> findByLocationOrderByLocationDesc(String location){
		return employeeRepository.findByLocationOrderByLocationDesc(location);
	}

	public Employee save(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	public List<Employee> findAllEmployees() {
		
		return employeeRepository.findAll();
	}

}