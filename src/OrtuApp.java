public class OrtuApp {
    public static void main(String[] args) {


        Anak anak = new Anak();
        anak.nama = "Bocah";
        anak.duit();
        System.out.println(anak.nama);

        Ortu ortu = (Ortu) anak;
        ortu.duit();
        System.out.println(ortu.nama);
    }
}

