package com.nps.java.mutables;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 14:50
 * To change this template use File | Settings | File Templates.
 */
public class BrokenPeriod {

    private Date start;
    private Date end;

    public BrokenPeriod(Date start, Date end) {

        if(start.after(end)){
            throw new IllegalArgumentException("Start Must Be Before End");
        }

        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}
