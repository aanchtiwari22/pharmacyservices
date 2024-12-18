package com.pharmacyservices;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrescriptionServiceTest {
    @Test
    public void testPrescriptionCreation() {
        Prescription prescription = new Prescription("Amoxicillin", "500mg", 7);
        assertEquals("Amoxicillin", prescription.getMedicineName());
    }
}
