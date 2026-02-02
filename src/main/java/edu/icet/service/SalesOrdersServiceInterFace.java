package edu.icet.service;

import edu.icet.dto.CategoriesDTO;
import edu.icet.dto.SalesOrdersDTO;

import java.util.List;

public interface SalesOrdersServiceInterFace {
    void addSalesOrders(SalesOrdersDTO salesOrdersDTO);
    void updateSalesOrders(SalesOrdersDTO salesOrdersDTO);
    void deleteSalesOrders(Integer salesOrderId);
    SalesOrdersDTO searchByID(Integer salesOrderId);
    List<SalesOrdersDTO>getAll();
}
