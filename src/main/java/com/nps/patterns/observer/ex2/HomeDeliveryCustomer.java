package com.nps.patterns.observer.ex2;

import com.nps.patterns.observer.domain.Customer;
import com.nps.patterns.observer.domain.Publication;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 */
public class HomeDeliveryCustomer extends Customer implements Observer {

    private String address;

    private Subject subject;

    public HomeDeliveryCustomer(String name, Subject subject) {
        super(name);
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void update(Publication publication) {
        read(publication);
    }
}
