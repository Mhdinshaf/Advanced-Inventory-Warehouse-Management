package edu.icet.repository;

import edu.icet.entity.CategoriesEntity;
import edu.icet.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<CategoriesEntity, Integer> {
}
