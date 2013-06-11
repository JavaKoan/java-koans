package com.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 30/05/13
 * Time: 11:38
 * To change this template use File | Settings | File Templates.
 */
public class Bakery {

    private final List<Pie> pies = callForPies();

    private static final Pie[] EMPTY_PIE_ARRAY = new Pie[0];

    // 13. Look at preventing access to mutable lists for static members (ok for non constants though)
    // 43. Return empty lists not null
    public Pie[] getPies() {
        return pies.toArray(EMPTY_PIE_ARRAY);
    }

    
    private List<Pie> callForPies() {
        return new ArrayList<Pie>();
    }

    public enum Pie{
        APPLE,
        RASPBERRY
    }
}
