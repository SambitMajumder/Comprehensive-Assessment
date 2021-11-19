package com.mindtree.StepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObject._010_AboutUsPO;
import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _010_AboutUsSD {
	static WebDriver driver;
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());
	
	@Given("Got the driver from CartSD")
	public void got_the_driver_from_cart_sd() {
		driver = _009_CartSD.getDriver();
	}

	@When("User clicked the About Us option")
	public void user_clicked_the_about_us_option() {
	    WebElement aboutUs = _010_AboutUsPO.aboutUs(driver);
	    aboutUs.click();
	    Log.info("About Us page opened");
	}

	@Then("Verify it is the About us page")
	public void verify_it_is_the_about_us_page() throws InterruptedException {
		WebElement t = _010_AboutUsPO.title(driver);
		String title = t.getText();
		if(title.contains("About us")) {
			Log.info("It is the the About us page");
		}else {
			Log.info("It is wrong page");
		}
		Thread.sleep(2000);
	}
}
