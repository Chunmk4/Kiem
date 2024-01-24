package com.example.kiemtragkbe.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    public String describes;
    private String price;
    private String manufacture;

    public Product() {
    }

    public Product(int id, String name, String describes, String price, String manufacture) {
        this.id = id;
        this.name = name;
        this.describes = describes;
        this.price = price;
        this.manufacture = manufacture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", describes='" + describes + '\'' +
                ", price='" + price + '\'' +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
