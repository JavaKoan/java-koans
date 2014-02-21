package com.nps.patterns.observer.ex2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.nps.patterns.observer.domain.Customer;
import com.nps.patterns.observer.domain.Magazine;

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

    private final int MAGAZINE_EDITION = 2;
    private final String MAGAZINE_CONTENT = "Lorem ipsum dolor sit amet, consectetur adipisicing elit";

    private final String TOM = "Tom";

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
    public void shouldNotPushMagazineToCustomerAfterRemoval(){
        HomeDeliveryCustomer tom = new HomeDeliveryCustomer(TOM, newsKiosk);

        Magazine magazine1 = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublished(magazine1);

        String outputUnderTest = systemOutContent.toString().trim();
        assertEquals(TOM + " is reading: " + MAGAZINE_CONTENT, outputUnderTest);

        newsKiosk.remove(tom);
        systemOutContent.reset();

        Magazine magazine2 = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublished(magazine2);

        outputUnderTest = systemOutContent.toString().trim();
        assertEquals("", outputUnderTest);
    }

    @Test
    public void shouldAllowPullForCustomer(){
        // TODO: Implement code of a collection/pull customer
    }

    @Test
    public void shouldPushOneFinalMagazineAfterRemoval(){
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
