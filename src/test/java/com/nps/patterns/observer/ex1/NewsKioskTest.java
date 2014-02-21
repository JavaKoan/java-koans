package com.nps.patterns.observer.ex1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.nps.patterns.observer.domain.Customer;
import com.nps.patterns.observer.domain.Magazine;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

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

    private final int MAGAZINE_EDITION = 2;
    private final String MAGAZINE_CONTENT = "Lorem ipsum dolor sit amet, consectetur adipisicing elit";

    private final String TOM = "Tom";
    private final String DICK = "Dick";
    private final String HARRY = "Harry";

    @Before
    public void setUp(){
        newsKiosk = new NewsKiosk();
    }

    @Test
    public void shouldReadMagazine(){
        Customer tom = new Customer(TOM);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);

        tom.read(magazine);

        String outputUnderTest = systemOutContent.toString().trim();

        assertEquals(TOM + " is reading: " + MAGAZINE_CONTENT, outputUnderTest);
    }

    @Test
    public void shouldPushMagazineToCustomer(){
        HomeDeliveryCustomer tom = new HomeDeliveryCustomer(TOM, newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublished(magazine);

        String outputUnderTest = systemOutContent.toString().trim();
        assertEquals(TOM + " is reading: " + MAGAZINE_CONTENT, outputUnderTest);
    }

    @Test
    public void shouldAllowPullForCustomer(){
        CollectionCustomer harry = new CollectionCustomer(HARRY, newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublishedCollectionOnly(magazine);

        String outputUnderTest = systemOutContent.toString().trim();
        assertEquals(HARRY + " is reading: " + MAGAZINE_CONTENT, outputUnderTest);
    }

    @Test
    public void shouldPushMagazineToTwoCustomers(){
        HomeDeliveryCustomer tom = new HomeDeliveryCustomer(TOM, newsKiosk);
        HomeDeliveryCustomer harry = new HomeDeliveryCustomer(HARRY, newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublished(magazine);

        String outputUnderTest = systemOutContent.toString().trim();

        String tomIsReading = TOM + " is reading: " + MAGAZINE_CONTENT;
        String harryIsReading = HARRY + " is reading: " + MAGAZINE_CONTENT;

        assertTrue(outputUnderTest.contains(tomIsReading));
        assertTrue(outputUnderTest.contains(harryIsReading));
    }

    @Test
    public void shouldNotPushToDeliveryCustomer(){
        HomeDeliveryCustomer tom = new HomeDeliveryCustomer(TOM, newsKiosk);
        CollectionCustomer harry = new CollectionCustomer(HARRY, newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublishedCollectionOnly(magazine);

        String tomIsReading = TOM + " is reading: " + MAGAZINE_CONTENT;
        String harryIsReading = HARRY + " is reading: " + MAGAZINE_CONTENT;

        String outputUnderTest = systemOutContent.toString().trim();

        assertTrue(outputUnderTest.contains(harryIsReading));
        assertFalse(outputUnderTest.contains(tomIsReading));
    }

    @Test
    public void wontPublishInOrderSubscribersWereAdded(){
        HomeDeliveryCustomer tom = new HomeDeliveryCustomer(TOM, newsKiosk);
        HomeDeliveryCustomer dick = new HomeDeliveryCustomer(DICK, newsKiosk);
        HomeDeliveryCustomer harry = new HomeDeliveryCustomer(HARRY, newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublished(magazine);

        String outputUnderTest = systemOutContent.toString().trim();

        String expectedOutput = TOM + " is reading: " + MAGAZINE_CONTENT + "\n" +
                DICK + " is reading: " + MAGAZINE_CONTENT + "\n" +
                HARRY + " is reading: " + MAGAZINE_CONTENT;

        assertEquals(expectedOutput, outputUnderTest);
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
