package com.javakoan.lesson.java.varargs;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 30/05/13
 * Time: 10:20
 * To change this template use File | Settings | File Templates.
 */
public class Compute {

    public static int max(int firstArg, int... remainingArgs) {
        int max = firstArg;
        for (int arg : remainingArgs) {
            if (arg > max) {
                max = arg;
            }
        }
        return max;
    }
}
