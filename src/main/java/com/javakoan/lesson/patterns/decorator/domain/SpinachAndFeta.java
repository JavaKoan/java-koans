package com.javakoan.lesson.patterns.decorator.domain;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/08/13
 * Time: 10:59
 * To change this template use File | Settings | File Templates.
 */
public class SpinachAndFeta extends Pie {

    public SpinachAndFeta(){
        description = "A Spinach and Feta Pie";
    }

    @Override
    public int cost() {
        return 200;
    }
}
