package com.nps.java.threads;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 28/05/13
 * Time: 13:27
 * To change this template use File | Settings | File Templates.
 */
public class BooleanPollThreadTest {

    private BooleanPollThread booleanPollThread;

    @Test
    public void shouldPollIndefinitely() throws InterruptedException {

        booleanPollThread.pollIndefinitely();
    }

}
