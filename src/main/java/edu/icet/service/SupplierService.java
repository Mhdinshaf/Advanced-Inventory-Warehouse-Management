package edu.icet.service;

import edu.icet.dto.SupplierDto;
import edu.icet.dto.UsersDto;

import java.util.List;

public interface SupplierService {
    void addSupplier(SupplierDto supplier);
    void updateSupplier(SupplierDto supplier);
    void deleteSupplier(Integer  supplierId);
    SupplierDto searchByID(Integer supplierId);
    List<SupplierDto> getAll();
}
