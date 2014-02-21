package com.nps.koan.strings;

import com.nicholaspaulsmith.koan.fixture.KoanRunner;
import com.nicholaspaulsmith.koan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 13:08
 * To change this template use File | Settings | File Templates.
 */
@RunWith(KoanRunner.class)
public class StringConcatenation {

    private final String COMPILER = "compiler";

    /**
     * Meditate on the use of StringBuilder and the performance benefits it can bring
     *
     * Hint: Create a for loop concatenating a string similar to the StringBuilder portion of code.
     */
    @Koan
    public void meditateOnTheUseOfStringBuilder(){

        String sampleString = "The " + COMPILER + "automatically handles efficiencies with string concatenation on one line...";
        long startTime, endTime, sbTime, concatenationTime;

        // Start StringBuilder
        StringBuilder sbResult = new StringBuilder("");

        startTime = System.nanoTime();
        for(int i = 0; i < 50; i++){
            sbResult.append(sampleString);
        }
        endTime = System.nanoTime();
        sbTime = endTime - startTime;
        // End StringBuilder

        // Start String Concatenation
        String result = "";
        startTime = System.nanoTime();
        //  (@_@)

        //  (^_^)
        endTime = System.nanoTime();
        concatenationTime = endTime - startTime;
        // End String Concatenation

        assertTrue(concatenationTime > sbTime);

        System.out.println(String.format("String concatenation (millis): %1$d, StringBuilder (millis): %2$d. " +
                "Times greater: %3$d", concatenationTime, sbTime, concatenationTime / sbTime ));
    }
}
