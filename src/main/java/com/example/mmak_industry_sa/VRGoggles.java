package com.example.mmak_industry_sa;

public class VRGoggles extends Gadget {
    private boolean esteCompatibilCuPC;
    private boolean esteCompatibilCuConsole;
    private boolean areSenzoriDeMiscare;
    private int rezolutie;
    private boolean areFurnizorAudio;

    // Constructor fără parametri
    public VRGoggles() {
        super();
        this.esteCompatibilCuPC = false;
        this.esteCompatibilCuConsole = false;
        this.areSenzoriDeMiscare = true;
        this.rezolutie = 1080;
        this.areFurnizorAudio = false;
    }

    // Constructor cu parametri
    public VRGoggles(String model, String brand, int yearOfManufacture, boolean isOn, double price, boolean esteCompatibilCuPC, boolean esteCompatibilCuConsole, boolean areSenzoriDeMiscare, int rezolutie, boolean areFurnizorAudio) {
        super(model, brand, yearOfManufacture, isOn, price);
        this.esteCompatibilCuPC = esteCompatibilCuPC;
        this.esteCompatibilCuConsole = esteCompatibilCuConsole;
        this.areSenzoriDeMiscare = areSenzoriDeMiscare;
        this.rezolutie = rezolutie;
        this.areFurnizorAudio = areFurnizorAudio;
    }

    // Constructor de copiere
    public VRGoggles(VRGoggles other) {
        super(other);
        this.esteCompatibilCuPC = other.esteCompatibilCuPC;
        this.esteCompatibilCuConsole = other.esteCompatibilCuConsole;
        this.areSenzoriDeMiscare = other.areSenzoriDeMiscare;
        this.rezolutie = other.rezolutie;
        this.areFurnizorAudio = other.areFurnizorAudio;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + " VRGoggles [esteCompatibilCuPC=" + esteCompatibilCuPC + ", esteCompatibilCuConsole=" + esteCompatibilCuConsole + ", areSenzoriDeMiscare=" + areSenzoriDeMiscare + ", rezolutie=" + rezolutie + ", areFurnizorAudio=" + areFurnizorAudio + "]";
    }

    // Getters și Setters
    public boolean isEsteCompatibilCuPC() {
        return esteCompatibilCuPC;
    }

    public void setEsteCompatibilCuPC(boolean esteCompatibilCuPC) {
        this.esteCompatibilCuPC = esteCompatibilCuPC;
    }

    public boolean isEsteCompatibilCuConsole() {
        return esteCompatibilCuConsole;
    }

    public void setEsteCompatibilCuConsole(boolean esteCompatibilCuConsole) {
        this.esteCompatibilCuConsole = esteCompatibilCuConsole;
    }

    public boolean isAreSenzoriDeMiscare() {
        return areSenzoriDeMiscare;
    }

    public void setAreSenzoriDeMiscare(boolean areSenzoriDeMiscare) {
        this.areSenzoriDeMiscare = areSenzoriDeMiscare;
    }

    public int getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }

    public boolean isAreFurnizorAudio() {
        return areFurnizorAudio;
    }

    public void setAreFurnizorAudio(boolean areFurnizorAudio) {
        this.areFurnizorAudio = areFurnizorAudio;
    }
}
