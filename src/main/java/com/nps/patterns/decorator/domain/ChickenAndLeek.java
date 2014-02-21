package com.nps.patterns.decorator.domain;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/08/13
 * Time: 10:57
 * To change this template use File | Settings | File Templates.
 */
public class ChickenAndLeek extends Pie {

    public ChickenAndLeek(){
        description = "A Chicken and Leek Pie";
    }

    @Override
    public int cost() {
        return 250;
    }
}
