package com.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 13:08
 * To change this template use File | Settings | File Templates.
 */
public class StringConcatenationTest {

    final String longString = "ImALongStringImALongStringImALongStringImALongString";

    @Test
    public void shouldShowStringConcatenationTakesLonger(){

        String result = "";

        long startTime = System.nanoTime();

        for(int i = 0; i < 100; i++){
            result += longString;
        }

        long endTime = System.nanoTime();

        long concatenationTime = endTime - startTime;

        StringBuilder sbResult = new StringBuilder("");

        startTime = System.nanoTime();

        for(int i = 0; i < 100; i++){
            sbResult.append(longString);
        }

        endTime = System.nanoTime();

        long sbTime = endTime - startTime;

        assertTrue(concatenationTime>sbTime);

        System.out.println(concatenationTime);
        System.out.println(sbTime);
        System.out.print(concatenationTime/sbTime);
    }
}
