package com.testvagrant.codetest.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testvagrant.codetest.pageobjects.SignInTestObject;
import com.testvagrant.codetest.testbase.TestBase;

public class SignInTest extends TestBase {
	
//	WebDriver driver;
    SignInTestObject signIn;

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

    	setDriverPath();
        driver.get("https://www.cleartrip.com/");
        signIn = new SignInTestObject(driver);
        signIn.userSignIn();
       
    }

    


}
