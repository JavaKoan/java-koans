package com.java.primitives;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 10:50
 * To change this template use File | Settings | File Templates.
 */
public class PrimitiveTest {

    @Test
    public void shouldProveEqualityForPrimitives(){
        int valueA = 1;
        int valueB = 1;

        assertTrue(valueA == valueB);
    }

    @Test
    public void shouldProveBoxedPrimitivesAreUnBoxed(){
        Integer valueA = 1;

        assertTrue(valueA == 1);
        assertTrue(valueA.intValue() == 1);
    }


    @Test
    public void shouldProveDifferentObjectIdsForOtherBoxedPrimitives(){
        Double valueA = 1.00;
        Double valueB = 1.00;

        assertFalse(valueA == valueB);
    }

    @Test
    public void shouldProveEqualityForBoxedPrimitives(){
        Double valueA = 1.00;
        Double valueB = 1.00;

        assertTrue(valueA.equals(valueB));
    }


    // Cached reference -128 to 127  http://tech.puredanger.com/2007/02/01/valueof/
    @Test
    public void wontProveDifferentObjectIdsForBoxedPrimitives(){
        Integer valueA = 1;
        Integer valueB = 1;

        assertFalse(valueA == valueB);
    }

    @Test
    public void shouldProveDifferentObjectIdsForBoxedPrimitives(){
        Integer valueA = 200;
        Integer valueB = 200;

        assertFalse(valueA == valueB);
    }


    static Integer boxedInt;

    @Test
    public void shouldThrowNullPointerWhenUnboxingInteger(){

        try {
            if(boxedInt > 9){
                fail("Should have thrown null pointer");
            }
        } catch (Exception e){
            assertTrue(e instanceof NullPointerException);
        }

    }

    static int primitiveInt;

    @Test
    public void shouldNotThrowNullPointerWhenFavouringAPrimitive(){

        try {
            if(primitiveInt != 0){
                fail("Uninitialised int should be zero");
            }
        } catch (Exception e){
            fail("Should not have thrown an exception");
        }
    }

    @Test
    public void shouldDemonstrateUnnecessaryBoxingTakesALongTime(){
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
    }

    @Test
    public void shouldDemonstrateUsingPrimitivesCanImprovePerformance(){
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
    }

    @Test
    public void shouldShowYouHaveToUseBoxedPrimitivesInCollections(){

        //List<int> compileError = new ArrayList<int>();
        List<Integer> integerList = new ArrayList<Integer>();
    }
}
