package com.javakoan.lesson.java.mutables;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 15:11
 * To change this template use File | Settings | File Templates.
 */
public class Period {

    private Date start;
    private Date end;

    public Period(Date start, Date end) {

        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if(start.after(end)){
            throw new IllegalArgumentException("Start Must Be Before End");
        }
    }

    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }

}
