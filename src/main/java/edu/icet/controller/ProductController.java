package edu.icet.controller;

import edu.icet.dto.ProductDto;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Product")
@RequiredArgsConstructor
public class ProductController{
    final ProductService productService;

    @PostMapping("/Add")
    public void addProduct(@RequestBody ProductDto product) {
        productService.addProduct(product);
    }

    @PutMapping("/ Update")
    public void updateProduct(@RequestBody ProductDto product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("/Delerte-By-Id/{productId}")
    public void deleteProduct(@PathVariable Integer productId) {
        productService.deleteProduct(productId);
    }

    @GetMapping("/Search-By-Id/{productId}")
    public ProductDto searchByID(@PathVariable Integer productId) {
        return productService.searchByID(productId);
    }

    @GetMapping("/GetAll")
    public List<ProductDto> getAll() {
        return productService.getAll();
    }
}
