package com.bridgelabz;

public class InvoiceGenerator {

    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final double MINIMUM_FARE = 5;

    public double calculatefare(double distance , int time) {
        double totalfare =  distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        return Math.max(totalfare, MINIMUM_FARE);
    }
    public InvoiceSummary calculatefare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride:rides) {
            totalFare += this.calculatefare(ride.distance , ride.time);
        }
        return new InvoiceSummary(rides.length,totalFare);
    }
}
