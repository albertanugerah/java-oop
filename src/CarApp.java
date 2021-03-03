public class CarApp {
    public static void main(String[] args) {
        var car1 = new Car();

        car1.name = "Serie 7";
        car1.brand = "BMW";
//        car1.madeIn = "Geman"; //ERROR

        System.out.println(car1.name);
        System.out.println(car1.brand);
        System.out.println(car1.launchedIn);

        car1.newCar("Serie 5");

        var mercedes = new Car();
        mercedes.name = "G Class";
        mercedes.brand = "Mercedes-Benz";
        mercedes.newSeries("G-Wagon");

        var toyota = new Car();
        toyota.brand = "Toyota";
        toyota.newSeries("All New Fortuner");


    }
}
