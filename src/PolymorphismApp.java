public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Albert");
        employee.sayHello("Budi");

        employee = new Manager("Albert");
        employee.sayHello("budi");

        employee = new VicePresident("Albert");
        employee.sayHello("budi");

        sayHello(new Employee("Albert"));
        sayHello(new Manager("Budi"));
        sayHello(new VicePresident("Janur"));

    }

    static void sayHello(Employee employee){
        System.out.println("Hello "+ employee.name);
    }
}
