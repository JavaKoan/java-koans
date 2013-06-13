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
 * This Koan will help you meditate on the JUnit basics required for the exercises
 *
 * Right clicking on a method and selecting "Run..." will allow you to execute an individual test in most IDEs
 *
 * Right clicking at the class level and selecting "Run..." will allows you to run all tests
 *
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
        Integer b = a;

        assertSame(a, b);
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
        assertTrue(1 == 1);
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
            // Assert something more meaningful here like expected message
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
    // setUp & tearDown historic names before annotation based Before & After

}
