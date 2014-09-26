package com.javakoan.lesson.java.overriding;

public interface ModernCartoon extends Cartoon {

    default String drawnBy(){
        return "computer";
    }

    default String firstAppearance(){
        return "on tv";
    }
}
