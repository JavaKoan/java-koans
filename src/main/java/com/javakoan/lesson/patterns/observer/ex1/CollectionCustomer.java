package com.javakoan.lesson.patterns.observer.ex1;

import com.javakoan.lesson.patterns.observer.domain.Customer;
import com.javakoan.lesson.patterns.observer.domain.Magazine;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 13:26
 * To change this template use File | Settings | File Templates.
 */
public class CollectionCustomer extends Customer implements Observer {

    private Observable observable;

    public CollectionCustomer(String name, Observable observable) {
        super(name);
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof NewsKiosk){
            Magazine magazine = ((NewsKiosk) o).getLatestMagazine();
            read(magazine);
        }
    }
}
