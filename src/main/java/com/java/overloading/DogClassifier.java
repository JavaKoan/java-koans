package com.java.overloading;

import com.java.overriding.Beagle;
import com.java.overriding.Dog;
import com.java.overriding.Snoopy;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */
public class DogClassifier {

    public static String classify(Beagle beagle) {
        return "It's a Beagle";
    }

    public static String classify(Snoopy snoopy) {
        return "It's Snoopy!";
    }

    public static String classify(Dog dog) {
        return "It's just some mongrel";
    }


    public static String classifyAnyDog(Dog dog) {
        return dog instanceof Snoopy ? "It's Snoopy!" :
                dog instanceof Beagle ? "It's a Beagle" :
                        "It's just some mongrel";
    }
}
