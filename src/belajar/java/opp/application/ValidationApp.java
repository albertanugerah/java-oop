package belajar.java.opp.application;

import belajar.java.opp.data.LoginRequest;
import belajar.java.opp.error.ValidationException;
import belajar.java.opp.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Albert","rahasia");

        //memanggil method thorws exception menggunakan try catch exception
        //penangan error dijava menggunakan try catch
        //block finally = block akan selalu dieksekusi baik terjadi exception atau tidak
//            - kegunaan = melakukan sesuatu sukses atau gagal ketika membaca file dan menutup koneksi ke file biar tidak menggantung di memory
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally{
            System.out.println("Selalu dieksekusi");
        }

        //kegunaan RuntimeException = code agar lebih rapih. Error handle disatu tempat, cukup error hadle disatu tempat.
        // walaupun RuntimeExcception tidak wajib, direkomendasikan melalukan try-catch, karena program dapat berhenti tanpa try catch
        LoginRequest loginRequest2 = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("sukses");
    }
}
