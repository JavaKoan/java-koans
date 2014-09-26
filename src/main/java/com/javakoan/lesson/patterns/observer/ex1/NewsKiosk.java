package com.javakoan.lesson.patterns.observer.ex1;

import com.javakoan.lesson.patterns.observer.domain.Magazine;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 11:02
 * To change this template use File | Settings | File Templates.
 */
public class NewsKiosk extends Observable {

    private Magazine latestMagazine;


    public void newMagazinePublished(Magazine magazine){

        this.latestMagazine = magazine;

        setChanged();
        notifyObservers(magazine);
    }

    public void newMagazinePublishedCollectionOnly(Magazine magazine){

        this.latestMagazine = magazine;

        setChanged();
        notifyObservers();
    }

    public Magazine getLatestMagazine(){
        return latestMagazine;
    }
}
