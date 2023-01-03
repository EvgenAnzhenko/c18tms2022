package com.tms.model;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product(1, "milk", 3);
        Product bread = new Product(2, "bread", 2);
        Product beef = new Product(3, "beef", 15);

        Store store = new Store();
        store.addProductToStoreList(milk);
        store.addProductToStoreList(bread);
        store.addProductToStoreList(beef);

        System.out.println(store.getAllProducts());


        System.out.println(store.sortReverse());


    }
}
