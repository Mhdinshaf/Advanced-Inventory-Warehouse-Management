package edu.icet.service.impl;

import edu.icet.dto.ProductDto;
import edu.icet.entity.ProductEntity;
import edu.icet.repository.ProductRepository;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductImpl implements ProductService {

    final ModelMapper modelMapper;
    final ProductRepository productRepository;

    @Override
    public void addProduct(ProductDto product) {
        ProductEntity productEntity= modelMapper.map(product,ProductEntity.class);
        productRepository.save(productEntity);
    }

    @Override
    public void updateProduct(ProductDto product) {
        ProductEntity productEntity= modelMapper.map(product,ProductEntity.class);
        productRepository.save(productEntity);
    }

    @Override
    public void deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public ProductDto searchByID(Integer productId) {
        ProductEntity productEntity =productRepository.findById(productId).get();
        ProductDto productDto = modelMapper.map(productEntity, ProductDto.class);
        return productDto;
    }

    @Override
    public List<ProductDto> getAll() {
        List<ProductEntity> productEntities=productRepository.findAll();
        ArrayList<ProductDto> productDtoArrayList=new ArrayList<>();
        productEntities.forEach(productEntity -> {
            ProductDto productDto=modelMapper.map(productEntity, ProductDto.class);
            productDtoArrayList.add(productDto);
        });
        return  productDtoArrayList;
    }
}
