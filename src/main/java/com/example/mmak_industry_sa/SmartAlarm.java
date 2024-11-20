package com.example.mmak_industry_sa;

public class SmartAlarm extends Gadget {
    private boolean estePeWiFi;
    private int volum;
    private String tipSenzor;
    private boolean esteAudio;
    private boolean areBaterieDeRezerva;

    // Constructor fără parametri
    public SmartAlarm() {
        super();
        this.estePeWiFi = false;
        this.volum = 50;
        this.tipSenzor = "Mișcare";
        this.esteAudio = true;
        this.areBaterieDeRezerva = true;
    }

    // Constructor cu parametri
    public SmartAlarm(String model, String brand, int yearOfManufacture, boolean isOn, double price, boolean estePeWiFi, int volum, String tipSenzor, boolean esteAudio, boolean areBaterieDeRezerva) {
        super(model, brand, yearOfManufacture, isOn, price);
        this.estePeWiFi = estePeWiFi;
        this.volum = volum;
        this.tipSenzor = tipSenzor;
        this.esteAudio = esteAudio;
        this.areBaterieDeRezerva = areBaterieDeRezerva;
    }

    // Constructor de copiere
    public SmartAlarm(SmartAlarm other) {
        super(other);
        this.estePeWiFi = other.estePeWiFi;
        this.volum = other.volum;
        this.tipSenzor = other.tipSenzor;
        this.esteAudio = other.esteAudio;
        this.areBaterieDeRezerva = other.areBaterieDeRezerva;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + " SmartAlarm [estePeWiFi=" + estePeWiFi + ", volum=" + volum + ", tipSenzor=" + tipSenzor + ", esteAudio=" + esteAudio + ", areBaterieDeRezerva=" + areBaterieDeRezerva + "]";
    }

    // Getters și Setters
    public boolean isEstePeWiFi() {
        return estePeWiFi;
    }

    public void setEstePeWiFi(boolean estePeWiFi) {
        this.estePeWiFi = estePeWiFi;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public String getTipSenzor() {
        return tipSenzor;
    }

    public void setTipSenzor(String tipSenzor) {
        this.tipSenzor = tipSenzor;
    }

    public boolean isEsteAudio() {
        return esteAudio;
    }

    public void setEsteAudio(boolean esteAudio) {
        this.esteAudio = esteAudio;
    }

    public boolean isAreBaterieDeRezerva() {
        return areBaterieDeRezerva;
    }

    public void setAreBaterieDeRezerva(boolean areBaterieDeRezerva) {
        this.areBaterieDeRezerva = areBaterieDeRezerva;
    }
}
