package org.example;

public class Car implements ICar {
    public void start() {
        System.out.println("car is starting");
    }

    public void stop() {
        System.out.println("car is stopping");
    }

    public void accelerate() {
        System.out.println("car is accelerating");
    }

    public void brake() {
        System.out.println("car is braking");
    }

    public void honk() {
        System.out.println("car is honking");
    }
}
