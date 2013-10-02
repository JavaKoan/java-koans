package patterns.decorator.ex1;

import org.junit.Test;
import patterns.decorator.domain.ChickenAndLeek;
import patterns.decorator.domain.Liquor;
import patterns.decorator.domain.Mash;
import patterns.decorator.domain.Pie;
import patterns.decorator.domain.SteakAndKidney;

import static junit.framework.Assert.assertEquals;

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
