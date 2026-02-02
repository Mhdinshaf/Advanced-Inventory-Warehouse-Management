package edu.icet.service;

import edu.icet.dto.CategoriesDTO;
import edu.icet.dto.ProductDto;

import java.util.List;

public interface ProductService {
    void addProduct(ProductDto product);
    void updateProduct(ProductDto product);
    void deleteProduct(Integer productId);
    ProductDto searchByID(Integer productId);
    List<ProductDto> getAll();
}
