package com.nps.patterns.decorator.domain;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/08/13
 * Time: 11:01
 * To change this template use File | Settings | File Templates.
 */
public class Mash extends PieDecorator {

    public Mash(Pie pie){
        this.pie = pie;
    }

    @Override
    public int cost() {
        return pie.cost() + 100;
    }

    @Override
    public String getDescription() {
        return pie.getDescription() + ", Mash";
    }
}
