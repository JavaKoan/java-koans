package com.nps.java.varargs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 30/05/13
 * Time: 09:53
 * To change this template use File | Settings | File Templates.
 */
public class ComputeTest {

    @Test
    public void shouldCalculateMax(){

        int max = BrokenCompute.max(7, 8, 3, 4, 5);
        assertEquals(8, max);
    }

    @Test
    public void wontCalculateMax(){

        try {
            int max = BrokenCompute.max();
            fail("Test In Error");
        } catch (Exception e){
            assertTrue(e instanceof ArrayIndexOutOfBoundsException);
        }
    }

    @Test
    public void shouldThrowExceptionForZeroArgument(){

        try{
            int max = ImprovedCompute.max();
            fail("Test In Error");
        } catch(Exception e){
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void shouldMandateAtLeastOneArgument(){

        int max = Compute.max(7, 8, 3, 4, 5);
        assertEquals(8, max);
    }

    @Test
    public void shouldShowArrayCreationCostCompute(){

        long startTime = System.nanoTime();
        int max = PerformantCompute.max(1);
        long endTime = System.nanoTime();
        System.out.println("Number of Args 1: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1);
        endTime = System.nanoTime();
        System.out.println("Number of Args 1: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2);
        endTime = System.nanoTime();
        System.out.println("Number of Args 2: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3);
        endTime = System.nanoTime();
        System.out.println("Number of Args 3: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3,4);
        endTime = System.nanoTime();
        System.out.println("Number of Args 4: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3,4,5);
        endTime = System.nanoTime();
        System.out.println("Number of Args 5: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1);
        endTime = System.nanoTime();
        System.out.println("Number of Args 1: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2);
        endTime = System.nanoTime();
        System.out.println("Number of Args 2: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3);
        endTime = System.nanoTime();
        System.out.println("Number of Args 3: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3,4);
        endTime = System.nanoTime();
        System.out.println("Number of Args 4: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3,4,5);
        endTime = System.nanoTime();
        System.out.println("Number of Args 5: " + (endTime-startTime));
    }

/*
    Number of Args 1: 882422
    Number of Args 1: 366
    Number of Args 2: 1829
    Number of Args 3: 2194
    Number of Args 4: 3657
    Number of Args 5: 1097
    Number of Args 1: 366
    Number of Args 2: 365
    Number of Args 3: 366
    Number of Args 4: 732
    Number of Args 5: 731
*/

}

