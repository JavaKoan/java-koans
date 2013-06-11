package com.java.objects;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 13/05/13
 * Time: 13:24
 * To change this template use File | Settings | File Templates.
 */
public class MyObjectTest {

    @Test
    public void shouldBeCreatedByConstructor(){

        MyObject myObject = new MyObject();

        assertEquals(MyObject.CreatedBy.CONSTRUCTOR, myObject.getCreatedBy());
    }

}
