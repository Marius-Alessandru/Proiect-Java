package com.example.mmak_industry_sa;

public class MiniCamera extends Gadget {
    private String rezolutie;
    private int durataBaterie;
    private boolean esteInfrarosu;
    private boolean esteWiFi;
    private boolean areMicrofon;

    // Constructor fără parametri
    public MiniCamera() {
        super();
        this.rezolutie = "HD";
        this.durataBaterie = 60;
        this.esteInfrarosu = false;
        this.esteWiFi = false;
        this.areMicrofon = false;
    }

    // Constructor cu parametri
    public MiniCamera(String model, String brand, int yearOfManufacture, boolean isOn, double price, String rezolutie, int durataBaterie, boolean esteInfrarosu, boolean esteWiFi, boolean areMicrofon) {
        super(model, brand, yearOfManufacture, isOn, price);
        this.rezolutie = rezolutie;
        this.durataBaterie = durataBaterie;
        this.esteInfrarosu = esteInfrarosu;
        this.esteWiFi = esteWiFi;
        this.areMicrofon = areMicrofon;
    }

    // Constructor de copiere
    public MiniCamera(MiniCamera other) {
        super(other);
        this.rezolutie = other.rezolutie;
        this.durataBaterie = other.durataBaterie;
        this.esteInfrarosu = other.esteInfrarosu;
        this.esteWiFi = other.esteWiFi;
        this.areMicrofon = other.areMicrofon;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + " MiniCamera [rezolutie=" + rezolutie + ", durataBaterie=" + durataBaterie + ", esteInfrarosu=" + esteInfrarosu + ", esteWiFi=" + esteWiFi + ", areMicrofon=" + areMicrofon + "]";
    }

    // Getters și Setters
    public String getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(String rezolutie) {
        this.rezolutie = rezolutie;
    }

    public int getDurataBaterie() {
        return durataBaterie;
    }

    public void setDurataBaterie(int durataBaterie) {
        this.durataBaterie = durataBaterie;
    }

    public boolean isEsteInfrarosu() {
        return esteInfrarosu;
    }

    public void setEsteInfrarosu(boolean esteInfrarosu) {
        this.esteInfrarosu = esteInfrarosu;
    }

    public boolean isEsteWiFi() {
        return esteWiFi;
    }

    public void setEsteWiFi(boolean esteWiFi) {
        this.esteWiFi = esteWiFi;
    }

    public boolean isAreMicrofon() {
        return areMicrofon;
    }

    public void setAreMicrofon(boolean areMicrofon) {
        this.areMicrofon = areMicrofon;
    }
}
