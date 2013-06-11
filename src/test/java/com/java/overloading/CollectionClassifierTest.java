package com.java.overloading;

import org.junit.Test;

import java.math.BigInteger;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 16:37
 * To change this template use File | Settings | File Templates.
 */
public class CollectionClassifierTest {

    @Test
    public void shouldReturnAllAsUnknownCollections(){
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        for (Collection<?> c : collections) {
            assertEquals("Unknown Collection", CollectionClassifier.classify(c));
        }
    }

    @Test
    public void shouldReturnAllUnknownCollections(){
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };

        List<String> typeResponses = new ArrayList<String>();

        for (Collection<?> c : collections) {
            typeResponses.add(CollectionClassifier.classifyAnyCollection(c));
        }
        assertTrue(typeResponses.contains("Set"));
        assertTrue(typeResponses.contains("List"));
        assertTrue(typeResponses.contains("Unknown Collection"));
    }
}
