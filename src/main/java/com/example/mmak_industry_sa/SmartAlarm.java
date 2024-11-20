package com.example.mmak_industry_sa;

public class SmartAlarm extends Gadget {
    private boolean esteDetectieMiscare;
    private int volumMaxim; // în decibeli

    public SmartAlarm(String nume, boolean esteDetectieMiscare, int volumMaxim) {
        super(nume, "Alarmă Smart");
        this.esteDetectieMiscare = esteDetectieMiscare;
        this.volumMaxim = volumMaxim;
    }

    public boolean isEsteDetectieMiscare() {
        return esteDetectieMiscare;
    }

    public void setEsteDetectieMiscare(boolean esteDetectieMiscare) {
        this.esteDetectieMiscare = esteDetectieMiscare;
    }

    public int getVolumMaxim() {
        return volumMaxim;
    }

    public void setVolumMaxim(int volumMaxim) {
        this.volumMaxim = volumMaxim;
    }

    @Override
    public String toString() {
        return super.toString() + " | Detectie miscare: " + (esteDetectieMiscare ? "Da" : "Nu") + " | Volum maxim: " + volumMaxim + " dB";
    }
}