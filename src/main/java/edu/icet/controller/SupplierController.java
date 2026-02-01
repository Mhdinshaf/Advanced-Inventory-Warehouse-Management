package edu.icet.controller;

import edu.icet.dto.SupplierDto;
import edu.icet.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Supplier")
@RequiredArgsConstructor
public class SupplierController {

    final SupplierService supplierService;

    @PostMapping("/Add")
    public void addSupplier(@RequestBody SupplierDto supplier) {
        supplierService.addSupplier(supplier);
    }


    @PutMapping("/Update")
    public void updateSupplier(@RequestBody SupplierDto supplier) {
        supplierService.updateSupplier(supplier);
    }

    @DeleteMapping("/Delete-By-Id/{supplierId}")
    public void deleteSupplier(@PathVariable Integer supplierId) {
        supplierService.deleteSupplier(supplierId);
    }

    @GetMapping("/Search-By-Id/{supplierId}")
    public SupplierDto searchByID(@PathVariable Integer supplierId) {
         return supplierService.searchByID(supplierId);
    }

    @GetMapping("/GetAll")
    public List<SupplierDto> getAll() {
        return supplierService.getAll();
    }
}
