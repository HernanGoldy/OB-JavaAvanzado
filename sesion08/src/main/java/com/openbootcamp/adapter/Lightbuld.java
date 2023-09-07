package com.openbootcamp.adapter;

public class Lightbuld {
    boolean poweredOn = false;
    int voltage = 0;

    // functions
    public void turnOn(int voltage) {
        poweredOn = true;
        this.voltage = voltage;

        System.out.println("Lightbuld poweredOn with " + voltage + " of current.");
    }

    public void turnOff() {
        poweredOn = false;
        this.voltage = 0;

        System.out.println("Lightbuld poweredOff.");
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }
}
