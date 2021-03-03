class Person {
    String name;
    String address;
    final String country = "Indonesia";
//    final adalah kata kunci untuk menandakan tidak bisa diubah data/valuenya, dan langsung di deklarasikan"


    void sayHello(String paramName){
        System.out.println("Hello "+ paramName + ", My name is " + name);
    }
}
