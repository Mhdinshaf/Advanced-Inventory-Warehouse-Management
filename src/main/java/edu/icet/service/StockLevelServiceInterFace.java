package edu.icet.service;

import edu.icet.dto.StockLevelDTO;
import edu.icet.dto.SupplierDto;

import java.util.List;

public interface StockLevelServiceInterFace {
    void addSupplier(StockLevelDTO stockLevelDTO);
    void updateSupplier(StockLevelDTO stockLevelDTO);
    void deleteSupplier(Integer  stockId);
    StockLevelDTO searchByID(Integer stockId);
    List<StockLevelDTO> getAll();
}
