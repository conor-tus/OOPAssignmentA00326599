package org.assignment;

import java.util.List;

abstract public class Product implements Discountable {

    enum ProductCategory {
        ELECTRONICS,
        CLOTHING,
        GROCERIES
    }

    private final String id,name;
    private final double price;
    private ProductCategory category;


    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void getDetails(){
        System.out.println("Product is called "+this.name);
        System.out.println("Product is priced "+this.price);
        System.out.println("Product has no Product Category");
    }

    @Override
    public void getDiscount(double discount){
        double discountedPrice = (price/100)*discount;
        System.out.println("The price after discount is + " + discountedPrice);
    }

}
