package com.testvagrant.codetest.pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.testvagrant.codetest.testbase.TestBase;

public class FightBookingObject extends TestBase{
	
	@FindBy(id = "OneWay")
	WebElement traveltype;
	
	@FindBy(id = "FromTag")
	WebElement fromPlace;
	
	@FindAll({@FindBy(id = "ui-id-1"), @FindBy(tagName="li")})
	List<WebElement> fromSuggestions;
	
	@FindBys({@FindBy(id = "ui-id-2"), @FindBy(tagName="li")})
	List<WebElement> toSuggestions;
	
	@FindBy(id = "toTag")
	WebElement toPlace;
	
	@FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
	WebElement selectDate;
	
	@FindBy(id = "SearchBtn")
	WebElement search;
	
	 public FightBookingObject(WebDriver driver){
	    	PageFactory.initElements(driver, this);
	    	this.driver = driver;
	    	
	    }
	
	
	public void bookFlight(String from, String to) throws InterruptedException{
		traveltype.click();
		fromPlace.clear();
		fromPlace.sendKeys(from);
		System.out.println(fromSuggestions.size());
		System.out.println(fromSuggestions.get(0).getText());

		fromSuggestions.get(0).click();
		
		toPlace.clear();
		toPlace.sendKeys(to);
		toSuggestions.get(0).click();
		selectDate.click();
		search.click();
		
	}

     //verify that result appears for the provided journey search
//     Assert.assertTrue(isElementPresent(By.className("searchSummary")));

     //close the browser
//     driver.quit();

}
