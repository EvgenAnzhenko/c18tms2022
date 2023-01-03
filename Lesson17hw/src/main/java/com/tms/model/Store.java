package com.tms.model;

import com.tms.service.PriceComparator;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;

@Getter
public class Store {
    private ArrayList<Product> list = new ArrayList<>();

    public void addProductToStoreList(Product product) {

        if (list.size() > 0) {
            for (Product productFromList : list) {
                if (!product.equals(productFromList)) {
                    list.add(product);
                    break;
                } else {
                    System.out.println("Такой товар уже есть в магазине");
                }
            }
        } else {
            list.add(product);
        }
    }

    public ArrayList<Product> getAllProducts() {
        return list;
    }

    public void removeProductFromShopList(Product product) { //удаление товара
        for (Product productFromList : list) {
            if (product.equals(productFromList)) {
                list.remove(product);
                break;
            }
        }
    }

    public void editProductFromShopList(Product product) {  //редактирование товара
        for (Product productFromList : list) {
            if (product.equals(productFromList)) {
                list.remove(product);
                list.add(product);
                break;
            }
        }
    }

    public ArrayList<Product> sortListMinPriceToMaxPrice() { // сортировка по возрастанию цены
        ArrayList<Product> products = new ArrayList<>(list);
        Collections.sort(products, new PriceComparator());
        return products;
    }

    public ArrayList<Product> sortReverse() {     //Сортировка списка в обратную сторону
        ArrayList<Product> products = new ArrayList<>(list);
        Collections.reverse(products);
        return products;
    }
}
