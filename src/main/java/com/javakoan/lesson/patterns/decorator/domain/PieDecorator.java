package com.javakoan.lesson.patterns.decorator.domain;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/08/13
 * Time: 11:00
 * To change this template use File | Settings | File Templates.
 */
public abstract class PieDecorator extends Pie {

    protected Pie pie;

    public abstract String getDescription();
}
