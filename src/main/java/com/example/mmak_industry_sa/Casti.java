package com.example.mmak_industry_sa;

public class Casti extends Gadget {
    private String tipConectivitate; // "Bluetooth" sau "Cablu"
    private boolean esteRezistenteLaApa;

    public Casti(String nume, String tipConectivitate, boolean esteRezistenteLaApa) {
        super(nume, "Căști");
        this.tipConectivitate = tipConectivitate;
        this.esteRezistenteLaApa = esteRezistenteLaApa;
    }

    public String getTipConectivitate() {
        return tipConectivitate;
    }

    public void setTipConectivitate(String tipConectivitate) {
        this.tipConectivitate = tipConectivitate;
    }

    public boolean isEsteRezistenteLaApa() {
        return esteRezistenteLaApa;
    }

    public void setEsteRezistenteLaApa(boolean esteRezistenteLaApa) {
        this.esteRezistenteLaApa = esteRezistenteLaApa;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tip conectivitate: " + tipConectivitate + " | Rezistente la apă: " + (esteRezistenteLaApa ? "Da" : "Nu");
    }
}