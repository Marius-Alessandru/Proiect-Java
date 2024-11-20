package com.example.mmak_industry_sa;

public class Casti extends Gadget {
    private String tip;
    private int autonomieBaterie;
    private boolean suntBluetooth;
    private boolean suntNoiseCanceling;

    // Constructor fără parametri
    public Casti() {
        super();
        this.tip = "Over-Ear";
        this.autonomieBaterie = 10;
        this.suntBluetooth = true;
        this.suntNoiseCanceling = false;
    }

    // Constructor cu parametri
    public Casti(String model, String brand, int yearOfManufacture, boolean isOn, double price, String tip, int autonomieBaterie, boolean suntBluetooth, boolean suntNoiseCanceling) {
        super(model, brand, yearOfManufacture, isOn, price);
        this.tip = tip;
        this.autonomieBaterie = autonomieBaterie;
        this.suntBluetooth = suntBluetooth;
        this.suntNoiseCanceling = suntNoiseCanceling;
    }

    // Constructor de copiere
    public Casti(Casti other) {
        super(other);
        this.tip = other.tip;
        this.autonomieBaterie = other.autonomieBaterie;
        this.suntBluetooth = other.suntBluetooth;
        this.suntNoiseCanceling = other.suntNoiseCanceling;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + " Casti [tip=" + tip + ", autonomieBaterie=" + autonomieBaterie + ", suntBluetooth=" + suntBluetooth + ", suntNoiseCanceling=" + suntNoiseCanceling + "]";
    }

    // Getters și Setters
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getAutonomieBaterie() {
        return autonomieBaterie;
    }

    public void setAutonomieBaterie(int autonomieBaterie) {
        this.autonomieBaterie = autonomieBaterie;
    }

    public boolean isSuntBluetooth() {
        return suntBluetooth;
    }

    public void setSuntBluetooth(boolean suntBluetooth) {
        this.suntBluetooth = suntBluetooth;
    }

    public boolean isSuntNoiseCanceling() {
        return suntNoiseCanceling;
    }

    public void setSuntNoiseCanceling(boolean suntNoiseCanceling) {
        this.suntNoiseCanceling = suntNoiseCanceling;
    }
}
