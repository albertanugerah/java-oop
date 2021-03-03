public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Albert";
        manager.sayHello("Tassha");

        var vp = new VicePresident();
        vp.name = "Anwar";
        vp.sayHello("Budi");

    }
}
