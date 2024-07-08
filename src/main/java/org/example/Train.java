package org.example;

public class Train implements ITrain {
    public void start() {
        System.out.println("train is starting");
    }

    public void stop() {
        System.out.println("train is stopping");
    }

    public void accelerate() {
        System.out.println("train is accelerating");
    }

    public void brake() {
        System.out.println("train is braking");
    }

    public void whistle() {
        System.out.println("train is whistling");
    }
}

