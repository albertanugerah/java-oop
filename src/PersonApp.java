public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Albet","Kreo");

//        person1.country = "Singapore";//ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);


        person1.sayHello("Tassha");

        Person person2 = new Person("Tassha","Ciledug");

        Person person3;
        person3 = new Person("Andre","Jakarta");

        person3.sayHello("Tassha");
    }
}
