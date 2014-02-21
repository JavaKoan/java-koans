package com.nps.patterns.factory.ex1;

import com.nps.patterns.factory.domain.Pie;

/**
 * Created by nicholas_smith on 26/11/13.
 */
public abstract class PieFactory {



    public Pie orderPie(){

        return createPie();
    }

    protected abstract Pie createPie();

    public static enum PIE{
        POT,
        SWEENIE_TODD
    }
}
