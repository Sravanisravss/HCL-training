package com.supplier.service;

import java.util.List;

import com.supplier.dto.SupplierDto;

public interface SupplierService {

	public SupplierDto createSupplier(SupplierDto supplier);

	public void deleteSupplier(int id);

	public List<SupplierDto> getSuppliers();

	public SupplierDto updateSupplier(int id, SupplierDto supplierDto);

}
