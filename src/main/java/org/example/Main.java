
package org.example;
/*
* Homework Assignment Due 7/8 11:59pm
*
* Create the following classes and implement interfaces for each class. After creating them, be sure to instantiate
* each one and run ALL of the methods inside. Each class must have at least 5 methods.
* The methods can do whatever you want, even if it's just printing
*
* public class Animal
* public class Person
* public class Car
* public class Train
*
*
* Remember each one will have 5 methods at least, and each must have an interface. For Car
*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        Animal myAnimal = new Animal();
        myAnimal.eat();
        myAnimal.sleep();
        myAnimal.makeSound();
        myAnimal.run();
        myAnimal.jump();

        Person myPerson = new Person();
        myPerson.walk();
        myPerson.talk();
        myPerson.eat();
        myPerson.sleep();
        myPerson.work();

        Car myCar = new Car();
        myCar.start();
        myCar.stop();
        myCar.accelerate();
        myCar.brake();
        myCar.honk();

        Train myTrain = new Train();
        myTrain.start();
        myTrain.stop();
        myTrain.accelerate();
        myTrain.brake();
        myTrain.whistle();
    }
}
