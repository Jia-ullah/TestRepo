package com.testvagrant.codetest.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.testvagrant.codetest.testbase.TestBase;

public class HotelBookingObject extends TestBase {
	
	public WebDriver driver;

	@FindBy(linkText = "Hotels")
    private WebElement hotelLink;

    @FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;
    
    public HotelBookingObject(WebDriver driver){
    	PageFactory.initElements(driver, this);
    	this.driver = driver;
    	
    }

   
    public void searchHotel(String location) {
        
    	System.out.println(driver);
        driver.get("https://www.cleartrip.com/");
        hotelLink.click();
        localityTextBox.clear();
        waitFor(2000);
        localityTextBox.sendKeys(location);
        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        searchButton.click();
//        driver.quit();

    }
}
