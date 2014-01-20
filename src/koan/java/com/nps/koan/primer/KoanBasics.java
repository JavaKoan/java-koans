package com.nps.koan.primer;

import com.nps.koan.KoanRunner;
import com.nps.koan.annotation.Enlighten;
import com.nps.koan.annotation.Koan;
import com.nps.koan.annotation.Vex;
import org.junit.runner.RunWith;

import static junit.framework.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Created by nicholas_smith on 03/12/13.
 */
@RunWith(KoanRunner.class)
public class KoanBasics {


    /**
     * Grasshoppers should meditate on how to make the product int equal to 50.
     */
    @Koan
    public void makeTheProductOfIAndJ(){
        int i = 10;
        int j = 5;
        int product = 0;

        /* (@_@) */
        product = i * j;
        /* (^_^) */

        assertThat(product, is(50));
    }

    /**
     * Grasshoppers should use this koan to understand how to reach enlightenment
     */
    @Koan @Enlighten
    public void provideTheSolutionToTheProductOfIAndJ(){
        int i = 10;
        int j = 5;
        int product = 0;

        /* (@_@) */
        product = i * j;
        /* (^_^) */

        assertThat(product, is(50));
    }

    /**
     * Grasshoppers should use this koan to understand that koans with start and end markers are ignored.
     */
    @Koan
    public void shouldIgnoreIfKoanDoesNotHaveStartAndEnd(){
        fail("This Koan should be ignored as it has no start (@_@) and end (^_^) markers");
    }

    /**
     * Grasshoppers should use this koan to understand that one cannot be Vexed and Enlightened at the same time.
     */
    @Koan @Vex @Enlighten
    public void shouldIgnoreWhenVexedAndEnlightened(){
        /* (@_@) */
        fail("This Koan should be ignored as it is both Vexed and Enlightened");
        /* (^_^) */
    }
}
