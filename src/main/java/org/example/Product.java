package org.example;

public class Product {
    String product;

    public Product(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return product + '\'';
    }
}
