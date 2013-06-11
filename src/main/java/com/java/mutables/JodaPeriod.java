package com.java.mutables;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 29/05/13
 * Time: 15:01
 * To change this template use File | Settings | File Templates.
 */
public class JodaPeriod {

    private DateTime start;
    private DateTime end;

    public JodaPeriod(DateTime start, DateTime end) {

        if(start.isAfter(end)){
            throw new IllegalArgumentException("Start Must Be Before End");
        }

        this.start = start;
        this.end = end;
    }

    public DateTime getStart() {
        return start;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public DateTime getEnd() {
        return end;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }
}
