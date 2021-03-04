package belajar.java.opp.application;

import belajar.java.opp.data.City;
import belajar.java.opp.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); //ERROR

//        var location = new Location(); ERROR
        var city = new City();
        city.name = "jakarta";
        System.out.println(city.name);

    }
}
