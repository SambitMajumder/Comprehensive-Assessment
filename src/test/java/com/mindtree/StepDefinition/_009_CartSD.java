package com.mindtree.StepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObject._009_CartPO;
import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _009_CartSD {
	static WebDriver driver;
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());

	@Given("Got the driver from WishListSD")
	public void got_the_driver_from_wish_list_sd() {
		driver = _008_WishListSD.getDriver();
	}

	@When("User clicked the Cart option")
	public void user_clicked_the_cart_option() throws InterruptedException {
		Thread.sleep(2000);
		WebElement cart = _009_CartPO.cart(driver);
		cart.click();
		Log.info("Clicked the cart option");
	}

	@Then("Verify the Cart")
	public void verify_the_cart() throws InterruptedException {
		/*WebElement value = _009_CartPO.value(driver);
		String money = value.getText();*/
		WebElement cartHeader = _009_CartPO.cartHeader(driver);
		String heading = cartHeader.getText();
		if (heading.contains("Shopping Cart (0 items)")) {
			Log.info("Cart is Empty");
		} else {
			Log.info("Cart has some items");
		}

		Thread.sleep(2000);
		WebElement conShop = _009_CartPO.conShop(driver);
		conShop.click();
		Log.info("Back to Shopping");
		Thread.sleep(2000);
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
