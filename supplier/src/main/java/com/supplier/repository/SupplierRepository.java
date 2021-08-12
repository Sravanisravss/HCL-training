package com.supplier.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supplier.dto.SupplierDto;
import com.supplier.model.Supplier;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

	Supplier getSuppliers(List<SupplierDto> suppliers);


}
