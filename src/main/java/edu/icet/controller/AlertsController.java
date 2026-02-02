package edu.icet.controller;

import edu.icet.dto.AlertsDTO;
import edu.icet.service.AlertsServiceInterFace;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Alerts")
@RequiredArgsConstructor
public class AlertsController  {

    final AlertsServiceInterFace alertsServiceInterFace;

    @PostMapping("/Add")
    public void addAlerts(@RequestBody AlertsDTO alertsDTO) {
        alertsServiceInterFace.addAlerts(alertsDTO);
    }

    @PutMapping("/Update")
    public void updateCategories(@RequestBody AlertsDTO alertsDTO) {
        alertsServiceInterFace.updateCategories(alertsDTO);
    }

    @DeleteMapping("/Delete-By-Id/{AlertId}")
    public void deleteCategories(@PathVariable Integer alertId) {
        alertsServiceInterFace.deleteCategories(alertId);
    }

    @GetMapping("/Search-By-Id/{AlertId}")
    public AlertsDTO searchByID(@PathVariable Integer alertId) {
       return alertsServiceInterFace.searchByID(alertId);
    }

    @GetMapping("/GetAll")
    public List<AlertsDTO> getAll() {
        return alertsServiceInterFace.getAll();
    }
}
