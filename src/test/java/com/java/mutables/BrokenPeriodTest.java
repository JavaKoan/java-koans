package com.java.mutables;

import org.junit.Test;

import java.util.Date;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 14:52
 * To change this template use File | Settings | File Templates.
 */
public class BrokenPeriodTest {

    private static final Date APRIL_1_2013 = new Date(1364770800000L);
    private static final Date MAY_29_2013 = new Date(1369782000000L);
    private static final Date JUNE_15_2013 = new Date(1371250800000L);

    @Test
    public void shouldThrowExceptionWhenStartIsAfterEnd(){

        Date start = new Date(JUNE_15_2013.getTime());
        Date end = new Date(MAY_29_2013.getTime());

        try {
            BrokenPeriod brokenPeriod = new BrokenPeriod(start, end);
            fail("Should have thrown Exception");
        } catch (Exception e){
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void shouldBreakPeriodMakingEndBeforeStart(){

        Date start = new Date(MAY_29_2013.getTime());
        Date end = new Date(JUNE_15_2013.getTime());

        BrokenPeriod brokenPeriod = new BrokenPeriod(start, end);

        assertTrue(brokenPeriod.getStart().before(brokenPeriod.getEnd()));

        end.setTime(APRIL_1_2013.getTime());

        assertTrue(brokenPeriod.getEnd().before(brokenPeriod.getStart()));
    }

    @Test
    public void shouldBreakPeriodMakingEndBeforeStartThroughAccessor(){

        Date start = new Date(MAY_29_2013.getTime());
        Date end = new Date(JUNE_15_2013.getTime());

        Period period = new Period(start, end);

        assertTrue(period.getStart().before(period.getEnd()));

        end.setTime(APRIL_1_2013.getTime());

        assertTrue(period.getStart().before(period.getEnd()));
    }
}
