package com.javakoan.lesson.java.overriding;

import com.nps.java.overriding.Beagle;
import com.nps.java.overriding.Dog;
import com.nps.java.overriding.Snoopy;
import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 16:44
 * To change this template use File | Settings | File Templates.
 */
@RunWith(KoanRunner.class)
public class TalkingDog {

    /**
     * Meditate on the role overriding plays in Java with regards to a type family
     */
    @Koan
    public void reflectOnTheNoiseDifferentDogsCanMake() {

        Dog[] dogs = { new Dog(), new Beagle(), Snoopy.getInstance() };

        String barkUnderMeditation = "";
        for (Dog dog : dogs) {
            barkUnderMeditation += dog.bark();
            barkUnderMeditation += "-";
        }

        String expectedBark = "";

        /* (@_@) */
        /* (^_^) */

        assertThat(barkUnderMeditation, is(expectedBark));
    }
}
