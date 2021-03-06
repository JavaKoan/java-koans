package com.javakoan.lesson.java.primitives;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 10:09
 * To change this template use File | Settings | File Templates.
 */
public class SweetShop {

    public int howManySweetsCanIAffordForAFloat(float cash){
        final float TEN_CENTS = 0.10f;

        int itemsBought = 0;
        double price = TEN_CENTS;

        for (; cash >= price; price += TEN_CENTS) {
            cash -= price;
            itemsBought++;
        }

        return itemsBought;
    }

    public int howManySweetsCanIAffordForABigDecimal(BigDecimal cash){
        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;

        for (BigDecimal price = TEN_CENTS; cash.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
            cash = cash.subtract(price);
            itemsBought++;
        }

        return itemsBought;
    }

    public int howManySweetsCanIAffordForAnInt(int cash){
        final int TEN_CENTS = 10;

        int itemsBought = 0;

        for (int price = TEN_CENTS; cash >= price ; price += TEN_CENTS ) {
            cash -= price;
            itemsBought++;
        }

        return itemsBought;
    }
}
