package com.java.overloading;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */
public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "Set";
    }

    public static String classify(List<?> lst) {
        return "List";
    }

    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }

    public static String classifyAnyCollection(Collection<?> c) {
        return c instanceof Set  ? "Set" :
                c instanceof List ? "List" : "Unknown Collection";
    }
}
