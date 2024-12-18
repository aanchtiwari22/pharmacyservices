package com.pharmacyservices;

public class Prescription {
    private String medicineName;
    private String dosage;
    private int durationInDays;

    public Prescription(String medicineName, String dosage, int durationInDays) {
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.durationInDays = durationInDays;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getDosage() {
        return dosage;
    }

    public int getDurationInDays() {
        return durationInDays;
    }
}
