public class TransformationApp {
    public static void main(String[] args) {

        GrandChild cucu = new GrandChild("Abe");
        cucu.Negor("John");

        cucu = new Child("Abe");
        cucu.Negor("John");

        cucu = new Parent("Abe");
        cucu.Negor("John");


        Negor(new Parent("Albert"));
        Negor(new Child("Jamu"));
        Negor(new GrandChild("Buyung"));


    }

    static void Negor(GrandChild cucu){
        System.out.println("Hi " + cucu.name);
    }
}
