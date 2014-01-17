package com.nps.primer.koan;

import com.nps.koan.KoanRunner;
import com.nps.koan.annotation.Koan;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

/**
 * Created by nicholas_smith on 03/12/13.
 */
@RunWith(KoanRunner.class)
public class KoanBasics {

    @Koan
    public void shouldSolveKoan(){

        int a = 1;
        int b = 0;

        // (@_@)

        // (^_^)

        assertEquals(a,b);
    }

    @Koan
    public void shouldResetKoan(){

        int b = 0;

        // (@_@)
        b = 1;
        // (^_^)

        assertEquals(b, 0);
    }
}
