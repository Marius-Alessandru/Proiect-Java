package com.example.mmak_industry_sa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creăm obiecte pentru fiecare clasă derivată din Gadget
        VRGoggles ochelariVR = new VRGoggles("Ochelari VR", true);
        PortableSpeaker boxaPortabila = new PortableSpeaker("Boxă Portabilă JBL", 12, true);
        SmartAlarm alarmaSmart = new SmartAlarm("Alarmă Smart", true, 120);
        SmartPlug prizaSmart = new SmartPlug("Priză Smart TP-Link", 2500, true);
        MiniCamera miniCamera = new MiniCamera("Mini Cameră Video", 8, true);
        Reportofon reportofon = new Reportofon("Reportofon Sony", 32, true);
        Casti casti = new Casti("Căști Bose", "Bluetooth", true);

        // Creăm un ArrayList pentru a stoca toate gadgeturile
        ArrayList<Gadget> gadgeturi = new ArrayList<>();
        gadgeturi.add(ochelariVR);
        gadgeturi.add(boxaPortabila);
        gadgeturi.add(alarmaSmart);
        gadgeturi.add(prizaSmart);
        gadgeturi.add(miniCamera);
        gadgeturi.add(reportofon);
        gadgeturi.add(casti);

        // Afișăm informațiile fiecărui gadget folosind metoda toString
        for (Gadget gadget : gadgeturi) {
            System.out.println(gadget);
        }
    }
}