package belajar.java.opp.application;

import belajar.java.opp.data.Karyawan;
import belajar.java.opp.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Karyawan karyawan = new Karyawan();
        karyawan.setName("Albert");
        karyawan.setLevel(Level.ASKEP);

        System.out.println("Nama Karyawan adalah " + karyawan.getName());
        System.out.println("Level Karyawan adalah "+karyawan.getLevel());

        //memanggil constuctro decription
        System.out.println("Deskripsi Level adalah " + karyawan.getLevel().getDescription());


        // konversi enum to string
        String levelName = Level.STAFF.name();
        System.out.println(levelName);

        //string to enum
        Level level = Level.valueOf("STAFF");
        System.out.println(level);

        //dapatkan nilai di level
        for (var values : level.values()){
            System.out.println(values);
        }







    }
}
