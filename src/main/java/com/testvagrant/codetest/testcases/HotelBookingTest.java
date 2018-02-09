package com.testvagrant.codetest.testcases;
import com.testvagrant.codetest.pageobjects.HotelBookingObject;
import com.testvagrant.codetest.testbase.TestBase;
import org.testng.annotations.Test;

public class HotelBookingTest extends TestBase {

    HotelBookingObject hotelBooking;
    
    
    @Test
    public void shouldBeAbleToSearchForHotels(){
    	setDriverPath();
    	System.out.println(driver);
    	hotelBooking = new HotelBookingObject(driver);
    	hotelBooking.searchHotel("indiranagar, Bangalore");
    }

    
    
    

 

}
