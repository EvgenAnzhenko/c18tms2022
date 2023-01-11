package com.tms.model;

import lombok.Getter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter

@ToString
public class Category {
    private String name;
    private Set<Product> productSet;

    public Category(String name) {
        this.name = name;
        productSet = new HashSet<>();
    }
}
