package com.javakoan.lesson.patterns.strategy.domain;

import com.javakoan.lesson.patterns.strategy.ex1.AcquirementBehavior;
import com.javakoan.lesson.patterns.strategy.ex1.Observer;
import com.javakoan.lesson.patterns.strategy.ex1.Subject;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 09/07/13
 * Time: 14:41
 * To change this template use File | Settings | File Templates.
 */
public class Customer implements Observer {

    protected String name;

    private AcquirementBehavior behavior;

    private Subject subject;

    public Customer(String name, AcquirementBehavior behavior, Subject subject) {
        this.name = name;
        this.behavior = behavior;
        this.subject = subject;
        subject.register(this);
    }

    public void read(Publication publication){
        System.out.print(name + " is reading: ");
        System.out.println(publication.getContent());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AcquirementBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(AcquirementBehavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public void update(Subject subject, Publication newPublication) {
        Publication publication = behavior.acquire(subject, newPublication);
        if(publication != null){  // TODO: Why do we need to do this?
            read(publication);
        }
    }
}
