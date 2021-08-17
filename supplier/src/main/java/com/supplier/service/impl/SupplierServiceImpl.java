package com.supplier.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supplier.dto.SupplierDto;
import com.supplier.model.Supplier;
import com.supplier.repository.SupplierRepository;
import com.supplier.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public SupplierDto createSupplier(SupplierDto supplierDto) {
		Supplier supplier = new Supplier();
		BeanUtils.copyProperties(supplierDto, supplier);

		supplier = supplierRepository.save(supplier);
		supplierDto.setId(supplier.getId());
		System.out.println("Saved!!\n" + supplierDto);
		return supplierDto;

	}

	@Override
	public SupplierDto updateSupplier(int id, SupplierDto supplierDto) {
		Optional<Supplier> s1 = supplierRepository.findById(supplierDto.getId());
		Supplier supplier = new Supplier();
		supplier = s1.get();
		supplier.setName(supplierDto.getName());
		supplier.setAge(supplierDto.getAge());
		supplierRepository.save(supplier);
		System.out.println("updated\n " + supplier);
		return supplierDto;
	}

	@Override
	public void deleteSupplier(int id) {
		supplierRepository.deleteById(id);
		System.out.println("is deleted!!" + id);

	}

	@Override
	public List<SupplierDto> getSuppliers() {
		List<SupplierDto> suppliers = new ArrayList<SupplierDto>();
		List<Supplier> supplier = supplierRepository.findAll();
		suppliers = supplier.stream().map(s -> {
			SupplierDto supplierDto = new SupplierDto();
			BeanUtils.copyProperties(s, supplierDto);
			return supplierDto;
		}).collect(Collectors.toList());

		return suppliers;

	}

}
