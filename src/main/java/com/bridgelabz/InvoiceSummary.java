package com.bridgelabz;

public class InvoiceSummary {
    private final int numOfRides;
    private final double totalFare;
    private final double averagefare;

    public InvoiceSummary(int numOfRides, double totalfare) {
        this.numOfRides=numOfRides;
        this.totalFare=totalfare;
        this.averagefare = this.totalFare/this.numOfRides;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) obj;
        return numOfRides == that.numOfRides && Double.compare(that.totalFare, totalFare) == 0 && Double.compare(that.averagefare, averagefare) == 0;
    }

}