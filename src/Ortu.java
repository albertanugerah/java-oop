class Ortu {
    String nama;
    void duit(){
        System.out.println("Do it Ortu");
    }
}

class Anak extends Ortu{
    String nama;
    void duit(){
        System.out.println("Do it Anak");
        System.out.println("Nama ortu adalah " + super.nama);
    }
}

