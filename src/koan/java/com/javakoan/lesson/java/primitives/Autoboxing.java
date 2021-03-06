package com.javakoan.lesson.java.primitives;


import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsSame.sameInstance;

/**
 * This set of Koans aims to improve the students understanding of Autoboxing and Unboxing
 *
 * Recommend reading: http://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
 */
@RunWith(KoanRunner.class)
public class Autoboxing {

    /**
     * Meditate on the meaning of Autoboxing when assigning variables
     */
    @Koan
    public void reflectedOnAutoboxingWithAssignment(){
        Integer i = new Integer(0);

        /* (@_@) */

        /* (^_^) */

        assertThat(i, is(5));
    }

    /**
     * Meditate on the meaning of Autoboxing when calling methods
     */
    @Koan
    public void reflectedOnAutoboxingWhenPassingParametersWhileCallingSquareOf(){
        int i = Boxer.squareOf(new Integer(10));

        /* (@_@) */

        /* (^_^) */

        assertThat(i, is(25));
    }


    /**
     * Meditate on the meaning of Unboxing when assigning values
     */
    @Koan
    public void reflectedOnUnboxingWithAssignment(){
        int i = 0;

        /* (@_@) */

        /* (^_^) */

        assertThat(i, is(5));
    }

    /**
     * Meditate on the a more likely occurrence of unboxing when assigning values
     */
    @Koan
    public void reflectedOnUnboxingWithAssignmentInALoop(){
        List<Integer> integers = Arrays.asList(1, 2, 3);

        int sum = 0;

        for (Integer i : integers){
            /* (@_@) */

            /* (^_^) */
        }

        assertThat(sum, is(6));
    }

    /**
     * Meditate on the meaning of unboxing when calling methods
     */
    @Koan
    public void reflectedOnUnboxingWhenPassingParametersWhileCallingDoubleOf(){
        int i = Boxer.doubleOf(10);

        /* (@_@) */

        /* (^_^) */

        assertThat(i, is(10));
    }


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

    @Koan
    public void reflectOnHowBoxingOccursWithValueOfNotNew(){
        Long l1 = 1L;
        Long l2 = Long.valueOf(1L);
        Long l3 = 1L;

        Long l5 = 128L;
        Long l6 = Long.valueOf(128L);

        /* (@_@) */

        /* (^_^) */

        assertThat(l1, is(sameInstance(l2)));
        assertThat(l1, not(sameInstance(l3)));

        assertThat(l5, is(sameInstance(l6)));
    }

    private static class Boxer {

        public static int squareOf(Integer number){
            return number * number;
        }

        public static int doubleOf(int number){
            return number + number;
        }
    }

}
