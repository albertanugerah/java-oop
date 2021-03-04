package belajar.java.opp.application;

import belajar.java.opp.data.Motor;
import belajar.java.opp.data.Nmax;

public class MotorApp {
    public static void main(String[] args) {


        Motor motor = new Nmax();
        System.out.println("Motor beroda " + motor.getRoda());
        motor.drive();
    }
}
