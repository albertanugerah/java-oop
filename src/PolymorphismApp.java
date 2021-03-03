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

        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+ vicePresident.name);
        }else if(employee instanceof  Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager "+ manager.name);
        }else{
            System.out.println("Hello Employee " + employee.name);
        }

    }
}
