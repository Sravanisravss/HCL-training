package com.supplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supplier.dto.SupplierDto;
import com.supplier.service.SupplierService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	private SupplierService service;

	@PostMapping("/addSupplier")
	public SupplierDto createSupplier(@RequestBody SupplierDto supplierDto) {

		return service.createSupplier(supplierDto);

	}

	@GetMapping("/getsuppliers")
	public List<SupplierDto> getAllSuppliers() {
		return service.getSuppliers();

	}

	/*
	 * @GetMapping("/getsupplier/{id}") public List<SupplierDto>
	 * getSuppliers(@PathVariable int id) { return service.getSuppliers(); }
	 * 
	 * @GetMapping("/getsupplier/{name}") public List<SupplierDto>
	 * getSuppliers(@PathVariable String name) { return service.getSuppliers(); }
	 */

	@PutMapping("/update")
	public SupplierDto updateSupplier(@PathVariable("id") int id, @RequestBody SupplierDto supplier) {
		return service.updateSupplier(id, supplier);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteSupplier(@PathVariable int id) {
		service.deleteSupplier(id);
	}
}
