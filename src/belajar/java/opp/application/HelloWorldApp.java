package belajar.java.opp.application;

import belajar.java.opp.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hi There");
            }


            public void sayHello(String name) {
                System.out.println("What's Up " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hallo");
            }


            public void sayHello(String name) {
                System.out.println("Hallo " + name);
            }
        };

        english.sayHello();
        indonesia.sayHello();

        english.sayHello("Albert");
        indonesia.sayHello("Albert");
    }
}
