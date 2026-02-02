package edu.icet.controller;

import edu.icet.dto.PurchaseDto;
import edu.icet.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Purchase")
@RequiredArgsConstructor

public class PurchaseController  {
    final PurchaseService purchaseService;

    @PostMapping("/Add")
    public void addPurchase(@RequestBody PurchaseDto purchase) {
        purchaseService.addPurchase(purchase);
    }

    @PutMapping("/Update")
    public void updatePurchase(@RequestBody PurchaseDto purchase) {
        purchaseService.updatePurchase(purchase);
    }

    @DeleteMapping("/Delete-By-Id/{purchaseId}")
    public void deletePurchase(@PathVariable Integer purchaseId) {
        purchaseService.deletePurchase(purchaseId);
    }

    @GetMapping("/Search-By-Id/{purchaseId}")
    public PurchaseDto searchByID(@PathVariable Integer purchaseId) {
        return purchaseService.searchByID(purchaseId);
    }

    @GetMapping("/GetAll")
    public List<PurchaseDto> getAll() {
        return purchaseService.getAll();
    }
}
