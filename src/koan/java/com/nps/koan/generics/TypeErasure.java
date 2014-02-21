package com.nps.koan.generics;

import com.java.generics.ListHelper;
import com.nicholaspaulsmith.koan.fixture.KoanRunner;
import com.nicholaspaulsmith.koan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertSame;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 12/11/13
 * Time: 09:04
 * To change this template use File | Settings | File Templates.
 */
@RunWith(KoanRunner.class)
public class TypeErasure {

    private final Integer ONE = 1;
    private final Integer TWO = 2;
    private final Integer THREE = 3;

    @Koan
    public void shouldReturnFirstString(){
        ListHelper listHelper = new ListHelper();
        List<String> strings = Arrays.asList("A", "B", "C");
        assertSame("A", listHelper.getFirstElement(strings));
    }

//    Uncomment these tests to see how type generics works in Java 1.6
//    @Test
//    public void shouldReturnFirstInteger(){
//
//        List<Integer> integers = Arrays.asList(ONE, TWO, THREE);
//        assertSame(ONE, listHelper.getFirstElement(integers));
//    }
//
//    @Test
//    public void shouldFailDifferentTypesCantBeEqual(){
//        List<Integer> integers = Arrays.asList(ONE, TWO, THREE);
//        assertEquals("1", listHelper.getFirstElement(integers));
//    }
}
