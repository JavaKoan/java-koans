package com.java.overriding;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 16:44
 * To change this template use File | Settings | File Templates.
 */
public class DogTest {

    @Test
    public void shouldBarkLikeAllDogs() {
        String expectedBark = "woof-woof-yap-yap-yum-peanuts-";

        Dog[] dogs = { new Dog(), new Beagle(), new Snoopy() };

        String barkUnderTest = "";
        for (Dog dog : dogs) {
            barkUnderTest += dog.bark();
            barkUnderTest += "-";
        }

        assertEquals(expectedBark, barkUnderTest);
    }
}
