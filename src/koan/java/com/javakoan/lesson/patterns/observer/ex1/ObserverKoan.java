package com.javakoan.lesson.patterns.observer.ex1;

import com.javakoan.fixture.KoanRunner;
import com.javakoan.fixture.annotation.Koan;
import com.javakoan.lesson.patterns.observer.domain.Customer;
import com.javakoan.lesson.patterns.observer.domain.Magazine;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas_smith
 * Date: 08/07/13
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
@RunWith(KoanRunner.class)
public class ObserverKoan {

    private final ByteArrayOutputStream systemDotOutContent = new ByteArrayOutputStream();

    private NewsKiosk newsKiosk;

    private final int MAGAZINE_EDITION = 2;
    private final String MAGAZINE_CONTENT = "Lorem ipsum dolor sit amet, consectetur adipisicing elit";

    private final String TOM = "Tom";
    private final String DICK = "Dick";
    private final String HARRY = "Harry";


    /**
     * Meditate on the outcome of a customer reading a magazine
     */
    @Koan
    public void reflectOnTheOutcomeOfACustomerReadingAMagazine(){
        Customer tom = new Customer(TOM);
        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);
        tom.read(magazine);

        String outputUnderMeditation = "";

        /* (@_@) */

        /* (^_^) */

        assertThat(outputUnderMeditation, is(getSystemDotOutContent()));
    }

    /**
     * Meditate on the outcome of a new magazine being published when the argument based notify method is called
     * on the Subject
     */
    @Koan
    public void reflectOnHowObserversAreNotifiedOfUpdatesUsingPush(){
        HomeDeliveryCustomer tom = new HomeDeliveryCustomer(TOM, newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);

        /* (@_@) */

        /* (^_^) */

        assertThat(getSystemDotOutContent(), is(TOM + " is reading: " + MAGAZINE_CONTENT));
    }

    /**
     * Meditate on the outcome of a new magazine being published when the zero argument notify method is called
     * on the Subject
     */
    @Koan
    public void reflectOnHowObserversCanBeNotifiedUsingPullRequest(){
        CollectionCustomer harry = new CollectionCustomer(HARRY, newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);

        /* (@_@) */

        /* (^_^) */

        assertThat(getSystemDotOutContent(), is(HARRY + " is reading: " + MAGAZINE_CONTENT));
    }

    /**
     * Meditate on how the pattern supports notifying all interested parties
     */
    @Koan
    public void reflectOnNotifyingAllInterestedParties(){

        /* (@_@) */

        /* (^_^) */

        String tomIsReading = TOM + " is reading: " + MAGAZINE_CONTENT;
        String harryIsReading = HARRY + " is reading: " + MAGAZINE_CONTENT;

        assertThat(getSystemDotOutContent(), containsString(tomIsReading));
        assertThat(getSystemDotOutContent(), containsString(harryIsReading));
    }

    /**
     * Meditate on the type of news kiosk update that will distribute to Harry but not Tom
     */
    @Koan
    public void reflectOnDifferentTypesOfCustomerWillReceiveDifferentServices(){
        HomeDeliveryCustomer tom = new HomeDeliveryCustomer(TOM, newsKiosk);
        CollectionCustomer harry = new CollectionCustomer(HARRY, newsKiosk);

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);

        /* (@_@) */

        /* (^_^) */

        String harryIsReading = HARRY + " is reading: " + MAGAZINE_CONTENT;
        String tomIsReading = TOM + " is reading: " + MAGAZINE_CONTENT;

        assertThat(getSystemDotOutContent(), containsString(harryIsReading));
        assertThat(getSystemDotOutContent(), not(containsString(tomIsReading)));
    }

    /**
     * Meditate on the order in which observers are notified are
     */
    @Koan
    public void reflectOnNotificationOrder(){

        /* (@_@) */

        /* (^_^) */

        Magazine magazine = new Magazine(MAGAZINE_CONTENT, MAGAZINE_EDITION);
        newsKiosk.newMagazinePublished(magazine);

        String expectedOutput = TOM + " is reading: " + MAGAZINE_CONTENT + System.lineSeparator() +
                DICK + " is reading: " + MAGAZINE_CONTENT + System.lineSeparator() +
                HARRY + " is reading: " + MAGAZINE_CONTENT;

        assertThat(getSystemDotOutContent(), is(expectedOutput));
    }

    @Before
    public void setUpSystemStreams(){
        newsKiosk = new NewsKiosk();
        System.setOut(new PrintStream(systemDotOutContent));
    }

    @After
    public void cleanUpSystemStreams() {
        System.setOut(null);
    }

    private String getSystemDotOutContent(){
        return systemDotOutContent.toString().trim();
    }
}
