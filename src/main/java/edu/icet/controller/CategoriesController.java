package edu.icet.controller;

import edu.icet.dto.CategoriesDTO;
import edu.icet.service.CategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Category")
@RequiredArgsConstructor
public class CategoriesController{

    final CategoriesService categoriesService;

    @PostMapping("/Add")
    public void addCategories(@RequestBody CategoriesDTO categoriesDTO) {
        categoriesService.addCategories(categoriesDTO);
    }

    @PutMapping("/Update")
    public void updateCategories(@RequestBody CategoriesDTO categoriesDTO) {
            categoriesService.updateCategories(categoriesDTO);
    }

    @DeleteMapping("/Delete-By-Id/{CategoryId}")
    public void deleteCategories(@PathVariable Integer categoryId) {

        categoriesService.deleteCategories(categoryId);
    }

    @GetMapping("/Search-By-Id/{CategoryId}")
    public CategoriesDTO searchByID(@PathVariable Integer categoryId) {
        return categoriesService.searchByID(categoryId);
    }

    @GetMapping("/GetAll")
    public List<CategoriesDTO> getAll() {

        return categoriesService.getAll();
    }
}
