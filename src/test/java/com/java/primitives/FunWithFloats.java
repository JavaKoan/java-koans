package com.java.primitives;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;


public class FunWithFloats {

    private SweetShop sweetShop = new SweetShop();

    @Test
    public void shouldProduce100000(){
        float f = 1.0e+4f;

        String stringValue = String.valueOf(f*10);

        assertEquals("100000.0", stringValue);
    }

    @Test
    public void shouldProduceInfinity(){
        double d = 1.0e+308;

        String stringValue = String.valueOf(d*10);

        assertEquals("Infinity", stringValue);
    }

    @Test
    public void shouldProduceANan(){
        double d = 0.0/0.0;

        assertEquals(Double.NaN, d);

        String stringValue = String.valueOf(d);

        assertEquals("NaN", stringValue);
    }

    @Test
    public void shouldThrowArithmeticException(){
        try {
            int throwException = 0/0;
            fail();
        } catch (ArithmeticException ae) {
            assertEquals("/ by zero", ae.getMessage());
        }
    }

    // 1st Item = 0.10      5th Item = 0.50
    // 2nd Item = 0.20      6th Item = 0.60
    // 3rd Item = 0.30      7th Item = 0.70
    // 4th Item = 0.40      8th Item = 0.80
    // ===========================================
    // Total 4 Items  = 1.00

    @Test
    public void wontBeAbleToAffordFourItemsWithOneDoubleCurrency() throws Exception {

        double cash = 1.00;

        int noItems = sweetShop.howManySweetsCanIAffordForADouble(cash);

        assertEquals(4, noItems);
    }

    @Test
    public void shouldBeAbleToAffordFourItemsWithOneCurrency() throws Exception {

        BigDecimal cash = new BigDecimal("1.00");

        int noItems = sweetShop.howManySweetsCanIAffordForABigDecimal(cash);

        assertEquals(4, noItems);
    }

    @Test
    public void shouldBeAbleToAffordFourItemsWithOneHundredCurrencies() throws Exception {

        int cash = 100;

        int noItems = sweetShop.howManySweetsCanIAffordForAnInt(cash);

        assertEquals(4, noItems);
    }
}
