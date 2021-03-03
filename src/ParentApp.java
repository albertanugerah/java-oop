public class ParentApp {
    public static void main(String[] args) {

        var orangTua = new Parent();
        orangTua.name = "Albert";
        orangTua.Negor("Ilham");

        var bocah = new Child();
        bocah.name = "Herman";
        bocah.Negor("Bambang");
    }
}
