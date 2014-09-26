package com.javakoan.lesson.java.overriding;

public class Dog implements Walker {

    public static String rollOver(){
        return "rolls-over";
    }

    public String bark() {
        return "woof-woof" ;
    }
}
