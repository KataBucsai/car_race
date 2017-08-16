package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static List<Car> cars = new LinkedList<>();
    static List<Motorcycle> motorcycles = new LinkedList<>();
    static List<Truck> trucks = new LinkedList<>();

    public static void main(String[] args) {
        createVehicles();
        System.out.println(cars);
        //simulateRace();
        //printRaceResults();
    }

    public static void createVehicles(){
        for (int i=0; i<10; i++){
            Car car = new Car();
            //Motorcycle motor = new Motorcycle();
            //Truck truck = new Truck();
            cars.add(car);
            //motorcycles.add(motor);
            //trucks.add(truck);
        }
    }

    public static void simulateRace(){
        int isRaining;
        for (int i=0; i<50; i++){
           isRaining = ThreadLocalRandom.current().nextInt(0,  101);
           for (Car car: cars){
               if (isRaining < 30){
                   car.setSpeedLimit(70);
               }
               car.moveForAnHour();
               car.setSpeedLimit(200);
           }
        }

    }

    public static void printRaceResults(){

    }
}
