package edu.icet.service.impl;


import edu.icet.dto.SalesOrdersDTO;
import edu.icet.entity.SalesOrdersEntity;
import edu.icet.repository.SalesOrdersRepository;
import edu.icet.service.SalesOrdersServiceInterFace;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SalesOrdersImpl implements SalesOrdersServiceInterFace {
    final SalesOrdersRepository salesOrdersRepository;
    final ModelMapper modelMapper;

    @Override
    public void addSalesOrders(SalesOrdersDTO salesOrdersDTO) {
        SalesOrdersEntity salesOrdersEntity = modelMapper.map(salesOrdersDTO, SalesOrdersEntity.class);
       salesOrdersRepository.save(salesOrdersEntity);

    }

    @Override
    public void updateSalesOrders(SalesOrdersDTO salesOrdersDTO) {
        SalesOrdersEntity salesOrdersEntity = modelMapper.map(salesOrdersDTO, SalesOrdersEntity.class);
        salesOrdersRepository.save(salesOrdersEntity);
    }

    @Override
    public void deleteSalesOrders(Integer salesOrderId) {
            salesOrdersRepository.deleteById(salesOrderId);
    }

    @Override
    public SalesOrdersDTO searchByID(Integer salesOrderId) {
       SalesOrdersEntity salesOrdersEntity=salesOrdersRepository.findById(salesOrderId).get();
       SalesOrdersDTO  salesOrdersDTO= modelMapper.map(salesOrdersEntity, SalesOrdersDTO.class);
        return salesOrdersDTO;
    }

    @Override
    public List<SalesOrdersDTO> getAll() {
        List<SalesOrdersEntity> salesOrdersEntities=salesOrdersRepository.findAll();
        ArrayList<SalesOrdersDTO> salesOrdersDTOArrayList=new ArrayList<>();
       salesOrdersEntities.forEach(userEntity -> {
           SalesOrdersDTO salesOrdersDTO=modelMapper.map(salesOrdersEntity, SalesOrdersDTO.class);
           salesOrdersDTOArrayList.add(salesOrdersDTO);
        });
        return  salesOrdersDTOArrayList;
    }
}
