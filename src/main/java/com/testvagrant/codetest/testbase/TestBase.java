package com.testvagrant.codetest.testbase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testvagrant.codetest.config.ConfigInfo;



public class TestBase {
	
	public WebDriver driver; //declared driver
	ConfigInfo configInfo;
	
	public void setDriverPath() {
        if (System.getProperty("os.name").contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
        }
        if (System.getProperty("os.name").contains("Window")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
        }
        if (System.getProperty("os.name").contains("Linux")) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
            driver = new ChromeDriver();
        }
    }
	
	public void config1() throws IOException{
	configInfo = new ConfigInfo();
	configInfo.configData();
	}
	
	public void getUrl() throws IOException{
		config1();
		System.out.println(configInfo.configFile.getProperty("url"));
		driver.get(configInfo.configFile.getProperty("url"));
	}
	
	public void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
	
	
	
	
	

    


}
