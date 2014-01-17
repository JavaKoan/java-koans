package com.nps.primer.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertSame;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Primer for JUnit.  Basics required for the exercises
 * <p/>
 * Right clicking on a method and selecting "Run..." will allow you to execute an individual test in most IDEs
 * <p/>
 * Right clicking at the class level and selecting "Run..." will allows you to run all tests
 */
public class JUnitBasics {

    /*
     Test two objects are logically equal
     */
    @Test
    public void shouldDemonstrateAssertEquals() {

        BigDecimal a = new BigDecimal(1.0);
        BigDecimal b = new BigDecimal(1.0);

        assertEquals(a, b); // Pure Junit
        assertThat(a, equalTo(b)); // Hamcrest equivalent
        assertThat(a, is(b)); // Hamcrest equivalent
    }

    /*
     Test two objects have reference the same object
     */
    @Test
    public void shouldDemonstrateAssertSame() {
        Integer a = new Integer(1);
        Integer b = a;

        assertSame(a, b); // JUnit
        assertThat(a, sameInstance(b)); // Hamcrest equivalent
    }

    /*
     Test two objects do not reference the same object
     */
    @Test
    public void shouldDemonstrateAssertNotSame() {
        Integer a = new Integer(1);
        Integer b = new Integer(1);

        assertNotSame(a, b);
        assertThat(a, not(sameInstance(b)));
    }

    /*
     Test condition is true
     */
    @Test
    public void shouldDemonstrateAssertTrue() {
        boolean a = true;

        assertTrue(a);
        assertThat(a, is(true));
    }

    /*
     Test condition is false
     */
    @Test
    public void shouldDemonstrateAssertFalse() {
        boolean b = false;

        assertFalse(b);
        assertThat(b, not(true));
    }

    /*
     Test object is null
     */
    @Test
    public void shouldDemonstrateAssertNull() {
        Object iAmNull = null;

        assertNull(iAmNull);
        assertThat(iAmNull, nullValue());
    }

    /*
     Force test to fail
     */
    @Test @Ignore
    public void wontPass() {
        fail();
    }

    /*
     Exception handling test paradigm
     */
    @Test
    public void shouldDemonstrateHandlingExceptionsWithTests() {

        Integer iAmNull = null;

        try {
            iAmNull.intValue();
            fail();
        } catch (NullPointerException npe) {
            assertTrue(npe instanceof NullPointerException);
            assertThat(npe, instanceOf(NullPointerException.class));
            // In a real test assert something more meaningful here like expected message
        }
    }

    private List<String> messages = new ArrayList<String>();

    /*
     Demonstrate setUp @Before is called before all tests
     */
    @Test
    public void shouldDemonstrateExecutionOrder() {
        messages.add("Added During Test");

        assertEquals(messages.get(0), "Added Before Test");
        assertEquals(messages.get(1), "Added During Test");
    }

    @Before
    public void setUp() {
        messages.add("Added Before Test");
    }

    @After
    public void tearDown() {
//        Uncomment to execute after every test
//        System.out.println("Test Complete");
    }

// Allows use of debugger.
// setUp & tearDown historic names before annotation based Before & After

}
