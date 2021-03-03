public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Albert";
        manager.sayHello("Tassha");

        var vp = new VicePresident();
        vp.name = "Anwar";
        vp.sayHello("Budi");

        System.out.println(manager.toString());
        System.out.println(manager);
        System.out.println(vp.toString());
        System.out.println(vp);

    }
}
