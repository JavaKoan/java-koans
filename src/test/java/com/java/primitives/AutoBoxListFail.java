package com.java.primitives;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
public class AutoBoxListFail {

    private static final String expectedOutput = "[-3, -2, -1]";

    @Test
    public void wontPrintTheSameList(){
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i);
        }

        assertEquals(expectedOutput, set.toString());
        assertEquals(expectedOutput, list.toString());
    }

    @Test
    public void shouldPrintSameListWithCast(){
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove((Integer)i);
        }

        assertEquals(expectedOutput, set.toString());
        assertEquals(expectedOutput, list.toString());
    }

    @Test
    public void shouldPrintSameListWithValueOf(){
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(Integer.valueOf(i));
        }

        assertEquals(expectedOutput, set.toString());
        assertEquals(expectedOutput, list.toString());
    }
}
