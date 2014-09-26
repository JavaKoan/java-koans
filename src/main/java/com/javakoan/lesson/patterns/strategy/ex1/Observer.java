package com.javakoan.lesson.patterns.strategy.ex1;

import com.javakoan.lesson.patterns.strategy.domain.Publication;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 14:41
 * To change this template use File | Settings | File Templates.
 */
public interface Observer {

    public void update(Subject subject, Publication publication);
}
