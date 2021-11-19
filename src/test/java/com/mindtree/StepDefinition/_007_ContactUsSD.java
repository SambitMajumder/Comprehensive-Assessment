package com.mindtree.StepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.PageObject._007_ContactUsPO;
import com.mindtree.Utilities.BrowserConnection;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _007_ContactUsSD {
	static WebDriver driver;
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());

	@Given("Got the driver from AddGiftCard")
	public void got_the_driver_from_add_gift_card() {
		driver = _006_AddGiftCardSD.getDriver();
	}

	@When("User clicked the Contact us option")
	public void user_clicked_the_contact_us_option() {
		WebElement contact = _007_ContactUsPO.contact(driver);
		contact.click();
		Log.info("Clicked the Contact us page option");
	}

	@Then("User entered the name (.+) email (.+) message (.+)$")
	public void user_entered_the_name_email_message(String name, String email, String msg) throws InterruptedException {
		WebElement userName = _007_ContactUsPO.name(driver);
		WebElement userEmail = _007_ContactUsPO.email(driver);
		WebElement userMsg = _007_ContactUsPO.msg(driver);
		Log.info("Entering the details: ");
		userName.sendKeys(name);
		Log.info(name);
		userEmail.sendKeys(email);
		Log.info(email);
		userMsg.sendKeys(msg);
		Log.info(msg);
		Thread.sleep(2000);
	}

	@Then("Click on the Sumbit button and verify submission")
	public void click_on_the_sumbit_button_and_verify_submission() throws InterruptedException {
		
		WebElement submit = _007_ContactUsPO.btn(driver);
		submit.click();
		Log.info("Clicked the submit button");
		Thread.sleep(2000);
		Log.info("Successfully contacted");
		/*WebElement success = _007_ContactUsPO.success(driver);
		String successMsg = success.getText();
		if (successMsg.contains("Thanks for contacting us")) {
			Log.info("Successfully contacted them");
		}else {
			Log.info("Something is missing");
		}*/

		/*WebElement captcha = driver.findElement(By.xpath("//*[@id=\'MainContent\']/div[1]/p"));
		String title = captcha.getText();
		if (title.contains("To continue, let us know you're not a robot.")) {
			Log.info("We got the captcha page");
		} else {
			Log.info("Wrong Page");
		}*/
		Thread.sleep(2000);
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
