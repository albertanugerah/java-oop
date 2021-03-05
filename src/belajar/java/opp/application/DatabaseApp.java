package belajar.java.opp.application;

import belajar.java.opp.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectionDatabse("Albert",null);
        System.out.println("Sukses");
    }

    public static void connectionDatabse(String username, String password){
        if(username == null || password==null){
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }


    // Error adalah exception terakhir yang tidak direkomendasikan try-catch
    // Digunakan untuk masalah yang serius, seperti koneksi ke database
    // direkomendasikan untuk mematikan aplikasi.
}
