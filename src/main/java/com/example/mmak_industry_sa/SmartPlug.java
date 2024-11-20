package com.example.mmak_industry_sa;

 public class SmartPlug extends Gadget {
    private boolean esteCompatibilCuAlexa;
    private boolean esteCompatibilCuGoogleHome;
    private int capacitate;
    private boolean esteProtejatImpotrivaSuprasarcinii;
    private boolean esteModular;

    // Constructor fără parametri
    public SmartPlug() {
        super();
        this.esteCompatibilCuAlexa = false;
        this.esteCompatibilCuGoogleHome = false;
        this.capacitate = 100;
        this.esteProtejatImpotrivaSuprasarcinii = true;
        this.esteModular = false;
    }

    // Constructor cu parametri
    public SmartPlug(String model, String brand, int yearOfManufacture, boolean isOn, double price, boolean esteCompatibilCuAlexa, boolean esteCompatibilCuGoogleHome, int capacitate, boolean esteProtejatImpotrivaSuprasarcinii, boolean esteModular) {
        super(model, brand, yearOfManufacture, isOn, price);
        this.esteCompatibilCuAlexa = esteCompatibilCuAlexa;
        this.esteCompatibilCuGoogleHome = esteCompatibilCuGoogleHome;
        this.capacitate = capacitate;
        this.esteProtejatImpotrivaSuprasarcinii = esteProtejatImpotrivaSuprasarcinii;
        this.esteModular = esteModular;
    }

    // Constructor de copiere
    public SmartPlug(SmartPlug other) {
        super(other);
        this.esteCompatibilCuAlexa = other.esteCompatibilCuAlexa;
        this.esteCompatibilCuGoogleHome = other.esteCompatibilCuGoogleHome;
        this.capacitate = other.capacitate;
        this.esteProtejatImpotrivaSuprasarcinii = other.esteProtejatImpotrivaSuprasarcinii;
        this.esteModular = other.esteModular;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + " SmartPlug [esteCompatibilCuAlexa=" + esteCompatibilCuAlexa + ", esteCompatibilCuGoogleHome=" + esteCompatibilCuGoogleHome + ", capacitate=" + capacitate + ", esteProtejatImpotrivaSuprasarcinii=" + esteProtejatImpotrivaSuprasarcinii + ", esteModular=" + esteModular + "]";
    }

    // Getters și Setters
    public boolean isEsteCompatibilCuAlexa() {
        return esteCompatibilCuAlexa;
    }

    public void setEsteCompatibilCuAlexa(boolean esteCompatibilCuAlexa) {
        this.esteCompatibilCuAlexa = esteCompatibilCuAlexa;
    }

    public boolean isEsteCompatibilCuGoogleHome() {
        return esteCompatibilCuGoogleHome;
    }

    public void setEsteCompatibilCuGoogleHome(boolean esteCompatibilCuGoogleHome) {
        this.esteCompatibilCuGoogleHome = esteCompatibilCuGoogleHome;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public boolean isEsteProtejatImpotrivaSuprasarcinii() {
        return esteProtejatImpotrivaSuprasarcinii;
    }

    public void setEsteProtejatImpotrivaSuprasarcinii(boolean esteProtejatImpotrivaSuprasarcinii) {
        this.esteProtejatImpotrivaSuprasarcinii = esteProtejatImpotrivaSuprasarcinii;
    }

    public boolean isEsteModular() {
        return esteModular;
    }

    public void setEsteModular(boolean esteModular) {
        this.esteModular = esteModular;
    }
}
