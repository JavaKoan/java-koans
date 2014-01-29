package com.nps.koan.primitives;

import com.nps.koan.fixture.KoanRunner;
import com.nps.koan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 16:12
 * To change this template use File | Settings | File Templates.
 */
@RunWith(KoanRunner.class)
public class AutoBoxListFail {


    /**
     * Meditate on the difference between removing elements from a Set and List.
     */
    @Koan
    public void reflectOnTheDifferencesBetweenCollectionImplementationsWhenRemovingItems(){

        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i);
        }

        String expectedSetOutput = "";
        String expectedListOutput = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(set.toString(), is(expectedSetOutput));
        assertThat(list.toString(), is(expectedListOutput));
    }

    /**
     * Meditate on how to remove the actual object from a List.
     */
    @Koan
    public void reflectOnHowToRemoveElementsInAListWithCasting(){
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            /* (@_@) */

            /* (^_^) */
        }

        String expectedOutput = "[-3, -2, -1]";

        assertThat(set.toString(), is(expectedOutput));
        assertThat(list.toString(), is(expectedOutput));
    }

    /**
     * Meditate further on how to remove the actual object from a List.
     */
    @Koan
    public void reflectOnHowToRemoveElementsInAListWithValueOf(){
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            /* (@_@) */

            /* (^_^) */
        }

        String expectedOutput = "[-3, -2, -1]";

        assertThat(set.toString(), is(expectedOutput));
        assertThat(list.toString(), is(expectedOutput));
    }
}
