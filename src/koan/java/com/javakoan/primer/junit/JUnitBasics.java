package com.javakoan.primer.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 11/06/13
 * Time: 13:40
 * To change this template use File | Settings | File Templates.
 */
public class JUnitBasics {


    @Test
    public void shouldDemonstrateAssertEquals(){
        BigDecimal a = new BigDecimal(1.0);
        BigDecimal b = new BigDecimal(1.0);

        assertEquals(a, b);
    }

    @Test
    public void shouldDemonstrateAssertSame(){
        Integer a = new Integer(1);

        assertSame(a, a);
    }

    @Test
    public void shouldDemonstrateAssertNotSame(){
        Integer a = new Integer(1);
        Integer b = new Integer(1);

        assertNotSame(a, b);
    }


    @Test
    public void shouldDemonstrateAssertTrue(){
        boolean isTrue = true;

        assertTrue(isTrue);
    }

    @Test
    public void shouldDemonstrateAssertFalse(){
        boolean isFalse = false;

        assertFalse(isFalse);
    }

    @Test
    public void shouldDemonstrateAssertNull(){
        Object iAmNull = null;

        assertNull(iAmNull);
    }

    @Test
    public void shouldDemonstrateFail(){
        fail();
    }

    @Test
    public void shouldDemonstrateHandlingExceptionsWithTests(){

        Integer iAmNull = null;

        try {
            iAmNull.intValue();
            fail();
        } catch(NullPointerException npe){
            assertTrue(npe instanceof NullPointerException);
        }
    }

    private List<String> messages = new ArrayList<String>();

    @Test
    public void shouldDemonstrateExecutionOrder(){
        messages.add("Added During Test");

        assertEquals(messages.get(0), "Added Before Test");
        assertEquals(messages.get(1), "Added During Test");
    }

    @Before
    public void setUp(){
        messages.add("Added Before Test");
    }

    @After
    public void tearDown(){
        System.out.println("Test Complete");
    }

    // Allows use of debugger.
}
