package com.nps.koan.invariants;

import com.nps.java.mutables.BrokenPeriod;
import com.nps.java.mutables.Period;
import com.nicholaspaulsmith.koan.fixture.KoanRunner;
import com.nicholaspaulsmith.koan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import java.util.Date;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

@RunWith(KoanRunner.class)
public class InvariantBasics {

    private static final Date APRIL_1_2013 = new Date(1364770800000L);
    private static final Date MAY_29_2013 = new Date(1369782000000L);
    private static final Date JUNE_15_2013 = new Date(1371250800000L);

    /**
     * Meditate on the use of constructors to help enforce class invariants
     */
    @Koan
    public void reflectOnUsingConstructorsToPreserveInvariants(){

        Date start = new Date(JUNE_15_2013.getTime());
        Date end = new Date(MAY_29_2013.getTime());

        Class exceptionClass = Date.class;

        /* (@_@) */

        /* (^_^) */

        try {
            BrokenPeriod brokenPeriod = new BrokenPeriod(start, end);
            fail("Should have thrown Exception");
        } catch (Exception e){
            assertThat(e, is(instanceOf(exceptionClass)));
        }
    }

    /**
     * Meditate on how invariants can still be compromised by retaining original reference.
     */
    @Koan
    public void reflectOnCompromisingThePeriodByMakingEndBeforeStart(){

        Date start = new Date(MAY_29_2013.getTime());
        Date end = new Date(JUNE_15_2013.getTime());

        BrokenPeriod brokenPeriod = new BrokenPeriod(start, end);

        assertTrue(brokenPeriod.getStart().before(brokenPeriod.getEnd()));

        /* (@_@) */

        /* (^_^) */

        assertTrue(brokenPeriod.getEnd().before(brokenPeriod.getStart()));
    }

    /**
     * Meditate on how invariants can be compromised by exploiting accessor methods.
     */
    @Koan
    public void reflectAgainOnCompromisingThePeriodByMakingEndBeforeStart(){

        Date start = new Date(MAY_29_2013.getTime());
        Date end = new Date(JUNE_15_2013.getTime());

        BrokenPeriod brokenPeriod = new BrokenPeriod(start, end);

        assertTrue(brokenPeriod.getStart().before(brokenPeriod.getEnd()));

        /* (@_@) */

        /* (^_^) */

        assertTrue(brokenPeriod.getEnd().before(brokenPeriod.getStart()));
    }


    /**
     * Meditate on using defensive copies to preserve class invariants.
     */
    @Koan
    public void reflectOnUsingDefensiveCopiesToPreserveClassInvariants(){

        Date start = new Date(MAY_29_2013.getTime());
        Date end = new Date(JUNE_15_2013.getTime());

        Period period = new Period(start, end);

        Date startUnderMeditation = start;
        Date endUnderMeditation = end;

        /* (@_@) */

        /* (^_^) */

        assertThat(start, not(sameInstance(startUnderMeditation)));
        assertThat(end, not(sameInstance(endUnderMeditation)));
    }

}
