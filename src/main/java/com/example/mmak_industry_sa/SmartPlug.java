package com.example.mmak_industry_sa;

public class SmartPlug extends Gadget {
    private int putereMaxima; // în wați
    private boolean areWiFi;

    public SmartPlug(String nume, int putereMaxima, boolean areWiFi) {
        super(nume, "Priză Smart");
        this.putereMaxima = putereMaxima;
        this.areWiFi = areWiFi;
    }

    public int getPutereMaxima() {
        return putereMaxima;
    }

    public void setPutereMaxima(int putereMaxima) {
        this.putereMaxima = putereMaxima;
    }

    public boolean isAreWiFi() {
        return areWiFi;
    }

    public void setAreWiFi(boolean areWiFi) {
        this.areWiFi = areWiFi;
    }

    @Override
    public String toString() {
        return super.toString() + " | Putere maximă: " + putereMaxima + "W | WiFi: " + (areWiFi ? "Da" : "Nu");
    }
}