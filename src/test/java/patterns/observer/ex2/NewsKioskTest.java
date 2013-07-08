package patterns.observer.ex2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import patterns.observer.domain.Customer;
import patterns.observer.domain.Paper;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 14:58
 * To change this template use File | Settings | File Templates.
 */
public class NewsKioskTest {

    private final ByteArrayOutputStream systemOutContent = new ByteArrayOutputStream();

    private NewsKiosk newsKiosk;

    private final String PAPER_CONTENT = "But I must explain to you how all this mistaken idea of";

    private final String TOM = "Tom";

    @Before
    public void setUp(){
        newsKiosk = new NewsKiosk();
    }

    @Test
    public void shouldReadPaper(){
        Customer tom = new Customer(TOM);

        Paper paper = new Paper(PAPER_CONTENT);
        newsKiosk.newPaperPublished(paper);

        tom.read(paper);

        String outputUnderTest = systemOutContent.toString().trim();

        assertEquals(TOM + " is reading: " + PAPER_CONTENT, outputUnderTest);
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
    public void shouldNotPushPaperToCustomerAfterRemoval(){
        HomeDeliveryCustomer tom = new HomeDeliveryCustomer(TOM, newsKiosk);

        Paper paper = new Paper(PAPER_CONTENT);
        newsKiosk.newPaperPublished(paper);

        String outputUnderTest = systemOutContent.toString().trim();
        assertEquals(TOM + " is reading: " + PAPER_CONTENT, outputUnderTest);

        newsKiosk.remove(tom);
        systemOutContent.reset();

        Paper paper2 = new Paper(PAPER_CONTENT);
        newsKiosk.newPaperPublished(paper2);

        outputUnderTest = systemOutContent.toString().trim();
        assertEquals("", outputUnderTest);
    }

    @Test
    public void shouldPushOneFinalPaperAfterRemoval(){
        // TODO: Customers pay in advance so will get one last paper, before being un subscribed
    }

    @Before
    public void setUpSystemStreams(){
        System.setOut(new PrintStream(systemOutContent));
    }

    @After
    public void cleanUpSystemStreams() {
        System.setOut(null);
    }
}
