package edu.icet.service;

import edu.icet.dto.ProductDto;
import edu.icet.dto.PurchaseDto;

import java.util.List;

public interface PurchaseService {
    void addPurchase(PurchaseDto purchase);
    void updatePurchase(PurchaseDto purchase);
    void deletePurchase(Integer purchaseId);
    PurchaseDto searchByID(Integer purchaseId);
    List<PurchaseDto> getAll();
}
