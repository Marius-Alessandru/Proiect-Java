package com.example.mmak_industry_sa;

public class Boxe extends Gadget {
    private String tipConectare;
    private boolean areMicrofon;
    private int putere;
    private boolean suntRezistenteLaApa;
    private boolean suntWireless;

    // Constructor fără parametri
    public Boxe() {
        super();
        this.tipConectare = "Bluetooth";
        this.areMicrofon = false;
        this.putere = 50;
        this.suntRezistenteLaApa = false;
        this.suntWireless = true;
    }

    // Constructor cu parametri
    public Boxe(String model, String brand, int yearOfManufacture, boolean isOn, double price, String tipConectare, boolean areMicrofon, int putere, boolean suntRezistenteLaApa, boolean suntWireless) {
        super(model, brand, yearOfManufacture, isOn, price);
        this.tipConectare = tipConectare;
        this.areMicrofon = areMicrofon;
        this.putere = putere;
        this.suntRezistenteLaApa = suntRezistenteLaApa;
        this.suntWireless = suntWireless;
    }

    // Constructor de copiere
    public Boxe(Boxe other) {
        super(other);  // Apelăm constructorul de copiere al clasei Gadget
        this.tipConectare = other.tipConectare;
        this.areMicrofon = other.areMicrofon;
        this.putere = other.putere;
        this.suntRezistenteLaApa = other.suntRezistenteLaApa;
        this.suntWireless = other.suntWireless;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + " Boxe [tipConectare=" + tipConectare + ", areMicrofon=" + areMicrofon + ", putere=" + putere + ", suntRezistenteLaApa=" + suntRezistenteLaApa + ", suntWireless=" + suntWireless + "]";
    }

    // Getters și Setters
    public String getTipConectare() {
        return tipConectare;
    }

    public void setTipConectare(String tipConectare) {
        this.tipConectare = tipConectare;
    }

    public boolean isAreMicrofon() {
        return areMicrofon;
    }

    public void setAreMicrofon(boolean areMicrofon) {
        this.areMicrofon = areMicrofon;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public boolean isSuntRezistenteLaApa() {
        return suntRezistenteLaApa;
    }

    public void setSuntRezistenteLaApa(boolean suntRezistenteLaApa) {
        this.suntRezistenteLaApa = suntRezistenteLaApa;
    }

    public boolean isSuntWireless() {
        return suntWireless;
    }

    public void setSuntWireless(boolean suntWireless) {
        this.suntWireless = suntWireless;
    }
}
