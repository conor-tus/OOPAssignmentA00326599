package org.assignment;


abstract public class Product implements Discountable {

    enum ProductCategory {
        ELECTRONICS,
        CLOTHING,
        GROCERIES
    }

    private final String id,name;
    private final double price;


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

    @Override
    public double applyDiscount(double discount) {
        return 0;
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

}

class Electronics extends Product{

    public Electronics(String id, String name, double price) {
        super(id, name, price);
        ProductCategory category = ProductCategory.ELECTRONICS;
    }

    public void getElectronicWarranty(){
        System.out.println("Electronic Warranty is called");
    }

}

class Clothing extends Product{

    public Clothing(String id, String name, double price) {
        super(id, name, price);
        ProductCategory category = ProductCategory.CLOTHING;
    }

    public void getClothingReturnPolicy(){
        System.out.println("Clothing Return Policy is called");
    }

}
