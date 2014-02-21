package com.nps.patterns.strategy.ex1;

import com.nps.patterns.strategy.domain.Magazine;
import com.nps.patterns.strategy.domain.Publication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 09/07/13
 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 */
public class NewsKiosk implements Subject{

    private List<Observer> observers;

    private Magazine latestMagazine;

    public NewsKiosk() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Publication publication) {
        for(Observer observer : observers){
            observer.update(this, publication);
        }
    }

    public void newMagazinePublished(Magazine magazine){

        this.latestMagazine = magazine;
        notifyObservers(magazine);
    }

    public void newMagazinePublishedCollectionOnly(Magazine magazine){

        this.latestMagazine = magazine;
        notifyObservers(null);
    }

    public Magazine getLatestMagazine() {
        return latestMagazine;
    }
}
