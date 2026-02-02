package edu.icet.repository;

import edu.icet.entity.AlertsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertsRepository extends JpaRepository<AlertsEntity, Integer> {
}
