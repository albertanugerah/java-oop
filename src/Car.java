class Car {
    String name;
    String brand;
    final String launchedIn = "Eropa";

    void newCar(String carName){
        System.out.println(brand + " launching new car with the name, " + carName + " Launched in " + launchedIn  );
    }

    void newSeries(String carSeries){
        System.out.println( carSeries + " is Car Series in " + brand);
    }
}
