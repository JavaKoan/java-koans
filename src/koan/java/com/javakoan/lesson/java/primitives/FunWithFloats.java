package com.javakoan.lesson.java.primitives;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.Before;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

import static junit.framework.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(KoanRunner.class)
public class FunWithFloats {

    private SweetShop sweetShop;

    /**
     * Meditate on the String value of a floating point number.  Consider the value of the expressed floating
     * point number f, perform a calculation to reach the desired value and convert the float to a String representation
     */
    @Koan
    public void reflectOnProducingTheStringValue100000() {
        float f = 1.0e+4f;

        String stringValue = "";

        /* (@_@) */
        /* (^_^) */

        assertThat(stringValue, is("100000.0"));
    }

    /**
     * Meditate on the String value of a floating point number that exceeds the maximum level of precision.
     * Consider the value of the double d, make d larger than exceed the maximum precision and examine the String representation
     */
    @Koan
    public void reflectOnProducingTheStringValueInfinity() {
        double d = 1.0e+308;

        String stringValue = "";

        /* (@_@) */
        /* (^_^) */

        assertThat(stringValue, is("Infinity"));
    }

    /**
     * Meditate on producing a String value on Not a Number "NaN" given the double value d;
     */
    @Koan
    public void reflectOnProducingTheStringValueNaN() {
        double d = 0.0;

        String stringValue = "";

        /* (@_@) */
        /* (^_^) */

        assertThat(stringValue, is("NaN"));
    }

    /**
     * Meditate on how to produce an ArithmeticException and receive the exception message expected.
     */
    @Koan
    public void reflectOnHowAnArithmeticExceptionCanOccur() {
        int toCauseException = 100;
        try {

            /* (@_@) */
            /* (^_^) */

            fail();
        } catch (ArithmeticException ae) {
            assertThat(ae.getMessage(), is("/ by zero"));
        }
    }


    /**
     *  Meditate on how many sweets you can buy in the shop with 1 dollar represented as a float given the following
     *
     *  1st Item = 0.10      5th Item = 0.50
     *  2nd Item = 0.20      6th Item = 0.60
     *  3rd Item = 0.30      7th Item = 0.70
     *  4th Item = 0.40      8th Item = 0.80
     *  ===========================================
     *  Total 4 Items  = 0.10 + 0.20 + 0.30 + 0.40 = $1.00
     */
    @Koan
    public void reflectOnFloatBeingAPoorChoiceToRepresentCurrency() {

        float cash = 1.00f;

        int expectedNumberOfSweets = 0;

        /* (@_@) */
        /* (^_^) */

        int actualNumberOfSweets = sweetShop.howManySweetsCanIAffordForAFloat(cash);

        assertThat(expectedNumberOfSweets, is(actualNumberOfSweets));
    }

    /**
     * Mediate on how many sweets you can buy at the same shop when using BigDecimal to represent currency
     */
    @Koan
    public void reflectOnBigDecimalBeingABetterChoiceForCurrency() {

        BigDecimal cash = new BigDecimal("1.00");

        int expectedNumberOfSweets = 0;

        /* (@_@) */
        /* (^_^) */

        int noItems = sweetShop.howManySweetsCanIAffordForABigDecimal(cash);

        assertThat(expectedNumberOfSweets, is(noItems));
    }

    /**
     * Mediate on how many sweets you can buy at the same shop when using an int to represent currency
     */
    @Koan
    public void reflectOnIntBeingABetterAndMoreEfficientChoiceForCurrency() throws Exception {

        int cash = 100;

        int expectedNumberOfSweets = 0;

        /* (@_@) */
        /* (^_^) */

        int noItems = sweetShop.howManySweetsCanIAffordForAnInt(cash);

        assertThat(expectedNumberOfSweets, is(noItems));
    }


    @Before
    public void setUp() {
        sweetShop = new SweetShop();
    }

}
