package patterns.observer.ex1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import patterns.observer.domain.Magazine;
import patterns.observer.domain.Paper;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
public class NewsKioskTest {

    private final ByteArrayOutputStream systemOutContent = new ByteArrayOutputStream();

    private NewsKiosk newsKiosk;

    private final int MAGAZINE_EDITION = 1;

    private final String MAGAZINE_CONTENT = "Lorem ipsum dolor sit amet, consectetur adipisicing elit";
    private final String PAPER_CONTENT = "But I must explain to you how all this mistaken idea of";

    private final String TOM = "Tom";
    private final String DICK = "Dick";
    private final String HARRY = "Harry";

    @Before
    public void setUp(){
        newsKiosk = new NewsKiosk();
    }

    @Test
    public void shouldPushPaperToCustomer(){
        HomeDeliveryCustomer tom = new HomeDeliveryCustomer(TOM, newsKiosk);

        Paper paper = new Paper(PAPER_CONTENT);
        newsKiosk.newPaperPublished(paper);

        String outputUnderTest = systemOutContent.toString().trim();
        assertEquals(TOM + " is reading: " + PAPER_CONTENT, outputUnderTest);
    }

    @Test
    public void shouldAllowPullForCustomer(){
        CollectionCustomer harry = new CollectionCustomer(HARRY, newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublished(magazine);

        String outputUnderTest = systemOutContent.toString().trim();
        assertEquals(HARRY + " is reading: " + MAGAZINE_CONTENT, outputUnderTest);
    }

    @Test
    public void wontPublishInOrderSubscribersWereAdded(){
        HomeDeliveryCustomer tom = new HomeDeliveryCustomer(TOM, newsKiosk);
        HomeDeliveryCustomer dick = new HomeDeliveryCustomer(DICK, newsKiosk);
        HomeDeliveryCustomer harry = new HomeDeliveryCustomer(HARRY, newsKiosk);

        Paper paper = new Paper(PAPER_CONTENT);
        newsKiosk.newPaperPublished(paper);

        String outputUnderTest = systemOutContent.toString().trim();

        String expectedOutput = TOM + " is reading: " + PAPER_CONTENT + "\n" +
                DICK + " is reading: " + PAPER_CONTENT + "\n" +
                HARRY + " is reading: " + PAPER_CONTENT;

        assertEquals(expectedOutput, outputUnderTest);
    }

    @Before
    public void setUpSystemStreams(){
        System.setOut(new PrintStream(systemOutContent));
    }

    @After
    public void cleanUpSystemStreams() {
        System.setOut(null);
        System.setErr(null);
    }
}
