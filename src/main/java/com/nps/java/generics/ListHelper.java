package com.nps.java.generics;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 12/11/13
 * Time: 09:03
 * To change this template use File | Settings | File Templates.
 */
public class ListHelper {

    public String getFirstElement(List<String> strings){
        return strings.get(0);
    }

//    public Integer getFirstElement(List<Integer> integers){  // Compilation error in 7 vs 6
//        return integers.get(0);
//    }
}
