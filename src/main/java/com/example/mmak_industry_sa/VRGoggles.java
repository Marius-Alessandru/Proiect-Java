package com.example.mmak_industry_sa;

public class VRGoggles extends Gadget {
    private boolean areCamera;

    public VRGoggles(String nume, boolean areCamera) {
        super(nume, "Ochelari VR");
        this.areCamera = areCamera;
    }

    public boolean isAreCamera() {
        return areCamera;
    }

    public void setAreCamera(boolean areCamera) {
        this.areCamera = areCamera;
    }

    @Override
    public String toString() {
        return super.toString() + " | Are cameră: " + (areCamera ? "Da" : "Nu");
    }
}