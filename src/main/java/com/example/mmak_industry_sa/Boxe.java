package com.example.mmak_industry_sa;

public class Boxe extends Gadget {
    private int putere; // Puterea boxei în wați
    private boolean bluetooth; // Dacă are suport Bluetooth

    // Constructor
    public Boxe(String nume, int putere, boolean bluetooth) {
        super(nume, "Boxe"); // Apelăm constructorul clasei de bază Gadget
        this.putere = putere;
        this.bluetooth = bluetooth;
    }

    // Getter pentru putere
    public int getPutere() {
        return putere;
    }

    // Setter pentru putere
    public void setPutere(int putere) {
        this.putere = putere;
    }

    // Suprascrierea metodei toString
    @Override
    public String toString() {
        return "Boxe: " + getNume() +
                " | Putere: " + putere + "W" +
                " | Bluetooth: " + (bluetooth ? "Da" :"Nu");
}
}