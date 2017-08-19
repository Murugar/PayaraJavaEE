package com.iqmsoft.payara.javaee;

import java.io.Serializable;


public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    private String symbol;
    private String description;
    private double price;

    public Product(String symbol, String description, double price) {
        this.symbol = symbol;
        this.description = description;
        this.price = price;
    }
    
    public Product() {
        
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "symbol=" + symbol + ", description=" + description + ", price=" + price + '}';
    }
    
    
}
