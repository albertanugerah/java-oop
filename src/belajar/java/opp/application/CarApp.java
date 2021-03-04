package belajar.java.opp.application;

import belajar.java.opp.data.Avanza;
import belajar.java.opp.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
