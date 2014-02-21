package com.nps.patterns.decorator.domain;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/08/13
 * Time: 10:54
 * To change this template use File | Settings | File Templates.
 */
public class SteakAndKidney extends Pie{

    public SteakAndKidney(){
        description = "Classic Steak and Kidney Pie";
    }

    @Override
    public int cost() {
        return 300;
    }
}
