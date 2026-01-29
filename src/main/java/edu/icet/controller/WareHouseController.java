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
    public void addWareHouse(@RequestBody WareHouseDTO houseDTO) {
    wareHouseServiceInterFace.addWareHouse(houseDTO);
    }

@PutMapping("/Update")
    public void updateWareHouse(@RequestBody WareHouseDTO houseDTO) {
        wareHouseServiceInterFace.updateWareHouse(houseDTO);
    }

@DeleteMapping("/Delete-By-Id/{warehouseId}")
    public void deleteWareHouse(@PathVariable  Integer  warehouseId) {
        wareHouseServiceInterFace.deleteWareHouse(warehouseId);
    }

@GetMapping("/Search-By-Id/{warehouseId}")
    public WareHouseDTO searchById(@PathVariable Integer warehouseId) {
       return wareHouseServiceInterFace.searchById(warehouseId);
    }

@GetMapping("/GetAll")
    public List<WareHouseDTO> getAll() {
        return wareHouseServiceInterFace.getAll();
    }
}
