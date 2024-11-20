package com.example.mmak_industry_sa;
public class PortableSpeakers extends Gadget {
    private int numberOfSpeakers;
    private boolean hasBluetooth;
    private int maxVolume;
    private String speakerType;
    private boolean isWaterproof;

    // Constructor fără parametri
    public PortableSpeakers() {
        super();
        this.numberOfSpeakers = 2;
        this.hasBluetooth = false;
        this.maxVolume = 100;
        this.speakerType = "Portable";
        this.isWaterproof = false;
    }

    // Constructor cu parametri
    public PortableSpeakers(String model, String brand, int yearOfManufacture, boolean isOn, double price, int numberOfSpeakers, boolean hasBluetooth, int maxVolume, String speakerType, boolean isWaterproof) {
        super(model, brand, yearOfManufacture, isOn, price);
        this.numberOfSpeakers = numberOfSpeakers;
        this.hasBluetooth = hasBluetooth;
        this.maxVolume = maxVolume;
        this.speakerType = speakerType;
        this.isWaterproof = isWaterproof;
    }

    // Constructor de copiere
    public PortableSpeakers(PortableSpeakers other) {
        super(other);
        this.numberOfSpeakers = other.numberOfSpeakers;
        this.hasBluetooth = other.hasBluetooth;
        this.maxVolume = other.maxVolume;
        this.speakerType = other.speakerType;
        this.isWaterproof = other.isWaterproof;
    }

    // Metoda toString
    @Override
    public String toString() {
        return super.toString() + " Speakers [numberOfSpeakers=" + numberOfSpeakers + ", hasBluetooth=" + hasBluetooth + ", maxVolume=" + maxVolume + ", speakerType=" + speakerType + ", isWaterproof=" + isWaterproof + "]";
    }

    // Getters și Setters
    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public String getSpeakerType() {
        return speakerType;
    }

    public void setSpeakerType(String speakerType) {
        this.speakerType = speakerType;
    }

    public boolean isWaterproof() {
        return isWaterproof;
    }

    public void setWaterproof(boolean waterproof) {
        isWaterproof = waterproof;
    }
}
