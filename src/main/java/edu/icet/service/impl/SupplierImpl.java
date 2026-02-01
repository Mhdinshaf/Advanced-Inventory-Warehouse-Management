package edu.icet.service.impl;

import edu.icet.dto.SupplierDto;
import edu.icet.dto.UsersDto;
import edu.icet.entity.SupplierEntity;
import edu.icet.entity.UserEntity;
import edu.icet.repository.SupplierRepository;
import edu.icet.service.SupplierService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SupplierImpl implements SupplierService {
    final ModelMapper modelMapper;
    final SupplierRepository supplierRepository;

    @Override
    public void addSupplier(SupplierDto supplier) {
        SupplierEntity supplierEntity =modelMapper.map(supplier, SupplierEntity.class);
        supplierRepository.save(supplierEntity);
            }

    @Override
    public void updateSupplier(SupplierDto supplier) {
        SupplierEntity supplierEntity =modelMapper.map(supplier, SupplierEntity.class);
        supplierRepository.save(supplierEntity);

    }

    @Override
    public void deleteSupplier(Integer supplierId) {
        supplierRepository.deleteById(supplierId);

    }

    @Override
    public SupplierDto searchByID(Integer supplierId) {
        SupplierEntity supplierEntity =supplierRepository.findById(supplierId).get();
        SupplierDto supplierDto= modelMapper.map(supplierEntity,SupplierDto.class);
        return supplierDto;
    }

    @Override
    public List<SupplierDto> getAll() {
        List<SupplierEntity> supplierEntities=supplierRepository.findAll();
        ArrayList<SupplierDto> supplierDtoArrayList=new ArrayList<>();
        supplierEntities.forEach(supplierEntity -> {
            SupplierDto supplierDto=modelMapper.map(supplierEntity, SupplierDto.class);
            supplierDtoArrayList.add(supplierDto);
        });
        return  supplierDtoArrayList;
    }
}
