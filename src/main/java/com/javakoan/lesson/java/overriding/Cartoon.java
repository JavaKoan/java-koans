package com.javakoan.lesson.java.overriding;

public interface Cartoon {

    default String drawnBy(){
        return "hand";
    }

    String firstAppearance();
}
