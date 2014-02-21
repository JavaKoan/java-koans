package com.nps.koan.primer;


import com.nicholaspaulsmith.koan.fixture.KoanRunner;
import com.nicholaspaulsmith.koan.fixture.annotation.Enlighten;
import com.nicholaspaulsmith.koan.fixture.annotation.Koan;
import com.nicholaspaulsmith.koan.fixture.annotation.Vex;
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
    @Koan  @Enlighten
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
    @Koan
    public void reflectOnProvidingTheSolutionToTheProductOfIAndJ(){
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
