package com.example.mmak_industry_sa;

public class Reportofon extends Gadget {
    private int capacitateStocare; // în GB
    private boolean functieReducereZgomot;

    public Reportofon(String nume, int capacitateStocare, boolean functieReducereZgomot) {
        super(nume, "Reportofon");
        this.capacitateStocare = capacitateStocare;
        this.functieReducereZgomot = functieReducereZgomot;
    }

    public int getCapacitateStocare() {
        return capacitateStocare;
    }

    public void setCapacitateStocare(int capacitateStocare) {
        this.capacitateStocare = capacitateStocare;
    }

    public boolean isFunctieReducereZgomot() {
        return functieReducereZgomot;
    }

    public void setFunctieReducereZgomot(boolean functieReducereZgomot) {
        this.functieReducereZgomot = functieReducereZgomot;
    }

    @Override
    public String toString() {
        return super.toString() + " | Capacitate stocare: " + capacitateStocare + "GB | Reducere zgomot: " + (functieReducereZgomot ? "Da" : "Nu");
    }
}