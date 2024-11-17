package org.assignment;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Shop {

    private List<Product> basket;

    public Shop(){
        this.basket = new ArrayList<Product>();
    }

    public void addProductToBasket(Product p){
        this.basket.add(p);
    }

    public void removeProductFromBasket(Product p){
        this.basket.remove(p);
    }

    public List<Product> getBasket(){
        return this.basket;
    }


    public Product findProductById(int id){
        return this.basket.get(id);
    }

    public String toString(){
        //Use stringbuilder here
        int total = 0;
        StringBuilder printedString = new StringBuilder();
        for(Product p : this.basket){
            printedString.append(p.getName()).append(" for ").append(p.getPrice()).append("\n");
            total += p.getPrice();
        }
        printedString.append("Total Products: ").append(this.basket.size()).append("\n");
        printedString.append("The total price is: ").append(total).append(" Euros");
        return printedString.toString();
    }

    public static void main(String[] args) {

        Shop shop = new Shop();
        Electronics Nintendo = new Electronics("1","Switch",5.0);
        Electronics Xbox = new Electronics("2","Xbox 1",10.0);
        Clothing shoes =  new Clothing("3","Shoes",5.0);
        Clothing shirts =  new Clothing("4","Shirts",5.0);

        shop.addProductToBasket(Nintendo);
        shop.addProductToBasket(Xbox);

        System.out.println(shop);
    }
}