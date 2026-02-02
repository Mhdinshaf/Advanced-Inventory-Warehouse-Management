package edu.icet.controller;

import edu.icet.dto.SalesOrdersDTO;
import edu.icet.service.SalesOrdersServiceInterFace;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/SalesOrders")
@RequiredArgsConstructor
public class SalesOrdersController  {

    final SalesOrdersServiceInterFace salesOrdersServiceInterFace;

    @PostMapping("/Add")
    public void addSalesOrders(@RequestBody SalesOrdersDTO salesOrdersDTO) {
        salesOrdersServiceInterFace.addSalesOrders(salesOrdersDTO);
    }

    @PutMapping("/Update")
    public void updateSalesOrders(@RequestBody SalesOrdersDTO salesOrdersDTO) {
            salesOrdersServiceInterFace.updateSalesOrders(salesOrdersDTO);
    }

    @DeleteMapping("/Delete-By-Id/{SalesOrderId}")
    public void deleteSalesOrders(@PathVariable Integer salesOrderId) {
        salesOrdersServiceInterFace.deleteSalesOrders(salesOrderId);
    }

    @GetMapping("/Search-By-Id/{SalesOrderId}")
    public SalesOrdersDTO searchByID(@PathVariable Integer salesOrderId) {
        return salesOrdersServiceInterFace.searchByID(salesOrderId);
    }

    @GetMapping("/GetAll")
    public List<SalesOrdersDTO> getAll() {
        return salesOrdersServiceInterFace.getAll();
    }
}
