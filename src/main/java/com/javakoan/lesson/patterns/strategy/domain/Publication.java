package com.javakoan.lesson.patterns.strategy.domain;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 11:11
 * To change this template use File | Settings | File Templates.
 */
public abstract class Publication {

    private String content;

    protected Publication(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
