package com.javakoan.lesson.java.varargs;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 30/05/13
 * Time: 09:53
 * To change this template use File | Settings | File Templates.
 */
public class BrokenCompute {

    public static int max(int ... args) {
        int max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] > max){
                max = args[i];
            }
        }
        return max;
    }
}
