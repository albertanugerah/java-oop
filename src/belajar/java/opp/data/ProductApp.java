package belajar.java.opp.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("HP Probook",20_000_000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
