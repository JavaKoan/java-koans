package com.javakoan.lesson.patterns.decorator.ex1;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import com.nps.patterns.decorator.domain.ChickenAndLeek;
import com.nps.patterns.decorator.domain.Liquor;
import com.nps.patterns.decorator.domain.Mash;
import com.nps.patterns.decorator.domain.Pie;
import com.nps.patterns.decorator.domain.SteakAndKidney;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(KoanRunner.class)
public class PieDecoratorKoan {


    /**
     * Meditate on how to decorate a Pie object with mash.
     */
    @Koan
    public void reflectOnThePriceOfAChickenAndLeekPieWithMash(){
        Pie pie = new ChickenAndLeek();

        /* (@_@) */

        /* (^_^) */

        assertThat(pie.cost(), is(350));
    }


    /**
     * Meditate on the what the description of the pie will be after adding liquor
     */
    @Koan
    public void reflectOnTheDescriptionOfAChickenAndLeekPieWithMash(){
        Pie pie = new ChickenAndLeek();
        pie = new Liquor(pie);

        String descriptionUnderMeditation = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(descriptionUnderMeditation, is(pie.getDescription()));
    }

    /**
     * Mediate on how to construct a steak and kidney pie with double mash and liquor
     */
    @Koan
    public void reflectOneUsingAddingTheSameDecorationTwice(){
        Pie pie = new SteakAndKidney();

        /* (@_@) */

        /* (^_^) */

        assertThat(pie.cost(), is(550));
    }

    /**
     * Meditate on the implementation of your decorator can produce different results depending on the decoration order.
     */
    @Koan
    public void reflectOnTheDecorationOrderBeingImportant(){
        Pie pie = new SteakAndKidney();
        pie = new Mash(pie);
        pie = new Liquor(pie);
        pie = new Mash(pie);

        String descriptionUnderMeditation = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(descriptionUnderMeditation, is(pie.getDescription()));
    }
}
