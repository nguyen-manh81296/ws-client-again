package com.aptech.wsclientagain.entity;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private int id;
    private String name;
    private BigDecimal price;

    public Product( String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
