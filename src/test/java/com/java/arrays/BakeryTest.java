package com.java.arrays;

import org.junit.Before;
import org.junit.Test;


/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 30/05/13
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */
public class BakeryTest {

    Bakery bakery;

    @Before
    public void setUp(){
        bakery = new Bakery();
    }

    @Test
    public void shouldProveThereIsNoCostForReturningEmptyArrays(){

        bakery = new Bakery();

        Bakery.Pie[] pies = bakery.getPies();



    }
}
