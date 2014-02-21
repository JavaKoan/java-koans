package com.nps.java.varargs;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 30/05/13
 * Time: 10:47
 * To change this template use File | Settings | File Templates.
 */
public class PerformantCompute {

    public static int max(int arg1) {
        return arg1;
    }

    public static int max(int arg1, int arg2) {
        return arg1 > arg2 ? arg1 : arg2;
    }

    public static int max(int arg1, int arg2, int arg3) {
        int max = arg1;

        if(arg2 > max){
            max = arg2;
        }
        if(arg3 > max){
            return arg3;
        }
        return max;
    }

    public static int max(int arg1, int arg2, int arg3, int... remainingArgs) {
        int max = max(arg1, arg2, arg3);
        for (int arg : remainingArgs) {
            if (arg > max) {
                max = arg;
            }
        }
        return max;
    }
}
