package com.supplier.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.supplier.dto.SupplierDto;

@Service
public interface SupplierService {

	public SupplierDto createSupplier(SupplierDto supplier);

	//public SupplierDto updateSupplier(Integer id, SupplierDto supplier);

	public void deleteSupplier(int id);

	public List<SupplierDto> getSuppliers();

    public SupplierDto updateSupplier(SupplierDto supplierDto);

	


}
