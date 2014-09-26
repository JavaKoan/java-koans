package com.javakoan.lesson.java.overriding;


public interface Walker {

    default String walkies() {
        return "wag-tail";
    }

}
