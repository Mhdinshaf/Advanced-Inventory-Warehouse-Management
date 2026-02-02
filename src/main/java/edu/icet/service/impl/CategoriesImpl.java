package edu.icet.service.impl;

import edu.icet.dto.CategoriesDTO;
import edu.icet.entity.CategoriesEntity;
import edu.icet.repository.CategoriesRepository;
import edu.icet.service.CategoriesService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class  CategoriesImpl implements CategoriesService{
    final CategoriesRepository categoriesRepository;
    final ModelMapper modelMapper;

    @Override
    public void addCategories(CategoriesDTO categoriesDTO) {
        CategoriesEntity categoriesEntity = modelMapper.map(categoriesDTO, CategoriesEntity.class);
        categoriesRepository.save(categoriesEntity);
    }

    @Override
    public void updateCategories(CategoriesDTO categoriesDTO) {
        CategoriesEntity categoriesEntity = modelMapper.map(categoriesDTO, CategoriesEntity.class);
        categoriesRepository.save(categoriesEntity);
    }

    @Override
    public void deleteCategories(Integer categoryId) {
        categoriesRepository.deleteById(categoryId);
    }

    @Override
    public CategoriesDTO searchByID(Integer categoryId) {
       CategoriesEntity categoriesEntity=categoriesRepository.findById(categoryId).get();
     CategoriesDTO categoriesDTO= modelMapper.map(categoriesEntity, CategoriesDTO.class);
        return categoriesDTO;
    }

    @Override
    public List<CategoriesDTO> getAll() {
        List<CategoriesEntity> categoriesEntities=categoriesRepository.findAll();
        ArrayList<CategoriesDTO> categoriesDTOArrayList=new ArrayList<>();
        categoriesEntities.forEach(categoriesEntity -> {
           CategoriesDTO categoriesDTO=modelMapper.map(categoriesEntity, CategoriesDTO.class);
           categoriesDTOArrayList.add(categoriesDTO);
        });
        return  categoriesDTOArrayList;
    }
}
