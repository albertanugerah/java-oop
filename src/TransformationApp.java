public class TransformationApp {
    public static void main(String[] args) {

        GrandChild cucu = new GrandChild("Abe");
        cucu.negor("John");

        cucu = new Child("Abe");
        cucu.negor("John");

        cucu = new Parent("Abe");
        cucu.negor("John");


        negor(new Parent("Albert"));
        negor(new Child("Jami"));
        negor(new GrandChild("Buyung"));


    }
//Type Check and Cast(konversi tipe data)
    static void negor(GrandChild cucu){

        if(cucu instanceof Parent) {
            Parent orangTua = (Parent) cucu;
            System.out.println("Hi Orang Tua " + orangTua.name);
        }else if(cucu instanceof Child){
            Child anak = (Child) cucu;
            System.out.println("Hi Anak " + anak.name);
        }else{
            System.out.println("Hi Cucu " + cucu.name);
        }
    }
}
