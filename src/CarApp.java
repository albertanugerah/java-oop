public class CarApp {
    public static void main(String[] args) {
        var car1 = new Car("Serie 7","BMW");
//        car1.madeIn = "Geman"; //ERROR
        System.out.println(car1.launchedIn);
        car1.newCar("Serie 5");

        var mercedes = new Car("G Class");
        mercedes.brand = "Merceded-Benz";
        mercedes.newSeries("G-Wagon");

        var toyota = new Car();
        toyota.brand = "Toyota";
        toyota.newSeries("All New Fortuner");
    }
}
