package com.company;

public class Motorcycle {
    int distanceTraveled, normalSpeed;
    String name;
    static int nameNumber = 1;
    int speedLimit = 200;

    public Motorcycle(){
        this.name = "Motorcycle" + nameNumber;
        nameNumber++;
        this.normalSpeed = 100;
        this.distanceTraveled = 0;
    }

    public String getName() { return name; }

    public int getDistanceTraveled() { return distanceTraveled; }

    public void setSpeedLimit(int limit){ speedLimit = limit; }

    public void moveForAnHour(){
        distanceTraveled += Math.min(normalSpeed, speedLimit);
    }

}
