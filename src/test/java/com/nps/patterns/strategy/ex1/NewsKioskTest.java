package com.nps.patterns.strategy.ex1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.nps.patterns.strategy.domain.Customer;
import com.nps.patterns.strategy.domain.Magazine;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 10/07/13
 * Time: 14:26
 * To change this template use File | Settings | File Templates.
 */
public class NewsKioskTest {

    private final ByteArrayOutputStream systemOutContent = new ByteArrayOutputStream();

    private NewsKiosk newsKiosk;

    private final int MAGAZINE_EDITION = 2;
    private final String MAGAZINE_CONTENT_A = "Lorem ipsum dolor sit amet, consectetur adipisicing elit";
    private final String MAGAZINE_CONTENT_B = "But I must explain to you how all this mistaken idea of";

    private final String TOM = "Tom";
    private final String HARRY = "Harry";


    @Before
    public void setUp(){
        newsKiosk = new NewsKiosk();
    }


    @Test
    public void shouldPushMagazineToCustomer(){
        Customer tom = new Customer(TOM, new AcquirementByDelivery(), newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT_A, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublished(magazine);

        String outputUnderTest = systemOutContent.toString().trim();
        assertEquals(TOM + " is reading: " + MAGAZINE_CONTENT_A, outputUnderTest);
    }

    @Test
    public void shouldAllowPullForCustomer(){
        Customer tom = new Customer(TOM, new AcquirementByCollection(), newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT_A, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublishedCollectionOnly(magazine);

        String outputUnderTest = systemOutContent.toString().trim();
        assertEquals(TOM + " is reading: " + MAGAZINE_CONTENT_A, outputUnderTest);

        outputUnderTest = systemOutContent.toString().trim();
        assertEquals(TOM + " is reading: " + MAGAZINE_CONTENT_A, outputUnderTest);
    }

    @Test
    public void shouldNotPushToDeliveryCustomer(){
        Customer tom = new Customer(TOM, new AcquirementByDelivery(), newsKiosk);
        Customer harry = new Customer(HARRY, new AcquirementByCollection(), newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT_A, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublishedCollectionOnly(magazine);

        String tomIsReading = TOM + " is reading: " + MAGAZINE_CONTENT_A;
        String harryIsReading = HARRY + " is reading: " + MAGAZINE_CONTENT_A;

        String outputUnderTest = systemOutContent.toString().trim();

        assertTrue(outputUnderTest.contains(harryIsReading));
        assertFalse(outputUnderTest.contains(tomIsReading));
    }

    @Test
    public void shouldBeAbleToChangeCustomerAcquisitionBehaviour(){
        Customer tom = new Customer(TOM, new AcquirementByDelivery(), newsKiosk);

        Magazine magazineA = new Magazine(MAGAZINE_CONTENT_A, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublishedCollectionOnly(magazineA);

        tom.setBehavior(new AcquirementByCollection());

        Magazine magazineB = new Magazine(MAGAZINE_CONTENT_B, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublishedCollectionOnly(magazineB);

        String tomIsReadingA = TOM + " is reading: " + MAGAZINE_CONTENT_A;
        String tomIsReadingB = TOM + " is reading: " + MAGAZINE_CONTENT_B;
        String outputUnderTest = systemOutContent.toString().trim();

        assertFalse(outputUnderTest.contains(tomIsReadingA));
        assertTrue(outputUnderTest.contains(tomIsReadingB));
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
