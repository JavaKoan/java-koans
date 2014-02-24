package com.nps.koan.generics;

import com.nicholaspaulsmith.koan.fixture.KoanRunner;
import com.nicholaspaulsmith.koan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nicholas_smith on 24/02/14.
 */
@RunWith(KoanRunner.class)
public class GenericsBasics {


    /**
     * Meditate on why we use generics and what common problem can occur without them.
     */
    @Koan
    public void reflectOnCompileTimeSafetyOfGenerics(){
        List strings = new ArrayList();
        strings.add("A");
        strings.add(999);
        strings.add(new Object());

        String element = null;
        String exceptionMessage = null;

        // (@_@)

        // (^_^)

        assertThat(exceptionMessage, is("java.lang.Integer cannot be cast to java.lang.String"));
    }

}
