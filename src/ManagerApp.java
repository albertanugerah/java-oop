public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Albert");
        manager.sayHello("Tassha");

        var vp = new VicePresident("Jableh");
        vp.sayHello("Budi");

//        System.out.println(manager.toString());
        System.out.println(manager);
//        System.out.println(vp.toString());
        System.out.println(vp);

    }
}
