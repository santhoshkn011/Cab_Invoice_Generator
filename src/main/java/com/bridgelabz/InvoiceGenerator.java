package com.bridgelabz;

public class InvoiceGenerator {
    private static final int RS_PER_MINUTE = 1; //min cost per minute
    private static final double RS_PER_KILOMETER = 10; //min cost per kilometer
    //method to calculate total fare
    public double calculatefare(double distance , int time) {
        //calculation of total fare
        return distance * RS_PER_KILOMETER + time * RS_PER_MINUTE;
    }
    //method to calculate multiple rides
    public double calculatefare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride:rides) {
            totalFare += this.calculatefare(ride.distance , ride.time);
        }
        return totalFare;
    }
}
