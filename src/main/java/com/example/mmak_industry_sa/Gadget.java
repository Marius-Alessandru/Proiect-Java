package com.example.mmak_industry_sa;
public class Gadget {
    private String nume;
    private String tipGadget;

    public Gadget(String nume, String tipGadget) {
        this.nume = nume;
        this.tipGadget = tipGadget;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTipGadget() {
        return tipGadget;
    }

    public void setTipGadget(String tipGadget) {
        this.tipGadget = tipGadget;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + " | Tip: " + tipGadget;
    }
}