package belajar.java.opp.application;

import belajar.java.opp.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("HP Probook",20_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
