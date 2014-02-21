package com.nps.patterns.strategy.ex1;

import com.nps.patterns.strategy.domain.Publication;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
public class AcquirementByCollection implements AcquirementBehavior {

    @Override
    public Publication acquire(Subject subject, Publication publication) {
        if(subject instanceof NewsKiosk){
            return ((NewsKiosk)subject).getLatestMagazine();
        } else {
            throw new IllegalArgumentException("Unknown Subject Type");
        }
    }
}
