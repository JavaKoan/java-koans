package com.java.mutables;

import org.junit.Test;

import java.util.Date;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 15:13
 * To change this template use File | Settings | File Templates.
 */
public class PeriodTest {

    private static final Date APRIL_1_2013 = new Date(1364770800000L);
    private static final Date MAY_29_2013 = new Date(1369782000000L);
    private static final Date JUNE_15_2013 = new Date(1371250800000L);

    @Test
    public void shouldThrowExceptionWhenStartIsAfterEnd(){

        Date start = new Date(JUNE_15_2013.getTime());
        Date end = new Date(MAY_29_2013.getTime());

        try {
            Period period = new Period(start, end);
            fail("Should have thrown Exception");
        } catch (Exception e){
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void shouldNotBreakPeriodThroughMutableAccessor(){

        Date start = new Date(MAY_29_2013.getTime());
        Date end = new Date(JUNE_15_2013.getTime());

        Period period = new Period(start, end);

        assertTrue(period.getStart().before(period.getEnd()));

        period.getEnd().setTime(APRIL_1_2013.getTime());

        assertTrue(period.getStart().before(period.getEnd()));
    }

}
