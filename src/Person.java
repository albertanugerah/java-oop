class Person {
    String name;
    String address;
    final String country = "Indonesia";
//    final adalah kata kunci untuk menandakan tidak bisa diubah data/valuenya, dan langsung di deklarasikan"

//    membuat construct
    Person(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

//    constructor overloading
    Person(String paramName){
        this(paramName,null);
    }

//    constructor tanpa parameter
    Person(){
        this(null);
    }



    void sayHello(String paramName){
        System.out.println("Hello "+ paramName + ", My name is " + name);
    }
}
