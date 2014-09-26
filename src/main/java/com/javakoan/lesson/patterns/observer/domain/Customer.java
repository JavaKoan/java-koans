package com.javakoan.lesson.patterns.observer.domain;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 11:23
 * To change this template use File | Settings | File Templates.
 */
public class Customer {

    protected String name;

    public Customer(String name) {
        this.name = name;
    }

    public void read(Publication publication){
        System.out.print(name + " is reading: ");
        System.out.println(publication.getContent());
    }
}
