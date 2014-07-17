package com.javakoan.lesson.java.overloading;

import com.nps.java.overloading.DogClassifier;
import com.nps.java.overriding.Beagle;
import com.nps.java.overriding.Dog;
import com.nps.java.overriding.Snoopy;
import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 16:37
 * To change this template use File | Settings | File Templates.
 */
@RunWith(KoanRunner.class)
public class OverloadingBasics {

    /**
     * Meditate on the fact that unlike overriding which occurs at run-time, overloading is assessed at compile time
     */
    @Koan
    public void meditateThatOverloadingIsAssessedAtCompileTime(){
        Dog[] dogs = { new Dog(), new Beagle(), Snoopy.getInstance() };

        List<String> typeResponses = new ArrayList<>();

        for (Dog d : dogs) {
            typeResponses.add(DogClassifier.classify(d));
        }

        String firstDogClassification = "It's just some mongrel";
        String secondDogClassification = "It's a Beagle";
        String thirdDogClassification = "It's Snoopy!";

        /* (@_@) */

        /* (^_^) */

        assertThat(typeResponses.get(0), is(firstDogClassification));
        assertThat(typeResponses.get(1), is(secondDogClassification));
        assertThat(typeResponses.get(2), is(thirdDogClassification));
    }

    /**
     * Meditate on using alternative approaches when functionality can be easily misinterpreted.
     */
    @Koan
    public void meditateOnHowToResolveOverloadingConfusion(){
        Dog[] dogs = { new Dog(), new Beagle(), Snoopy.getInstance() };

        List<String> typeResponses = new ArrayList<>();

        for (Dog d : dogs) {
            typeResponses.add(DogClassifier.classifyAnyDog(d));
        }

        String firstDogClassification = "It's just some mongrel";
        String secondDogClassification = "It's just some mongrel";
        String thirdDogClassification = "It's just some mongrel";

        /* (@_@) */

        /* (^_^) */

        assertThat(typeResponses.get(0), is(firstDogClassification));
        assertThat(typeResponses.get(1), is(secondDogClassification));
        assertThat(typeResponses.get(2), is(thirdDogClassification));
    }
}
