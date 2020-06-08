package com.bigdata.scala.singleton;

public class UtilitiesJava {
    public static String HELLO_MESSAGE = "Hello, ";
    public static String GREETING_MESSAGE = "Good Morning, ";

    public static void sayHello(String str) {
        System.out.println(HELLO_MESSAGE + str);
    }

    public void greet(String str) {
        System.out.println(GREETING_MESSAGE + str);
    }
}
