package com.mindtree.StepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mindtree.PageObject._002_SortingFeaturePO;
import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _002_SortingFeatureSD {
	static WebDriver driver;
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());
	
	@Given("Getting Driver from the openURLSD")
	public void getting_driver_from_the_open_urlsd() {
	    driver = _001_openURLSD.getDriver();
	}

	@When("User clicked on the option Personalized Gifts")
	public void user_clicked_on_the_option_personalized_gifts() {
	   WebElement ele = _002_SortingFeaturePO.personalizedGifts(driver);
	   ele.click();
	   Log.info("Clicked on the Personalized Gifts options");
	}

	@Then("Validate if it is the Personalized Gifts page")
	public void validate_if_it_is_the_personalized_gifts_page() throws InterruptedException {
	    WebElement ele = _002_SortingFeaturePO.pageTitle(driver);
	    String title = ele.getText();
	    Log.info("Verify if it is the desired page...");
	    Thread.sleep(2000);
	    if(title.equalsIgnoreCase("Personalized Gifts")) {
	    	Log.info("Welcome to Personalized gifts");
	    }else {
	    	Log.info("Wrong Page");
	    }
	}

	@Then("Select Best selling from Sort By feature")
	public void select_best_selling_from_sort_by_feature() throws InterruptedException {
		Thread.sleep(2000);
	    WebElement ele = _002_SortingFeaturePO.sortBy(driver);
	    Log.info("Selecting the Sort By feature");
	    Select elements = new Select(ele);
	    elements.selectByIndex(2);
	    Log.info("Selected the option Best Selling");
	}

	@Then("Validate the first Product")
	public void validate_the_first_product() {
	   Log.info("Verifying first product Personalized Moon Lamp");
	   WebElement ele = _002_SortingFeaturePO.firstProduct(driver);
	   String title = ele.getText();
	   if(title.contains("Personalized Moon Lamp")) {
		   Log.info("First product is Personalized Moon Lamp");
	   }else {
		   Log.info("Product not found");
	   }
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
