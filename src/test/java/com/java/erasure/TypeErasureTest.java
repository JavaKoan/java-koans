package com.java.erasure;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertSame;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 12/11/13
 * Time: 09:04
 * To change this template use File | Settings | File Templates.
 */
public class TypeErasureTest {

    private TypeErasure typeErasure;

    private final Integer ONE = 1;
    private final Integer TWO = 2;
    private final Integer THREE = 3;

    @Before
    public void setUp(){
        typeErasure = new TypeErasure();
    }

    @Test
    public void shouldReturnFirstString(){
        List<String> strings = Arrays.asList("A", "B", "C");
        assertSame("A", typeErasure.getFirstElement(strings));
    }

    @Test
    public void shouldReturnFirstInteger(){

        List<Integer> integers = Arrays.asList(ONE, TWO, THREE);
        assertSame(ONE, typeErasure.getFirstElement(integers));
    }

    @Test
    public void shouldFailDifferentTypesCantBeEqual(){
        List<Integer> integers = Arrays.asList(ONE, TWO, THREE);
        assertEquals("1", typeErasure.getFirstElement(integers));
    }
}
