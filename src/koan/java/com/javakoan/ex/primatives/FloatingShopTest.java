package com.javakoan.ex.primatives;

import com.java.primitives.FloatingShop;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 10:12
 * To change this template use File | Settings | File Templates.
 */
public class FloatingShopTest {

    private FloatingShop floatingShop = new FloatingShop();

    @Test
    public void wontBeAbleToAffordFourItemsWithOneCurrency() throws Exception {

        double cash = 1.00;

        int noItems = floatingShop.howManySweetsCanIAffordForADouble(cash);

        assertEquals(4, noItems);
    }

    @Test
    public void shouldBeAbleToAffordFourItemsWithOneCurrency() throws Exception {

        BigDecimal cash = new BigDecimal("1.00");

        int noItems = floatingShop.howManySweetsCanIAffordForABigDecimal(cash);

        assertEquals(4, noItems);
    }

    @Test
    public void shouldBeAbleToAffordFourItemsWithOneHundredCurrencies() throws Exception {

        int cash = 100;

        int noItems = floatingShop.howManySweetsCanIAffordForAnInt(cash);

        assertEquals(4, noItems);
    }
}
