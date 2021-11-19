package com.mindtree.StepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObject._008_WishListPO;
import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _008_WishListSD {
	static WebDriver driver;
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());
	
	@Given("got the driver from ContactusSD")
	public void got_the_driver_from_contactus_sd() {
	    driver = _007_ContactUsSD.getDriver();
	}

	@When("User clicked the Top50 option")
	public void user_clicked_the_top50_option() {
	    WebElement ele = _008_WishListPO.top50(driver);
	    ele.click();
	    Log.info("Clicked the top 50 option");
	}

	@Then("User clicked the first product")
	public void user_clicked_the_first_product() throws InterruptedException {
	    WebElement pro = _008_WishListPO.firstProduct(driver);
	    pro.click();
	    Log.info("Clicked the first product");
	    Thread.sleep(4000);
	}

	@Then("click the Add to Wishlist feature")
	public void click_the_add_to_wishlist_feature() throws InterruptedException {
	   WebElement btn = _008_WishListPO.wishBtn(driver);
	   btn.click();
	   Log.info("Wish List button clicked");
	   Thread.sleep(2000);
	}

	@Then("Checked if the item is present")
	public void checked_if_the_item_is_present() {
		 WebElement text = driver.findElement(By.xpath("//*[@id='swym-notification-title']/a/span"));
		    String notification = text.getText();
		    if(notification.contains("The item has been added to your wishlist")) {
		    	Log.info("Got the Successfully added to wishlist Message");
		    }else {
		    	Log.info("Not Added to Wish list");
		    }
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
