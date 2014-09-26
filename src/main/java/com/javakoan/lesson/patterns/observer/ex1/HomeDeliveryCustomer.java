package com.javakoan.lesson.patterns.observer.ex1;

import com.javakoan.lesson.patterns.observer.domain.Customer;
import com.javakoan.lesson.patterns.observer.domain.Publication;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
public class HomeDeliveryCustomer extends Customer implements Observer {

    private String address;

    private Observable observable;

    public HomeDeliveryCustomer(String name, Observable observable) {
        super(name);
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Publication){
            read((Publication) arg);
        }
    }
}
