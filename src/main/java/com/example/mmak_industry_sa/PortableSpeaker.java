package com.example.mmak_industry_sa;
public class PortableSpeaker extends Gadget {
    private int durataBaterie; // în ore
    private boolean areBluetooth;

    public PortableSpeaker(String nume, int durataBaterie, boolean areBluetooth) {
        super(nume, "Boxă Portabilă");
        this.durataBaterie = durataBaterie;
        this.areBluetooth = areBluetooth;
    }

    public int getDurataBaterie() {
        return durataBaterie;
    }

    public void setDurataBaterie(int durataBaterie) {
        this.durataBaterie = durataBaterie;
    }

    public boolean isAreBluetooth() {
        return areBluetooth;
    }

    public void setAreBluetooth(boolean areBluetooth) {
        this.areBluetooth = areBluetooth;
    }

    @Override
    public String toString() {
        return super.toString() + " | Durata baterie: " + durataBaterie + " ore | Bluetooth: " + (areBluetooth ? "Da" : "Nu");
    }
}