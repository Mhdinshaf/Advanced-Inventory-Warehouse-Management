package edu.icet.service.impl;

import edu.icet.dto.ProductDto;
import edu.icet.dto.PurchaseDto;
import edu.icet.entity.ProductEntity;
import edu.icet.entity.PurchaseEntity;
import edu.icet.repository.PurchaseRepository;
import edu.icet.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseImpl implements PurchaseService {

    final ModelMapper modelMapper;
    final PurchaseRepository purchaseRepository;


    @Override
    public void addPurchase(PurchaseDto purchase) {
        PurchaseEntity purchaseEntity=modelMapper.map(purchase, PurchaseEntity.class);
        purchaseRepository.save(purchaseEntity);
    }

    @Override
    public void updatePurchase(PurchaseDto purchase) {
        PurchaseEntity purchaseEntity=modelMapper.map(purchase, PurchaseEntity.class);
        purchaseRepository.save(purchaseEntity);

    }

    @Override
    public void deletePurchase(Integer purchaseId) {
        purchaseRepository.deleteById(purchaseId);
    }

    @Override
    public PurchaseDto searchByID(Integer purchaseId) {
        PurchaseEntity purchaseEntity=purchaseRepository.findById(purchaseId).get();
        PurchaseDto purchaseDto = modelMapper.map(purchaseEntity, PurchaseDto.class);
        return purchaseDto;
    }

    @Override
    public List<PurchaseDto> getAll() {
        List<PurchaseEntity> purchaseEntities=purchaseRepository.findAll();
        ArrayList<PurchaseDto> purchaseDtoArrayList=new ArrayList<>();
        purchaseEntities.forEach(purchaseEntity -> {
            PurchaseDto purchaseDto =modelMapper.map(purchaseEntity, PurchaseDto.class);
            purchaseDtoArrayList.add(purchaseDto);
        });
        return  purchaseDtoArrayList;
    }
}
