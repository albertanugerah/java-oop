package belajar.java.opp.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bus drive");
    }


    public int getTire() {
        return 12;
    }


    public String getBrand() {
        return "Scania";
    }


    public boolean isMaintenance() {
        return false;
    }


    public boolean isBig() {
        return true;
    }
}
