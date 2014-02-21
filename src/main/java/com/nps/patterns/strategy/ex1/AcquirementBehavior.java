package com.nps.patterns.strategy.ex1;

import com.nps.patterns.strategy.domain.Publication;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 */
public interface AcquirementBehavior {

    public Publication acquire(Subject subject, Publication publication);

}
