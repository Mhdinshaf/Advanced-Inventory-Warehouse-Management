package edu.icet.service.impl;

import edu.icet.dto.WareHouseDTO;
import edu.icet.entity.WareHouseEntity;
import edu.icet.repository.WareHouseRepoInterFace;
import edu.icet.service.WareHouseServiceInterFace;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WareHouseImpl implements WareHouseServiceInterFace {
    final WareHouseRepoInterFace wareHouseRepo;
    final ModelMapper modelMapper;
    @Override
    public void addWareHouse(WareHouseDTO houseDTO) {
        WareHouseEntity wareHouseEntity = modelMapper.map(houseDTO, WareHouseEntity.class );
        wareHouseRepo.save(wareHouseEntity);
    }

    @Override
    public void updateWareHouse(WareHouseDTO houseDTO) {
        WareHouseEntity wareHouseEntity = modelMapper.map(houseDTO, WareHouseEntity.class );
        wareHouseRepo.save(wareHouseEntity);
    }

    @Override
    public void deleteWareHouse(Integer warehouseId) {
        wareHouseRepo.deleteById(warehouseId);

    }

    @Override
    public WareHouseDTO searchById(Integer warehouseId) {
       WareHouseEntity wareHouseEntity = wareHouseRepo.findById(warehouseId).get();
       WareHouseDTO wareHouseDTO = modelMapper.map(wareHouseEntity,WareHouseDTO.class);
       return  wareHouseDTO;
    }

    @Override
    public List<WareHouseDTO> getAll() {
       List<WareHouseEntity>wareHouseEntities=wareHouseRepo.findAll();
        ArrayList<WareHouseDTO>wareHouseDTOArrayList=new ArrayList<>();
        wareHouseEntities.forEach(wareHouseEntity -> {
        WareHouseDTO wareHouseDTO =modelMapper.map(wareHouseEntity,WareHouseDTO.class);
         wareHouseDTOArrayList.add(wareHouseDTO);
        });
        return  wareHouseDTOArrayList;
    }
}
