package edu.icet.service;

import edu.icet.dto.WareHouseDTO;

import java.util.List;

public interface WareHouseServiceInterFace {
    void addWareHouse(WareHouseDTO houseDTO);
    void updateWareHouse( WareHouseDTO houseDTO);
    void deleteWareHouse(Integer  warehouseId);
    WareHouseDTO searchById(Integer  warehouseId);
    List<WareHouseDTO>getAll();

}
