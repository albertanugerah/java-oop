class Car {
    String name;
    String brand;
    final String launchedIn = "Eropa";

//    membuat constructor
    Car(String name, String brand){
        this.name = name;
        this.brand = brand;
    }

//    constuctor overloading = membuat lebih dari 1 constructor, syaratnya harus berbeda nama / jumlah parameter
    Car(String carName){
        this(carName,null);
    }
//    constructor tanpa parameter
    Car(){
        this(null);
    }

    void newCar(String name){
        System.out.println(this.brand + " launching new car with the name, " + name + " Launched in " + launchedIn  );
    }

    void newSeries(String carSeries){
        System.out.println( carSeries + " is Car Series in " + this.brand);
    }
}
