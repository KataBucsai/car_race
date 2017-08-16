package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Car {


    List<String> carNames = new ArrayList<>(Arrays.asList("Harmony", "Excursion", "Elysium", "Bliss", "Dominion", "Blend", "Crown", "Scorpion", "Ethereal", "Harmony"));
    int distanceTraveled, normalSpeed;
    String name;
    int speedLimit = 200;


    public Car() {
        Random randomizer = new Random();
        String random1 = carNames.get(randomizer.nextInt(carNames.size()));
        String random2 = carNames.get(randomizer.nextInt(carNames.size()));
        this.name = random1 + " " + random2;
        this.normalSpeed = ThreadLocalRandom.current().nextInt(80,  111);
        this.distanceTraveled = 0;
    }

    public String getName() { return name; }

    public int getDistanceTraveled() { return distanceTraveled; }


    public void setSpeedLimit(int limit){
        speedLimit = limit;
    }

    public void moveForAnHour(){

        distanceTraveled += Math.min(normalSpeed, speedLimit);
    }
}