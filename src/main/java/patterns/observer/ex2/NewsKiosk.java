package patterns.observer.ex2;

import patterns.observer.domain.Paper;
import patterns.observer.domain.Publication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 14:41
 * To change this template use File | Settings | File Templates.
 */
public class NewsKiosk implements Subject {

    private List<Observer> observers;

    private Paper latestPaper;

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
            observer.update(publication);
        }
    }

    public void newPaperPublished(Paper paper){
        this.latestPaper = paper;
        notifyObservers(paper);
    }
}
