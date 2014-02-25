package com.nps.koan.varargs;

import com.nicholaspaulsmith.koan.fixture.KoanRunner;
import com.nicholaspaulsmith.koan.fixture.annotation.Koan;
import com.nps.java.varargs.BrokenCompute;
import com.nps.java.varargs.ImprovedCompute;
import com.nps.java.varargs.PerformantCompute;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 30/05/13
 * Time: 09:53
 * To change this template use File | Settings | File Templates.
 */
@RunWith(KoanRunner.class)
public class VarargsBasics {

    /**
     *  Meditate on calling a method that has been defined with a variable number of arguments of the same type.
     */
    @Koan
    public void reflectOnCallingAMethodThatHasAVariableNumberOfArguments(){

        int max = BrokenCompute.max(7, 8, 3, 4, 5);
        int maxUnderMeditation = 0;

        // (@_@)
        maxUnderMeditation = 8;
        // (^_^)

        assertThat(maxUnderMeditation, is(max));
    }

    /**
     *  Meditate on the runtime exception that can occur while calling the max method on BrokenCompute.
     */
    @Koan
    public void reflectOnHowVarargsCanIntroduceRuntimeExceptions(){

        Exception exceptionUnderMeditation = null;

        try {
            // (@_@)
            BrokenCompute.max();
            // (^_^)
        } catch (Exception ex){
            exceptionUnderMeditation = ex;
        }

        assertThat(exceptionUnderMeditation, is(instanceOf(ArrayIndexOutOfBoundsException.class)));
    }


    /**
     *  Meditate on explicitly handling the case where zero arguments are passed.
     */
    @Koan
    public void reflectOnAddingExceptionHandlingForZeroArgument(){

        String messageUnderMeditation = "";

        // (@_@)
        messageUnderMeditation = "Too few arguments";
        // (^_^)

        try {
            ImprovedCompute.max();
        } catch(Exception e){
            assertThat(messageUnderMeditation, is(e.getMessage()));
        }

    }

    /**
     *  Meditate on changing the method signature to require at least one argument of the required type
     */
    @Koan
    public void reflectOnCallingAMethodThatRequiresAtLeastOneArgument(){

        int max = BrokenCompute.max(7, 8, 3, 4, 5);
        int maxUnderMeditation = 0;

        // (@_@)
        maxUnderMeditation = 8;
        // (^_^)

        assertThat(maxUnderMeditation, is(max));
    }

    @Koan
    public void shouldShowArrayCreationCostCompute(){

        long startTime = System.nanoTime();
        int max = PerformantCompute.max(1);
        long endTime = System.nanoTime();
        System.out.println("Number of Args 1: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1);
        endTime = System.nanoTime();
        System.out.println("Number of Args 1: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2);
        endTime = System.nanoTime();
        System.out.println("Number of Args 2: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3);
        endTime = System.nanoTime();
        System.out.println("Number of Args 3: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3,4);
        endTime = System.nanoTime();
        System.out.println("Number of Args 4: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3,4,5);
        endTime = System.nanoTime();
        System.out.println("Number of Args 5: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1);
        endTime = System.nanoTime();
        System.out.println("Number of Args 1: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2);
        endTime = System.nanoTime();
        System.out.println("Number of Args 2: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3);
        endTime = System.nanoTime();
        System.out.println("Number of Args 3: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3,4);
        endTime = System.nanoTime();
        System.out.println("Number of Args 4: " + (endTime-startTime));

        startTime = System.nanoTime();
        max = PerformantCompute.max(1,2,3,4,5);
        endTime = System.nanoTime();
        System.out.println("Number of Args 5: " + (endTime-startTime));
    }

/*
    Number of Args 1: 882422
    Number of Args 1: 366
    Number of Args 2: 1829
    Number of Args 3: 2194
    Number of Args 4: 3657
    Number of Args 5: 1097
    Number of Args 1: 366
    Number of Args 2: 365
    Number of Args 3: 366
    Number of Args 4: 732
    Number of Args 5: 731
*/

}

