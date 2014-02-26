package com.nps.koan.patterns.decorator.ex1;

import com.nicholaspaulsmith.koan.fixture.KoanRunner;
import org.junit.Test;
import com.nps.patterns.decorator.domain.ChickenAndLeek;
import com.nps.patterns.decorator.domain.Liquor;
import com.nps.patterns.decorator.domain.Mash;
import com.nps.patterns.decorator.domain.Pie;
import com.nps.patterns.decorator.domain.SteakAndKidney;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;

@RunWith(KoanRunner.class)
public class PieTest {

    @Test
    public void chickenAndLeekPieWithMashShouldCost350(){
        Pie pie = new ChickenAndLeek();
        pie = new Mash(pie);

        assertEquals(350, pie.cost());
    }

    @Test
    public void chickenAndLeekPieWithMashShouldHaveCorrectDescription(){
        Pie pie = new ChickenAndLeek();
        pie = new Mash(pie);

        assertEquals("A Chicken and Leek Pie, Mash", pie.getDescription());
    }

    @Test
    public void steakAndKidneyPieWithMashWithLiquorShouldCost400(){
        Pie pie = new SteakAndKidney();
        pie = new Mash(pie);
        pie = new Liquor(pie);

        assertEquals(450, pie.cost());
    }

    @Test
    public void steakAndKidneyWithMashWithLiquorShouldHaveCorrectDescription(){
        Pie pie = new SteakAndKidney();
        pie = new Mash(pie);
        pie = new Liquor(pie);

        assertEquals("Classic Steak and Kidney Pie, Mash, Liquor", pie.getDescription());
    }
}
