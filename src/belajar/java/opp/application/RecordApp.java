package belajar.java.opp.application;

import belajar.java.opp.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("albert","rahasia");
        System.out.println(loginRequest.username()); //old java loginRequest.getUsername()
        System.out.println(loginRequest.password());//old java loginRequest.getPassword()
        System.out.println(loginRequest);
    }
}
