package patterns.decorator.domain;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/08/13
 * Time: 11:14
 * To change this template use File | Settings | File Templates.
 */
public class Liquor extends PieDecorator {

    public Liquor(Pie pie){
        this.pie = pie;
    }

    @Override
    public int cost() {
        return pie.cost() + 50;
    }

    @Override
    public String getDescription() {
        return pie.getDescription() + ", Liquor";
    }
}
