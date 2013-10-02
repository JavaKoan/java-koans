package patterns.strategy.ex1;

import patterns.strategy.domain.Publication;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 15:57
 * To change this template use File | Settings | File Templates.
 */
public class AcquirementByDelivery implements AcquirementBehavior {

    @Override
    public Publication acquire(Subject subject, Publication publication) {
        return publication;
    }
}
