package com.javakoan.lesson.java.overriding;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Enlighten;
import com.javakoan.fixture.annotation.Koan;
import com.javakoan.fixture.annotation.Vex;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * This set of Koans aims to improve the students understanding of overriding
 *
 * Recommend reading: http://docs.oracle.com/javase/tutorial/java/IandI/override.html
 */
@RunWith(KoanRunner.class)
public class Overriding {

    /**
     * Meditate on the noise a dog makes
     */
    @Koan
    public void reflectOnCallingAMethodOnAClass() {

        Dog aDog = new Dog();

        String expectedBark = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(aDog.bark(), is(expectedBark));
    }

    /**
     * Meditate on the noise a beagle makes, and how overriding is assessed at run time.
     */
    @Koan
    public void reflectOnTheNoiseABeagleMakes() {

        Dog aBeagle = new Beagle();

        String expectedBark = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(aBeagle.bark(), is(expectedBark));
    }

    /**
     * Meditate on the usefulness of overriding in collections
     */
    @Koan
    public void reflectOnIteratingOverDogsInACollection() {

        List<Dog> dogs = Arrays.asList(new Dog(), new Beagle(), Snoopy.getInstance());

        String barkUnderMeditation = "";
        for (Dog dog : dogs) {
            barkUnderMeditation += dog.bark();
            barkUnderMeditation += ".";
        }

        String expectedBark = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(barkUnderMeditation, is(expectedBark));
    }


    /**
     * Meditate on the a hiding static methods with the rollOver command.
     */
    @Koan @Enlighten
    public void reflectOnHowHidingAStaticMethodIsDifferentToOverridingAnInstanceMethod() {

        String dogRollOverResponse = "";
        String snoopyRollOverResponse = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(Dog.rollOver(), is(dogRollOverResponse));
        assertThat(Snoopy.rollOver(), is(snoopyRollOverResponse));
    }


    /**
     * Meditate on the walkies interface and its default method implementation
     */
    @Koan
    public void reflectOnTheUseOfDefaultMethodsFromInterfaces() {

        Dog aBeagle = new Beagle();

        String expectedResponse = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(aBeagle.walkies(), is(expectedResponse));
    }

    /**
     * Meditate on the walkies interface and how default methods are overridden
     */
    @Koan
    public void reflectOnUsingInheritanceToDeterminingOverriding() {

        Dog slh = new SantasLittleHelper();

        String expectedResponse = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(slh.walkies(), is(expectedResponse));
    }

    /**
     * Meditate on the cartoon and modern cartoon interface hierarchy
     */
    @Koan
    public void reflectOnInheritanceOfDefaultMethodsWithInterfaces() {

        Cartoon snoopy = Snoopy.getInstance();
        Cartoon slh = new SantasLittleHelper();

        String snoopyIsDrawnBy = "";
        String slhIsDrawnBy = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(snoopy.drawnBy(), is(snoopyIsDrawnBy));
        assertThat(slh.drawnBy(), is(slhIsDrawnBy));
    }


    /**
     * Meditate on the overriding interface methods with default methods in the interface hierarchy
     */
    @Koan
    public void reflectOnOverridingInterfaceMethodsWithDefaultMethods() {

        Cartoon snoopy = Snoopy.getInstance();
        Cartoon slh = new SantasLittleHelper();

        String snoopysFirstAppearance = "";
        String slhFirstAppearance = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(snoopy.firstAppearance(), is(snoopysFirstAppearance));
        assertThat(slh.firstAppearance(), is(slhFirstAppearance));
    }
}
