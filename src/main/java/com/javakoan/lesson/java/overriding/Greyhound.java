package com.javakoan.lesson.java.overriding;


public class Greyhound extends Dog {

    @Override
    public String walkies() {
        return "run-about-the-house";
    }

    @Override
    public String bark() {
        return "howl" ;
    }
}
