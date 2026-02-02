package edu.icet.repository;

import edu.icet.entity.SalesOrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrdersRepository extends JpaRepository<SalesOrdersEntity,Integer> {
}
