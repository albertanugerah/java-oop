public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();

        person1.name = "Albert";
        person1.address = "Kreo";
//        person1.country = "Singapore";//ERROR

        Person person2 = new Person();

        Person person3;
        person3 = new Person();
    }
}
