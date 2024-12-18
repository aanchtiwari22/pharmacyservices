package com.pharmacyservices;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class APITest {
    @Test
    public void testCreatePrescriptionAPI() {
        given()
            .header("Content-Type", "application/json")
            .body("{ \"medicine\": \"Amoxicillin\", \"dosage\": \"500mg\" }")
        .when()
            .post("http://localhost:8080/api/v1/createPrescription")
        .then()
            .statusCode(200) 
            .body("status", equalTo("success"));
    }
}
