package belajar.java.opp.util;

import belajar.java.opp.data.LoginRequest;
import belajar.java.opp.error.BlankException;
import belajar.java.opp.error.ValidationException;

public class ValidationUtil {
    //validasi loginRequest

    //wajib menambahkan thows ValidationExceptino karena jenisnya Checked Exception
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username is blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password is blank");
        }
    }
    //Runtime tidak wajib menambahkan throws BlankException
    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        }else if(loginRequest.username().isBlank()){
            throw new BlankException("Username is blank");
        }else if(loginRequest.password() == null){
            throw new NullPointerException("Password is null");
        }else if(loginRequest.password().isBlank()){
            throw new BlankException("Password is blank");
        }
    }
}
