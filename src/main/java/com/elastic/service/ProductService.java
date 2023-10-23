package com.elastic.service;

import com.elastic.model.Product;
import com.elastic.repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Iterable<Product> getAll() {
        System.out.println("CACHABLE");
        return productRepo.findAll();
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }


    public void bulk(List<Product> list) {
         productRepo.saveAll(list);
    }
}
