package com.nps.java.overriding;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 16:43
 * To change this template use File | Settings | File Templates.
 */
public class Snoopy extends Beagle {

    private static final Snoopy INSTANCE = new Snoopy();

    private Snoopy(){}

    @Override
    public String bark() {
        return "yum-peanuts" ;
    }

    public static Snoopy getInstance(){
        return INSTANCE;
    }
}
