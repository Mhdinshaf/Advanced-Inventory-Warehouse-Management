package edu.icet.controller;

import edu.icet.dto.StockLevelDTO;
import edu.icet.service.impl.StockLevelImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/StockLevel")
@RequiredArgsConstructor
public class StockLevelsController {
        final StockLevelImpl stockLevelService;

    @PostMapping("/Add")
    public void addSupplier(@RequestBody StockLevelDTO stockLevelDTO) {
            stockLevelService.addSupplier(stockLevelDTO);
    }

    @PutMapping("/Update")
    public void updateSupplier(@RequestBody StockLevelDTO stockLevelDTO) {
            stockLevelService.updateSupplier(stockLevelDTO);
    }

    @DeleteMapping("/Delete-By-Id/{StockId}")
    public void deleteSupplier(@PathVariable Integer stockId) {
        stockLevelService.deleteSupplier(stockId);
    }

    @GetMapping("/Search-By-Id/{StockId}")
    public StockLevelDTO searchByID(@PathVariable Integer stockId) {
      return stockLevelService.searchByID(stockId);
    }

    @GetMapping("/GetAll")
    public List<StockLevelDTO> getAll() {
       return stockLevelService.getAll();
    }
}
