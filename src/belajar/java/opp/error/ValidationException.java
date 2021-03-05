package belajar.java.opp.error;

public class ValidationException extends Throwable{

//    karena sudah ada di parent getMessage, maka dibuat constuctornya, panggil super constructornya, lalu kirim parameter class(throwable) message
    public ValidationException(String message){
        super(message);
    }
}
