package com.java.varargs;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 30/05/13
 * Time: 10:20
 * To change this template use File | Settings | File Templates.
 */
public class ImprovedCompute {

    static int max(int... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Too few arguments");
        }
        int max = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] > max){
                max = args[i];
            }
        }
        return max;
    }

}
