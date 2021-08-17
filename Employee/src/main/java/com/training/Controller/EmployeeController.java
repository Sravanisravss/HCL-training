package com.training.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.Entity.Employee;
import com.training.Service.EmployeeService;

@RestController
@RequestMapping("/employees")

public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empService.save(employee);
	}

	@GetMapping("/allemployees")
	public List<Employee> findAllEmployees() {
		return empService.findAllEmployees();
	}

	@GetMapping("/name/{name}")
	public List<Employee> findByNameEquals(@PathVariable String name) {
		return empService.findByNameEquals(name);
	}

	@GetMapping("/nameisnot/{name}")
	public List<Employee> findByNameIsNot(@PathVariable String name) {
		return empService.findByNameIsNot(name);
	}

	@GetMapping("/branch")
	public List<Employee> findByBranchIsNull() {
		return empService.findByBranchIsNull();
	}

	@GetMapping("/email/{email}/age/{age}")
	public List<Employee> findByEmailAndAge(@PathVariable String email, @PathVariable Integer age) {
		return empService.findByEmailAndAge(email, age);

	}

	@GetMapping("/age/{age}")
	public List<Employee> findByAgeLessThan(@PathVariable Integer age) {
		return empService.findByAgeLessThan(age);

	}

	@GetMapping("/stage/{startAge}/endage/{endAge}")
	public List<Employee> findByAgeBetween(@PathVariable Integer startAge, @PathVariable Integer endAge) {
		return empService.findByAgeBetween(startAge, endAge);
	}

	@GetMapping("/orderbyname/{name}")
	public List<Employee> findByNameOrderByName(@PathVariable String name) {
		return empService.findByNameOrderByName(name);
	}

	@GetMapping("/orderbybranch/{location}")
	public List<Employee> findByLocationOrderByLocationDesc(@PathVariable String location) {
		return empService.findByLocationOrderByLocationDesc(location);
	}

}