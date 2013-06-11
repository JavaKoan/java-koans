package com.java.threads;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 28/05/13
 * Time: 13:26
 * To change this template use File | Settings | File Templates.
 */
public class BooleanPollThread {

    private static boolean stopRequested;

    public static void pollIndefinitely() throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (!stopRequested){
                    System.out.print(i++);
                }
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

}
