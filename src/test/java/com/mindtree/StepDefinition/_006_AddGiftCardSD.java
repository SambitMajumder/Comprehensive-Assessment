package com.mindtree.StepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObject._006_AddGiftCardPO;
import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _006_AddGiftCardSD {
	static WebDriver driver;
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());

	@Given("Got the driver from AddToCart")
	public void got_the_driver_from_add_to_cart() {
		driver = _005_AddToCartSD.getDriver();
	}

	@When("User clicked the Gift Card option")
	public void user_clicked_the_gift_card_option() {
		WebElement giftCard = _006_AddGiftCardPO.giftCard(driver);
		giftCard.click();
		Log.info("Clicked the gift card option");
	}

	@Then("User select the value of Gift card option")
	public void user_select_the_value_of_gift_card_option() {
		WebElement value = _006_AddGiftCardPO.value(driver);
		value.click();
		Log.info("Clicked the 2000 Gift card option");
	}

	@Then("User clicked the Add To Card button")
	public void user_clicked_the_add_to_card_button() throws InterruptedException {
		WebElement addButton = _006_AddGiftCardPO.addButton(driver);
		addButton.click();
		Log.info("Clicked the Add to Cart button..The Gift card added");
		Thread.sleep(2000);
	}

	@Then("User Clicked the Continue Shopping button")
	public void user_clicked_the_continue_shopping_button() throws InterruptedException {
		WebElement conShop = _006_AddGiftCardPO.conShop(driver);
		conShop.click();
		Log.info("Clicked on the Continue Shopping button for more shopping");
		Thread.sleep(2000);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
