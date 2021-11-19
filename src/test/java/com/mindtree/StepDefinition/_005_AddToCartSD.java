package com.mindtree.StepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObject._005_AddToCartPO;
import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _005_AddToCartSD {
	static WebDriver driver;
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());
	
	@Given("Got the driver from SearchProductSD")
	public void got_the_driver_from_search_product_sd() {
	    driver = _004_SearchProductSD.getDriver();
	}

	@When("User click the Secret Santa Gifts and click the first product")
	public void user_click_the_secret_santa_gifts_and_click_the_first_product() throws InterruptedException {
	    WebElement secretSanta = _005_AddToCartPO.secretSanta(driver);
	    secretSanta.click();
	    Log.info("Clicked Secret Santa Gifts Option");
	    WebElement firstPro = _005_AddToCartPO.firstProduct(driver);
	    firstPro.click();
	    Log.info("Clicked the first product");
	    Thread.sleep(2000);
	}

	@Then("Click Add To Cart button")
	public void click_add_to_cart_button() throws InterruptedException {
	    WebElement addButton = _005_AddToCartPO.addButton(driver);
	    addButton.click();
	    Log.info("Clicked the Add To Cart Button");
	    Thread.sleep(2000); 
	}

	@Then("Click on the Continue Shopping Button")
	public void click_on_the_continue_shopping_button() throws InterruptedException {
		WebElement conShop = _005_AddToCartPO.conShop(driver);
	    conShop.click();
	    Log.info("Click the Continue Shopping to Shop more");
	    Thread.sleep(2000);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
