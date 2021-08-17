package com.supplier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supplier.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
	
	public List<Supplier> findByName(String name);
	public List<Supplier> findByAge(int age);
	public List<Supplier> findByAgeLessThan(int age);
	public List<Supplier> findByNameOrderByName(String name);
}
