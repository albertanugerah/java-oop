package belajar.java.opp.data;

public class Product {
   public String name;
   public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Product name " + name + ", price " + price;
    }
}
