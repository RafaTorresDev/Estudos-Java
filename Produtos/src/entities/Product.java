package entities;

import org.w3c.dom.ls.LSOutput;

public class Product {

    //atributos
    private String name;
    private double price;

    //constructors
    public Product(){}
    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //métodos
    public String priceTag(){
        return name + " - R$ " + price;
    }
}
