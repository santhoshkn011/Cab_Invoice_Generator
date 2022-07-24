package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {
    @Test
    public void given_DistanceAndTime_ShouldReturn_TotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 5.0; //distance in kilometers
        int time = 10; //time in minutes
        double fare = invoiceGenerator.calculatefare(distance, time); //Total fare calculations
        Assertions.assertEquals(60 , fare);
    }
}
