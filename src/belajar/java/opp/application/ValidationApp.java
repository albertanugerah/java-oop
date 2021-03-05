package belajar.java.opp.application;

import belajar.java.opp.data.LoginRequest;
import belajar.java.opp.error.ValidationException;
import belajar.java.opp.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("","rahasia");

        //memanggil method thorws exception menggunakan try catch exception
//        penangan error dijava menggunakan try catch
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        }
    }
}
