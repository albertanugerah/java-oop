public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();

        person1.name = "Albert";
        person1.address = "Kreo";
//        person1.country = "Singapore";//ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person();

        Person person3;
        person3 = new Person();
    }
}
