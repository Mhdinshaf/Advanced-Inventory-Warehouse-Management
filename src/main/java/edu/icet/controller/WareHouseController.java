package edu.icet.controller;

import edu.icet.dto.WareHouseDTO;
import edu.icet.service.WareHouseServiceInterFace;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehoues")
@RequiredArgsConstructor
public class WareHouseController {

final WareHouseServiceInterFace wareHouseServiceInterFace;
@PostMapping("/Add")
    public void addWareHouse(WareHouseDTO houseDTO) {
    wareHouseServiceInterFace.addWareHouse(houseDTO);
    }

@PutMapping("/Update")
    public void updateWareHouse(WareHouseDTO houseDTO) {
        wareHouseServiceInterFace.updateWareHouse(houseDTO);
    }

@DeleteMapping("/Delete-By-Id/{Id}")
    public void deleteWareHouse(Integer  warehouseId) {
        wareHouseServiceInterFace.deleteWareHouse(warehouseId);
    }

@GetMapping("/Search-By-Id/{Id}")
    public void searchById(Integer warehouseId) {
       wareHouseServiceInterFace.searchById(warehouseId);
    }

@GetMapping("/GetAll")
    public List<WareHouseDTO> getAll() {
        return wareHouseServiceInterFace.getAll();
    }
}
