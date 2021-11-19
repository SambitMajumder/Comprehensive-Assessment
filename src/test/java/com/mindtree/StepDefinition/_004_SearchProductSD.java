package com.mindtree.StepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObject._004_SearchProductPO;
import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _004_SearchProductSD {
	static WebDriver driver;
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());
	
	@Given("gettig driver from NavigatingMenuOptions")
	public void gettig_driver_from_navigating_menu_options() {
	    driver = _003_NavigatingMenuOptionsSD.getDriver();
	}

	@When("Write in the Search bar and click search icon")
	public void write_in_the_search_bar_and_click_search_icon() throws InterruptedException {
	    WebElement search = _004_SearchProductPO.searchBar(driver);
	    search.click();
	    search.sendKeys("harry potter");
	    search.sendKeys(Keys.ENTER);
	    /*WebElement icon = _004_SearchProductPO.searchIcon(driver);
	    icon.click();*/
	    Log.info("Searching for harry potter product");
	    Thread.sleep(2000);
	}

	@Then("Print the first Search result containing the Search keyword")
	public void print_the_first_search_result_containing_the_search_keyword() throws InterruptedException {
		/*WebElement subMenu = _004_SearchProductPO.subMenu(driver);
		Actions action = new Actions(driver);
		action.moveToElement(subMenu).perform();*/
		WebElement product = _004_SearchProductPO.product(driver);
		String title = product.getText();
		Log.info("First Product Title: " + title);
		if(title.contains("Harry Potter")) {
			Log.info("The Product Contains the Keyword SEARCH SUCCESSFUL");
		}else {
			Log.info("Product not found");
		}
		Thread.sleep(2000);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}



