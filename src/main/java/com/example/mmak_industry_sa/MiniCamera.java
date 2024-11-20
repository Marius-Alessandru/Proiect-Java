package com.example.mmak_industry_sa;

public class MiniCamera extends Gadget {
    private int rezolutie; // în megapixeli
    private boolean areInfrarosu;

    public MiniCamera(String nume, int rezolutie, boolean areInfrarosu) {
        super(nume, "Mini Camera Video");
        this.rezolutie = rezolutie;
        this.areInfrarosu = areInfrarosu;
    }

    public int getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }

    public boolean isAreInfrarosu() {
        return areInfrarosu;
    }

    public void setAreInfrarosu(boolean areInfrarosu) {
        this.areInfrarosu = areInfrarosu;
    }

    @Override
    public String toString() {
        return super.toString() + " | Rezolutie: " + rezolutie + " MP | Infrarosu: " + (areInfrarosu ? "Da" : "Nu");
    }
}