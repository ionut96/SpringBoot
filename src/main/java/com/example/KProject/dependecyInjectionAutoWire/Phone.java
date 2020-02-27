package com.example.KProject.dependecyInjectionAutoWire;

import org.springframework.stereotype.Component;

@Component("phone")
public class Phone {

    private int id;
    private String brand;

    public Phone() {
        System.out.println("Phone was manufactured");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void connect()
    {
        System.out.println("Phone was used");
    }
}
