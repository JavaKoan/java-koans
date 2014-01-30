package com.nps.koan.primitives;

import com.nps.koan.fixture.KoanRunner;
import com.nps.koan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
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

@RunWith(KoanRunner.class)
public class PrimitiveBasics {

    byte byte8Bit; short short16Bit; int int32Bit; long long64Bit; float float32Bit; double double64bit;
    char char16Bit; boolean bool;

    /**
     * Meditate on how to assign values to each primitive type so it is not longer represented by its default value
     */
    @Koan
    public void reflectOnHowToAssignPrimitiveValuesWithLiteralsAndGainInsightIntoDefaultValues(){

        /* (@_@)  Begin Meditation */

        /* (^_^)  Complete Meditation */

        assertThat(byte8Bit, is(not((byte)0)));
        assertThat(short16Bit, is(not((short)0)));
        assertThat(int32Bit, is(not(0)));
        assertThat(long64Bit, is(not((long)0)));
        assertThat(float32Bit, is(not((float)0)));
        assertThat(double64bit, is(not((double)0)));
        assertThat(char16Bit, is(not('\u0000')));
        assertThat(bool, is(not(false)));
    }


    /**
     * Meditate on how to use constants in the Byte class to initialise maximum and minimum byte values
     */
    @Koan
    public void reflectOnMinimumAndMaximumByteValues(){
        byte maximumByteValue = 0;
        byte minimumByteValue = 0;

        /* (@_@)  */

        /* (^_^)  */

        assertThat(maximumByteValue, is((byte)127));
        assertThat(minimumByteValue, is((byte)-128));
    }


    /**
     * Meditate on the maximum and minimum values of integers and how it might be important for you digital persona:
     * http://www.escapistmagazine.com/forums/read/7.829855-GTA-V-2-147-483-647-Glitch-Could-Wipe-Your-Cash-Away
     * Also muse on 2^31-1 and 0x7fffffff
     */
    @Koan
    public void reflectOnMinimumAndMaximumIntValues(){

        int maximumIntValue = 0;
        int minimumIntValue = 0;

        /* (@_@)  */

        /* (^_^)  */

        assertThat(maximumIntValue, is(2147483647));
        assertThat(minimumIntValue, is(-2147483648));
    }

    /**
     * Meditate on how to use constants in the Double class to initialise maximum and minimum double values
     */
    @Koan
    public void reflectOnMinimumAndMaximumDoubleValues(){
        double maximumDoubleValue = 0;
        double minimumDoubleValue = 0;

        /* (@_@)  */

        /* (^_^)  */

        assertThat(maximumDoubleValue, is(1.7976931348623157e+308));
        assertThat(minimumDoubleValue, is(4.9e-324));
    }


    /**
     * Meditate on the character literals maximum and minimum values using the UTF character set
     */
    @Koan
    public void reflectOnCharactersAlsoHaveMinimumAndMaximumValues(){
        char maximumCharValue = '\u0001';
        char minimumCharValue = '\u0001';

        /* (@_@)  */

        /* (^_^)  */

        assertThat(maximumCharValue, is(Character.MAX_VALUE));
        assertThat(minimumCharValue, is(Character.MIN_VALUE));
    }

    /**
     *  Meditate on what equality constitutes with regards to primitive types
     */
    @Koan
    public void reflectOnEqualityForPrimitives(){
        int valueA = 0;
        int valueB = 1;

        /* (@_@)  */
        /* (^_^)  */

        assertEquals(valueA, valueB);
    }

    /**
     *  Meditate on what equality constitutes when comparing primitives and boxed primitives
     */
    @Koan
    public void reflectOnBoxedPrimitivesAreUnBoxedForEvaluationWithPrimitive(){
        Integer valueA = 555;
        int valueB = 999;

        /* (@_@)  */
        /* (^_^)  */

        assertTrue(valueA == valueB);
        assertTrue(valueA.intValue() == valueB);
    }

    /**
     *  Meditate on what equality constitutes boxed primitives
     */
    @Koan
    public void reflectOnEqualityForBoxedPrimitives(){
        Double valueA = 1.00;
        Double valueB = 0.00;

        /* (@_@)  */
        /* (^_^)  */

        assertEquals(valueA, valueB);
    }

    /**
     *  Mediate on integers having cached references between -128 to 127
     *  http://tech.puredanger.com/2007/02/01/valueof/
     */
    @Koan
    public void reflectOnIntegersHaveCachedValues(){
        Integer valueA = 1;
        Integer valueB = 0;

        /* (@_@)  */
        /* (^_^)  */

        assertTrue(valueA == valueB);
    }

    /**
     *  Mediate on integers outside the range of -128 to 127 do not have the same object reference ... as one might expect
     */
    @Koan
    public void reflectOnDifferentObjectIdsForBoxedPrimitives(){
        Integer valueA = 200;
        Integer valueB = valueA;

        /* (@_@)  */
        /* (^_^)  */

        assertFalse(valueA == valueB);
    }

    /**
     *  Meditate on the default initialization of objects as class variables and the potential dangers.
     *  Hint: Prevent the fail method being called, by causing a null pointer exception.
     */
    private Integer boxedInt;
    @Koan
    public void reflectOnNullPointersWhenUnboxingIntegers(){

        try {
            /* (@_@)  */
                fail("Should have thrown null pointer");
            /* (^_^)  */
        } catch (NullPointerException e){
            assertTrue(e instanceof NullPointerException);
        }
    }

    /**
     *  Meditate on the default initialization of primitives as class variables and the potential benefits
     *  Hint: Prevent the fail method being called, by using a clause on the value of primitiveInt.
     */
    private int primitiveInt;
    @Koan
    public void reflectOnSaferToFavouringAPrimitive(){

        try {
            /* (@_@) */
                fail("Prevent failure by placing this code in a clause using primitiveInt");
            /* (^_^) */
        } catch (Exception e){
            fail("Should not have thrown an exception");
        }
    }

    /**
     * Meditate on unnecessary boxing causes program execution to take longer.
     * Hint: Create a for loop using the boxed Long instance variable in the same way the primitive is used
     */
    @Koan
    public void reflectOnUnnecessaryBoxingTakesALongTime(){
        long sum = 0L;
        long sumStartTime = System.currentTimeMillis();
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long sumDuration = System.currentTimeMillis() - sumStartTime;

        Long boxedSum = 0L;
        long boxedSumStartTime = System.currentTimeMillis();

        /* (@_@) */

        /* (^_^) */
        long boxedSumDuration = System.currentTimeMillis() - boxedSumStartTime;

        System.out.println("boxedSumDuration: " + boxedSumDuration + " sumDuration: " + sumDuration);

        assertTrue(boxedSumDuration > sumDuration);
    }

}
