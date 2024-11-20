package com.example.mmak_industry_sa;

public class Main {
    public static void main(String[] args) {
        // Creăm obiecte din clasele tale
        Boxe boxe1 = new Boxe("ModelBoxe1", "Brand1", 2023, true, 150.5, "Bluetooth", true, 50, false, true);
        Casti casti1 = new Casti("ModelCasti1", "Brand2", 2022, false, 99.9, "Wireless", 10, true, true);
        MiniCamera miniCamera1 = new MiniCamera("ModelCamera1", "Brand3", 2021, true, 200.0, "HD", 720, true, true, true);
        Reportofon reportofon1 = new Reportofon("ModelReportofon1", "Brand4", 2024, false, 120.0, "Standing", true, true, false, false);
        SmartAlarm smartAlarm1 = new SmartAlarm("ModelSmartAlarm1", "Brand5", 2025, true, 250.5, true, 100,  "Wi-Fi", true, true);
        SmartPlug smartPlug1 = new SmartPlug("ModelSmartPlug1", "Brand6", 2023, false, 80.0, true, true, 528 , false, false);
        VRGoggles vrGoggles1 = new VRGoggles("ModelVR1", "Brand7", 2022, true, 400.0, true, true, true, 1440, true);
        // Afișăm obiectele folosind metoda toString()
        System.out.println(boxe1.toString());
        System.out.println(casti1.toString());
        System.out.println(miniCamera1.toString());
        System.out.println(reportofon1.toString());
        System.out.println(smartAlarm1.toString());
        System.out.println(smartPlug1.toString());
        System.out.println(vrGoggles1.toString());

        // Afișăm din nou cu noile date
        System.out.println("\nDupă modificări:");
        System.out.println(boxe1.toString());
        System.out.println(casti1.toString());
        System.out.println(miniCamera1.toString());
    }
}