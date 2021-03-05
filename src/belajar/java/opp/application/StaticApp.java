package belajar.java.opp.application;

import static belajar.java.opp.data.Application.*;
import static  belajar.java.opp.data.Constant.*;
import belajar.java.opp.data.Country;
import belajar.java.opp.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5)
        );

        Country.City city = new Country.City();
        city.setName("Kreo");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
