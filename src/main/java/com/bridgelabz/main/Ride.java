package com.bridgelabz.main;

public class Ride {
    public double distance;
    public int time;

    @Override
    public String toString() {
        return "Ride{" +
                "distance=" + distance +
                ", time=" + time +
                '}';
    }

    public Ride(double distance, int time){
        this.distance = distance;
        this.time = time;
    }
}
