package com.javakoan.lesson.java.overriding;

public class Snoopy extends Beagle implements Cartoon {

    private static final Snoopy INSTANCE = new Snoopy();

    private Snoopy(){}

    public static String rollOver(){
        return "unlikely";
    }

    @Override
    public String bark() {
        return "peanuts" ;
    }

    @Override
    public String firstAppearance() {
        return "in print";
    }

    public static Snoopy getInstance(){
        return INSTANCE;
    }
}
