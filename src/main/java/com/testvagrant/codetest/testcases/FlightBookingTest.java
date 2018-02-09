package com.testvagrant.codetest.testcases;
import com.testvagrant.codetest.pageobjects.FightBookingObject;
import com.testvagrant.codetest.testbase.TestBase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;


public class FlightBookingTest extends TestBase {

    FightBookingObject flightBooking;


    @Test
    public void testThatResultsAppearForAOneWayJourney() throws IOException, InterruptedException {

        setDriverPath();
        getUrl();
        flightBooking = new FightBookingObject(driver);
        flightBooking.bookFlight("bangalore","delhi");
       
    }



    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

   
}
