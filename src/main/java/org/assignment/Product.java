package org.assignment;


import java.util.ArrayList;
import java.util.List;

abstract public class Product implements Discountable {

    enum ProductCategory {
        ELECTRONICS,
        CLOTHING,
        GROCERIES
    }

    private static int idCounter = 0;
    private static List<Product> itemCatalouge = new ArrayList<>();
    private final String id;
    private final String name;
    private double price;


    public Product( String name, double price) {
        this.id = String.valueOf(++idCounter);
        this.name = name;
        this.price = price;
        itemCatalouge.add(this);
    }


    public void getDetails(){
        System.out.println("Product is called "+this.name);
        System.out.println("Product is priced "+this.price);
        System.out.println("Product has no Product Category");
    }

    @Override
    public void applyDiscount(double discount) {
        this.price = (this.price/100)*(100-discount);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Product> getItemCatalouge() {
        return itemCatalouge;
    }
}

class Electronics extends Product{

    public Electronics(String name, double price) {
        super(name, price);
        ProductCategory category = ProductCategory.ELECTRONICS;
    }

    public void getElectronicWarranty(){
        System.out.println("Electronic Warranty is called");
    }

}

class Clothing extends Product{

    public Clothing( String name, double price) {
        super(name, price);
        ProductCategory category = ProductCategory.CLOTHING;
    }

    public void getClothingReturnPolicy(){
        System.out.println("Clothing Return Policy is called");
    }

}
