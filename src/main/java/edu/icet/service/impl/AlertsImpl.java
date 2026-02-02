package edu.icet.service.impl;

import edu.icet.dto.AlertsDTO;
import edu.icet.entity.AlertsEntity;
import edu.icet.repository.AlertsRepository;
import edu.icet.service.AlertsServiceInterFace;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlertsImpl implements AlertsServiceInterFace {
    final AlertsRepository alertsRepository;
    final ModelMapper modelMapper;

    @Override
    public void addAlerts(AlertsDTO alertsDTO) {
        AlertsEntity alertsEntity = modelMapper.map(alertsDTO,AlertsEntity.class);
        alertsRepository.save(alertsEntity);
    }

    @Override
    public void updateCategories(AlertsDTO alertsDTO) {
        AlertsEntity alertsEntity=modelMapper.map(alertsDTO,AlertsEntity.class);
        alertsRepository.save(alertsEntity);
    }

    @Override
    public void deleteCategories(Integer alertId) {
        alertsRepository.deleteById(alertId);
    }

    @Override
    public AlertsDTO searchByID(Integer alertId) {
      AlertsEntity alertsEntity = alertsRepository.findById(alertId).get();
        AlertsDTO alertsDTO = modelMapper.map(alertsEntity,AlertsDTO.class);
        return alertsDTO;
    }

    @Override
    public List<AlertsDTO> getAll() {
      List<AlertsEntity>alertsEntities=alertsRepository.findAll();
        ArrayList<AlertsDTO>alertsDTOArrayList=new ArrayList<>();
        alertsEntities.forEach(alertsEntity -> {
            AlertsDTO alertsDTO = modelMapper.map(alertsEntities, AlertsDTO.class);
            alertsDTOArrayList.add(alertsDTO);
        });
        return alertsDTOArrayList;
    }
}
