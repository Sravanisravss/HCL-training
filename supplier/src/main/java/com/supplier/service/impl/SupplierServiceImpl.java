package com.supplier.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import com.supplier.dto.SupplierDto;
import com.supplier.model.Supplier;
import com.supplier.repository.SupplierRepository;
import com.supplier.service.SupplierService;

public class SupplierServiceImpl implements SupplierService {
	
	private SupplierRepository supplierRepository;

	@Override
	public SupplierDto createSupplier(SupplierDto supplierDto) {
		Supplier supplier = new Supplier();
		BeanUtils.copyProperties(supplierDto, supplier);
		supplier.setName(supplier.getName());
		supplier.setAge(supplier.getAge());
		supplierRepository.save(supplier);
	    supplierDto.setId(supplier.getId());
	    System.out.println("Saved!!\n" +supplierDto);
		return supplierDto;
	
	}

	
	@Override
	public SupplierDto updateSupplier(SupplierDto supplierDto) {
		Supplier supplier = new Supplier();
		supplier.setName(supplierDto.getName());
		supplier.setAge(supplierDto.getAge());
		supplierRepository.save(supplier);
		System.out.println("updated\n "+supplier);
		return supplierDto;
	}

	@Override
	public void deleteSupplier(int id) {
		supplierRepository.deleteById(id);
		System.out.println("is deleted!!" +id);
		
	}

	@Override
	public List<SupplierDto> getSuppliers(){
		List<Supplier> supplier= supplierRepository.findAll();
		List<SupplierDto> suppliers = new ArrayList<SupplierDto>();
		BeanUtils.copyProperties(supplier, suppliers);
		//List<Supplier> supplier= supplierRepository.findAll();
		return suppliers;
	
		
	}


	

}
