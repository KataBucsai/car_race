package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Truck {
    int distanceTraveled, normalSpeed, breakdownTurnsLeft;
    String name;
    static int nameNumber;
    int speedLimit = 200;

    public Truck(){
        nameNumber = ThreadLocalRandom.current().nextInt(0,  1001);
        this.name = "" + nameNumber;
        this.normalSpeed = 100;
        this.distanceTraveled = 0;
        this.breakdownTurnsLeft = 0;
    }

    public String getName() { return name; }

    public int getDistanceTraveled() { return distanceTraveled; }

    public int getBreakdownTurnsLeft() { return breakdownTurnsLeft; }

    public void setBreakdownTurnsLeft(int breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }

    public void moveForAnHour(){
        distanceTraveled += normalSpeed;
    }
}
