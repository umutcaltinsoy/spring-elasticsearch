package com.elastic.controller;

import com.elastic.model.Product;
import com.elastic.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/apis"))
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public Iterable<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PostMapping("/bulk")
    public void bulk(@RequestBody List<Product> list) {
        productService.bulk(list);
    }
}
