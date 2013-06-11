package com.java.objects;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 13/05/13
 * Time: 13:19
 * To change this template use File | Settings | File Templates.
 */
public class MyObject {

    private CreatedBy createdBy;


    public MyObject() {
        createdBy = CreatedBy.CONSTRUCTOR;
    }

    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    public enum CreatedBy{
        CONSTRUCTOR,
        FACTORY
    }
}
