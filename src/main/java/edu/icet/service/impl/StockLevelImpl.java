package edu.icet.service.impl;


import edu.icet.dto.StockLevelDTO;
import edu.icet.entity.StockLevelEntity;
import edu.icet.repository.StockLevelRepository;
import edu.icet.service.StockLevelServiceInterFace;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StockLevelImpl implements StockLevelServiceInterFace {
   final StockLevelRepository stockLevelRepository;
   final ModelMapper modelMapper;

    @Override
    public void addSupplier(StockLevelDTO stockLevelDTO) {
       StockLevelEntity stockLevelEntity= modelMapper.map(stockLevelDTO,StockLevelEntity.class);
      stockLevelRepository.save(stockLevelEntity);
    }

    @Override
    public void updateSupplier(StockLevelDTO stockLevelDTO) {
        StockLevelEntity stockLevelEntity= modelMapper.map(stockLevelDTO,StockLevelEntity.class);
        stockLevelRepository.save(stockLevelEntity);
    }

    @Override
    public void deleteSupplier(Integer stockId) {
        stockLevelRepository.deleteById(stockId);
    }

    @Override
    public StockLevelDTO searchByID(Integer stockId) {
        StockLevelEntity stockLevelEntity=stockLevelRepository.findById(stockId).get();
        StockLevelDTO stockLevelDTO= modelMapper.map(stockLevelEntity, StockLevelDTO.class);
        return stockLevelDTO;
    }

    @Override
    public List<StockLevelDTO> getAll() {
        List<StockLevelEntity>stockLevelEntities=stockLevelRepository.findAll();
        ArrayList<StockLevelDTO> stockLevelDTOArrayList=new ArrayList<>();
       stockLevelEntities.forEach(stockLevelEntity -> {
           StockLevelDTO stockLevelDTO=modelMapper.map(stockLevelEntities, StockLevelDTO.class);
           stockLevelDTOArrayList.add(stockLevelDTO);
        });
        return stockLevelDTOArrayList;
    }
}
