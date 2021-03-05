package belajar.java.opp.util;

import belajar.java.opp.data.LoginRequest;
import belajar.java.opp.error.ValidationException;

public class ValidationUtil {
    //validasi loginRequest
    public static void validate(LoginRequest loginRequest) throws ValidationException{
        if(loginRequest.username() == null){
            throw new ValidationException("Username tidak boleh null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username tidak boleh kosong");
        }else if(loginRequest.password() == null){
            throw new ValidationException("Passowrd tidak boleh null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Passowrd tidak boleh kosong");
        }
    }
}
