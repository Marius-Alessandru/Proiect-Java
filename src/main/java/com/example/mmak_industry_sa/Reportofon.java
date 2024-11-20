package com.example.mmak_industry_sa;

public class Reportofon extends Gadget {
    private String tipMicrofon;
    private boolean areInregistrareVocale;
    private boolean areEcran;
    private boolean esteModular;
    private boolean areWireless;

    // Constructor fără parametri
    public Reportofon() {
        super();
        this.tipMicrofon = "Standard";
        this.areInregistrareVocale = false;
        this.areEcran = false;
        this.esteModular = false;
        this.areWireless = false;
    }

    // Constructor cu parametri
    public Reportofon(String model, String brand, int yearOfManufacture, boolean isOn, double price, String tipMicrofon, boolean areInregistrareVocale, boolean areEcran, boolean esteModular, boolean areWireless) {
        super(model, brand, yearOfManufacture, isOn, price);
        this.tipMicrofon = tipMicrofon;
        this.areInregistrareVocale = areInregistrareVocale;
        this.areEcran = areEcran;
        this.esteModular = esteModular;
        this.areWireless = areWireless;
    }

    // Constructor de copiere
    public Reportofon(Reportofon other) {
        super(other);
        this.tipMicrofon = other.tipMicrofon;
        this.areInregistrareVocale = other.areInregistrareVocale;
        this.areEcran = other.areEcran;
        this.esteModular = other.esteModular;
        this.areWireless = other.areWireless;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + " Reportofon [tipMicrofon=" + tipMicrofon + ", areInregistrareVocale=" + areInregistrareVocale + ", areEcran=" + areEcran + ", esteModular=" + esteModular + ", areWireless=" + areWireless + "]";
    }

    // Getters și Setters
    public String getTipMicrofon() {
        return tipMicrofon;
    }

    public void setTipMicrofon(String tipMicrofon) {
        this.tipMicrofon = tipMicrofon;
    }

    public boolean isAreInregistrareVocale() {
        return areInregistrareVocale;
    }

    public void setAreInregistrareVocale(boolean areInregistrareVocale) {
        this.areInregistrareVocale = areInregistrareVocale;
    }

    public boolean isAreEcran() {
        return areEcran;
    }

    public void setAreEcran(boolean areEcran) {
        this.areEcran = areEcran;
    }

    public boolean isEsteModular() {
        return esteModular;
    }

    public void setEsteModular(boolean esteModular) {
        this.esteModular = esteModular;
    }

    public boolean isAreWireless() {
        return areWireless;
    }

    public void setAreWireless(boolean areWireless) {
        this.areWireless = areWireless;
    }
}
