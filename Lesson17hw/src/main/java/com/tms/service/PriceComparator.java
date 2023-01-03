package com.tms.service;

import com.tms.model.Product;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product first, Product second) {
        return Integer.compare(first.getPrice(), second.getPrice());
    }
}

