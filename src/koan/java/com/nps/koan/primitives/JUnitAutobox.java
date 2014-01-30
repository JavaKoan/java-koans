package com.nps.koan.primitives;

import com.nps.koan.fixture.KoanRunner;
import com.nps.koan.fixture.annotation.Koan;
import org.junit.runner.RunWith;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 30/05/13
 * Time: 09:58
 * To change this template use File | Settings | File Templates.
 */
@RunWith(KoanRunner.class)
public class JUnitAutoBox {

    /**
     *  Meditate on a subtle difference in AutoBoxing between org.junit.Assert and junit.framework.Assert and
     *  how the later silently auto boxes.
     *
     *  http://stackoverflow.com/questions/291003/differences-between-2-junit-assert-classes
     */
    @Koan
    public void reflectOnDifferenceBetweenJUnitAsserts(){
        Float boxedFloat = 1f;
        float primitiveFloat = 0f;

        /* (@_@) */
        /* (^_^) */

        org.junit.Assert.assertEquals((Float) primitiveFloat, boxedFloat);
        junit.framework.Assert.assertEquals(primitiveFloat, boxedFloat);
    }

}
