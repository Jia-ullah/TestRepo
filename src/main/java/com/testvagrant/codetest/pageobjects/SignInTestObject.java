package com.testvagrant.codetest.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInTestObject {
	
	public WebDriver driver;

	

	@FindBy(linkText = "Your trips")
	WebElement trips;
	
	@FindBy(id = "SignIn")
	WebElement signIn;
	
	@FindBy(id = "signInButton")
	WebElement signInButton;
	
	@FindBy(id = "errors1")
	WebElement error;

	
	 public SignInTestObject(WebDriver driver){
	    	PageFactory.initElements(driver, this);
	    	this.driver = driver;
	    	
	    }
	
	
	public void userSignIn(){
		trips.click();
		signIn.click();
		signInButton.click();
		 String errors1 = driver.findElement(By.id("errors1")).getText();
//	     Assert.assertTrue(errors1.contains("There were errors in your submission"));
	     driver.quit();
		
	}

    
}
