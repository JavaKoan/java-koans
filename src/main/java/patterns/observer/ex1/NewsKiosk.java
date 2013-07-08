package patterns.observer.ex1;

import patterns.observer.domain.Magazine;
import patterns.observer.domain.Paper;

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

    private Paper latestPaper;

    public void newMagazinePublished(Magazine magazine){

        this.latestMagazine = magazine;

        setChanged();
        notifyObservers();
    }

    public void newPaperPublished(Paper paper){

        this.latestPaper = paper;

        setChanged();
        notifyObservers(paper);
    }

    public Magazine getLatestMagazine(){
        return latestMagazine;
    }

    public Paper getLatestPaper() {
        return latestPaper;
    }
}
