package com.csg.taucucumber.Cucumber_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Step_Definition {
	WebDriver driver;
    @Given("^user navigates to \"([^\"]*)\"$")
    public void user_navigates_to_www_google_com(String url) {
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get(url);
    }

}
