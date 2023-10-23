package com.elastic.repo;

import com.elastic.model.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product, Integer> {
    @Cacheable(value = "product_index")
    Iterable<Product> findAll();
}
