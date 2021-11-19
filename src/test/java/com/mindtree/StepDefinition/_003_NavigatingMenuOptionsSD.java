package com.mindtree.StepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.PageObject._003_NavigatingMenuOptionsPO;
import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _003_NavigatingMenuOptionsSD {
	static WebDriver driver;
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());
	
	@Given("Got the Driver from SortingFeatureSD")
	public void got_the_driver_from_sorting_feature_sd() {
	    driver = _002_SortingFeatureSD.getDriver();
	}

	@When("User hover on option Gifts")
	public void user_hover_on_option_gifts() throws InterruptedException {
		Thread.sleep(2000);
	    WebElement ele = _003_NavigatingMenuOptionsPO.gifts(driver);
	    Actions action = new Actions(driver);
	    action.moveToElement(ele).perform();
	    Log.info("Hovering the Gifts option");
	}

	@Then("Select the option Gifts for Guys")
	public void select_the_option_gifts_for_guys() throws InterruptedException {
	    Actions action = new Actions(driver);
	    WebElement subMenu = _003_NavigatingMenuOptionsPO.subMenu(driver);
	    action.moveToElement(subMenu).perform();
	    WebElement guys = _003_NavigatingMenuOptionsPO.guys(driver);
	    action.moveToElement(guys).click().build().perform();
	    Log.info("Clicking the Guys for Gifts Option");
	    Thread.sleep(2000);
	}

	@Then("Verify it is the Gifts for Guys page")
	public void verify_it_is_the_gifts_for_guys_page() throws InterruptedException {
		WebElement t = _003_NavigatingMenuOptionsPO.title1(driver);
		String title = t.getText();
		Log.info("Verify if it is the Gifts for Guys page!");
		if(title.contains("Gifts For Guys")) {
			Log.info("It is the Gifts for guys Page");
		}else {
			Log.info("It is the wrong page");
		}
		Thread.sleep(2000);
	}

	@Then("User select the option Christmas Gifts")
	public void user_select_the_option_christmas_gifts() throws InterruptedException {
	    WebElement ele = _003_NavigatingMenuOptionsPO.Christmas(driver);
	    ele.click();
	    Log.info("Clicked the Christmas Gifts options");
	    Thread.sleep(2000);
	}

	@Then("Verify it is the Christmas Gifts Page")
	public void verify_it_is_the_christmas_gifts_page() throws InterruptedException {
		WebElement t = _003_NavigatingMenuOptionsPO.title2(driver);
		String title = t.getText();
		Log.info("Verify if it is the Christmas Gifts page!");
		if(title.contains("Christmas Gifts")) {
			Log.info("It is the Christmas Gifts Page");
		}else {
			Log.info("It is the wrong page");
		}
		Thread.sleep(2000);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
