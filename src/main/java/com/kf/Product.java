package com.kf;

public class Product {
    private String id;
    private String name;
    private Float price;

    public Product(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return id;
    }

    public void setProductId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return name;
    }

    public void setProductName(String name) {
        this.name = name;
    }

    public Float getProductPrice() {
        return price;
    }

    public void setProductPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}
