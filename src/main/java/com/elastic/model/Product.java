package com.elastic.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "product_index")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    private Integer id;
    @Field(type = FieldType.Text)
    private String name;
}
