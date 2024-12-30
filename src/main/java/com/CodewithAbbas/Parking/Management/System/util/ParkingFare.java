package com.CodewithAbbas.Parking.Management.System.util;

public enum ParkingFare {

    PerHourFare(5), PerDayFare(10);

    private int value;
    private ParkingFare(int value){
        this.value=value;
    }
    public int getFare() {
        return this.value;
    }
}
