package com.example.mmak_industry_sa;

public class Gadget {
    private String model;
    private String brand;
    private int yearOfManufacture;
    private boolean isOn;
    private double price;

    // Constructor fără parametri
    public Gadget() {
        this.model = "Unknown";
        this.brand = "Unknown";
        this.yearOfManufacture = 0;
        this.isOn = false;
        this.price = 0.0;
    }

    // Constructor cu parametri
    public Gadget(String model, String brand, int yearOfManufacture, boolean isOn, double price) {
        this.model = model;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.isOn = isOn;
        this.price = price;
    }

    // Constructor de copiere
    public Gadget(Gadget other) {
        this.model = other.model;
        this.brand = other.brand;
        this.yearOfManufacture = other.yearOfManufacture;
        this.isOn = other.isOn;
        this.price = other.price;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Gadget [model=" + model + ", brand=" + brand + ", year=" + yearOfManufacture + ", isOn=" + isOn + ", price=" + price + "]";
    }

    // Getters și Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
