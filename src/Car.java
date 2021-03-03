class Car {
    String name;
    String brand;
    final String launchedIn = "Eropa";

//    membuat constructor
    Car(String carName, String carBrand){
        name = carName;
        brand = carBrand;
    }

//    constuctor overloading = membuat lebih dari 1 constructor, syaratnya harus berbeda nama / jumlah parameter
    Car(String carName){
        this(carName,null);
    }
//    constructor tanpa parameter
    Car(){
        this(null);
    }

    void newCar(String carName){
        System.out.println(brand + " launching new car with the name, " + carName + " Launched in " + launchedIn  );
    }

    void newSeries(String carSeries){
        System.out.println( carSeries + " is Car Series in " + brand);
    }
}
