package belajar.java.opp.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Albert";
        first += " " + "Anugerah";

        System.out.println(first);

        String second = "Albert Anugerah";
        System.out.println(second);

        System.out.println(first.equals(second));


        String third = "Albert Anugerah";
        System.out.println(second.equals(third));
    }
}
