package com.training.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	public List<Employee> findByNameEquals(String name);
	public List<Employee> findByNameIsNot(String name);
	public List<Employee> findByLocationIsNull();
	public List<Employee> findByEmailAndAge(String email,Integer age);
	public List<Employee> findByAgeLessThan(Integer age);
	public List<Employee> findByAgeBetween(Integer startAge, Integer endAge);
	public List<Employee> findByNameOrderByName(String name);
	public List<Employee> findByLocationOrderByLocationDesc(String location);

}