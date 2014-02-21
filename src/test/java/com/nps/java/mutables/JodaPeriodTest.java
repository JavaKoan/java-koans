package com.nps.java.mutables;

import org.joda.time.DateTime;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 15:03
 * To change this template use File | Settings | File Templates.
 */
public class JodaPeriodTest {


    @Test
    public void shouldThrowExceptionWhenStartIsAfterEnd(){

        DateTime start = new DateTime().withDayOfMonth(1).withMonthOfYear(6).withYear(2012);
        DateTime end = new DateTime().withDayOfMonth(1).withMonthOfYear(5).withYear(2012);

        try {
            JodaPeriod jodaPeriod = new JodaPeriod(start, end);
            fail("Should have thrown Exception");
        } catch (Exception e){
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void shouldBreakPeriodMakingEndBeforeStart(){

        DateTime start = new DateTime().withDayOfMonth(1).withMonthOfYear(6).withYear(2012);
        DateTime end = new DateTime().withDayOfMonth(1).withMonthOfYear(7).withYear(2012);

        JodaPeriod jodaPeriod = new JodaPeriod(start, end);

        assertTrue(jodaPeriod.getStart().isBefore(jodaPeriod.getEnd()));

        end = new DateTime().withDayOfMonth(1).withMonthOfYear(5).withYear(2012);

        assertTrue(jodaPeriod.getEnd().isBefore(jodaPeriod.getStart()));
    }

}
