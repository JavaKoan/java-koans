package com.nps.koan.patterns.decorator.ex2;

import com.nps.patterns.decorator.ex2.L33tSp34kInputStream;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/08/13
 * Time: 11:42
 * To change this template use File | Settings | File Templates.
 */
public class L33tSp34kInputStreamTest {

    @Test
    public void shouldSp34kL33t(){
        int character;

        String stringUnderTest = "";

        try {
            InputStream in = new L33tSp34kInputStream(new StringBufferInputStream("I want to speak leet"));

            while((character = in.read()) >= 0){
                stringUnderTest += (char)character;
            }

            in.close();
        } catch (IOException ioe) {
            fail("Test failed with exception: " + ioe.getMessage());
        }

        assertEquals("I w4nt to sp34k l33t", stringUnderTest);
    }
}
