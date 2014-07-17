package com.javakoan.lesson.patterns.decorator.ex2;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Enlighten;
import com.javakoan.fixture.annotation.Koan;
import com.nps.patterns.decorator.ex2.L33tSp34kInputStream;
import org.junit.runner.RunWith;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static junit.framework.Assert.fail;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/08/13
 * Time: 11:42
 * To change this template use File | Settings | File Templates.
 */
@RunWith(KoanRunner.class)
public class InputStreamDecoratorKoan {

    /**
     * Meditate on the decorator pattern being a useful tool with regards to the mantra of 'open for extension
     * closed to modification'
     */
    @Koan  @Enlighten
    public void reflectOnTheDecoratorPatternBeingUsingInTheCoreJavaLibraries(){
        String phrase = "I want to speak leet";
        String phraseUnderMeditation = "";

        try {
            InputStream in = new L33tSp34kInputStream(new ByteArrayInputStream(phrase.getBytes("UTF8")));

            /* (@_@) */

            /* (^_^) */

            in.close();
        } catch (IOException ioe) {
            fail("Koan failed with exception: " + ioe.getMessage());
        }

        assertThat(phraseUnderMeditation, is("I w4nt to sp34k l33t"));
    }
}
