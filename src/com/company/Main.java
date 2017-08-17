package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static List<Car> cars = new LinkedList<>();
    static List<Motorcycle> motorcycles = new LinkedList<>();
    static List<Truck> trucks = new LinkedList<>();

    public static void main(String[] args) {
        createVehicles();
        simulateRace();
        printRaceResults();
    }

    public static void createVehicles(){
        for (int i=0; i<10; i++){
            Car car = new Car();
            Motorcycle motor = new Motorcycle();
            Truck truck = new Truck();
            cars.add(car);
            motorcycles.add(motor);
            trucks.add(truck);
        }
    }

    public static void simulateRace(){
        int isLimitChance, isRaining, isBreakDownChance;
        for (int i=0; i<50; i++){
           isLimitChance = ThreadLocalRandom.current().nextInt(0,  101);
           for (Car car: cars){
               if (isLimitChance < 30){
                   car.setSpeedLimit(70);
               }
               car.moveForAnHour();
               car.setSpeedLimit(200);
           }

            isRaining = ThreadLocalRandom.current().nextInt(0,  101);
            for (Motorcycle motor: motorcycles){
                if (isRaining < 30){
                    int tempSpeed = ThreadLocalRandom.current().nextInt(50,  96);
                    motor.setSpeedLimit(tempSpeed);
                }
                motor.moveForAnHour();
                motor.setSpeedLimit(200);
            }

            for (Truck truck: trucks){
                isBreakDownChance = ThreadLocalRandom.current().nextInt(0,  101);
                int breakdownTurnsLeft;
                breakdownTurnsLeft = truck.getBreakdownTurnsLeft();
                if (breakdownTurnsLeft == 0){
                    if (isBreakDownChance < 5){
                        truck.setBreakdownTurnsLeft(1);
                    } else {
                        truck.moveForAnHour();
                    }
                } else {
                    truck.setBreakdownTurnsLeft(0);
                }
            }
        }
    }

    public static void printRaceResults(){
        for (Car car: cars){
            System.out.format("%s %s Car%n", car.getName(), car.getDistanceTraveled());
        }
        for (Motorcycle motor: motorcycles){
            System.out.format("%s %s Motorcycle%n", motor.getName(), motor.getDistanceTraveled());        }
        for (Truck truck: trucks){
            System.out.format("%s %s Truck%n", truck.getName(), truck.getDistanceTraveled());
        }
    }
}
