package belajar.java.opp.data;

public record LoginRequest(String username, String password){
//record class constructor
    //ketika contructor username dan passowrd dipanggil, constructor loginRequest otomatis di panggil


    public LoginRequest{
        System.out.println("membuat object loginRequest");
    }

//bisa melakukan constructor overloading, syaratnya harus WAJIB memanggil constructor utama yg secara otomatis dibuatkan di reocord class.
    public LoginRequest(String username){
       this(username,"");
    }

    public LoginRequest(){
        this("","");
    }

//    java record dikhusukan untuk menampung data, dan datanya imumuteable (dataya tidak bisa beruba)

}
