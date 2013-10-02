package patterns.strategy.domain;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 11:06
 * To change this template use File | Settings | File Templates.
 */
public class Magazine extends Publication {

    private int edition;

    public Magazine(String content, int edition) {
        super(content);
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }
}
