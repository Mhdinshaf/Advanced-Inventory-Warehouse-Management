package edu.icet.service;

import edu.icet.dto.AlertsDTO;

import java.util.List;

public interface AlertsServiceInterFace {
    void addAlerts(AlertsDTO alertsDTO);
    void updateCategories(AlertsDTO alertsDTO);
    void deleteCategories(Integer alertId);
    AlertsDTO searchByID(Integer alertId);
    List<AlertsDTO> getAll();
}
