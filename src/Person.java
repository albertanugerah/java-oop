class Person {
    String name;
    String address;
    final String country = "Indonesia";
//    final adalah kata kunci untuk menandakan tidak bisa diubah data/valuenya, dan langsung di deklarasikan"

//    membuat construct
    Person(String name, String address){
        name = name;
        address = address;
    }

//    constructor overloading
    Person(String paramName){
        this(paramName,null);
    }

//    constructor tanpa parameter
    Person(){
        this(null);
    }



    void sayHello(String name){
        System.out.println("Hello "+ name + ", My name is " + name);
    }
}
