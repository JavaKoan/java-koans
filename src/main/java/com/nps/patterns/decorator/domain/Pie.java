package com.nps.patterns.decorator.domain;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/08/13
 * Time: 10:53
 * To change this template use File | Settings | File Templates.
 */
public abstract class Pie {

    protected String description = "Pie Shell No Filling";

    public abstract int cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
