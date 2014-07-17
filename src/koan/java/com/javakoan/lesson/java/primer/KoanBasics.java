package com.javakoan.lesson.java.primer;


import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Enlighten;
import com.javakoan.fixture.annotation.Koan;
import com.javakoan.fixture.annotation.Vex;
import org.junit.runner.RunWith;

import static junit.framework.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(KoanRunner.class)
public class KoanBasics {

    /**
     * Grasshoppers should meditate on how to make the product int equal to 50.
     */
    @Koan
    public void reflectOnTheProductOfIAndJ(){
        int i = 10;
        int j = 5;
        int product = 0;

        /* (@_@) Your code starts here */
        product = i * j;
        /* (^_^) Your code ends here */

        assertThat(product, is(50));
    }

    /**
     * Grasshoppers should use this koan to understand how to reach enlightenment
     */
    @Koan @Enlighten
    public void reflectOnProvidingTheSolutionToTheProductOfIAndJ(){
        int i = 10;
        int j = 5;
        int product = 0;

        /* (@_@) */

        /* (^_^) */

        assertThat(product, is(50));
    }

    /**
     * Grasshoppers should use this koan to understand how to return to a starting problem
     */
    @Koan
    public void reflectOnProvidingTheStartingProblemForAKoan(){
        int i = 10;
        int j = 5;

        int largest = 0;

        /* (@_@) */
        Math.max(i, j);
        /* (^_^) */

        assertThat(largest, is(i));
    }

    /**
     * Grasshoppers should use this koan to understand that koans with start and end markers are ignored.
     */
    @Koan
    public void reflectOnIgnoringIfKoanDoesNotHaveStartAndEnd(){
        fail("This Koan should be ignored as it has no start (@_@) and end (^_^) markers");
    }

    /**
     * Grasshoppers should use this koan to understand that one cannot be Vexed and Enlightened at the same time.
     */
    @Koan @Vex @Enlighten
    public void reflectOneIgnoringWhenVexedAndEnlightened(){
        /* (@_@) */
        fail("This Koan should be ignored as it is both Vexed and Enlightened");
        /* (^_^) */
    }
}
