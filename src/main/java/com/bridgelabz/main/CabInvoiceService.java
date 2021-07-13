package com.bridgelabz.main;

public class CabInvoiceService {
    public static final double MAXIMUM_FARE = 5;
    public static final double PER_KILOMETER_COST = 10;
    public static final int PER_MINUTE_COST = 1;

    public double fareCalculator(double distance, int time){
        double totalFare = distance * PER_KILOMETER_COST + time * PER_MINUTE_COST;
        return Math.max(MAXIMUM_FARE, totalFare);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Cab Invoice Generator");
    }
}
