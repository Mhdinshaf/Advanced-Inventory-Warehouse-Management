package edu.icet.service;

import edu.icet.dto.CategoriesDTO;
import edu.icet.dto.UsersDto;

import java.util.List;

public interface CategoriesService {
    void addCategories(CategoriesDTO categoriesDTO);
    void updateCategories(CategoriesDTO categoriesDTO);
    void deleteCategories(Integer categoryId);
    CategoriesDTO searchByID(Integer categoryId);
    List<CategoriesDTO> getAll();
}
