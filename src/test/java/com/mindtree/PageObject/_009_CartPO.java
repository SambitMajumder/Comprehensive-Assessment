package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore._009_CartUI;

public class _009_CartPO {
	public WebDriver driver;

	public _009_CartPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement cart(WebDriver driver) {
		return driver.findElement(_009_CartUI.Cart);
	}
	
	public static WebElement cartHeader(WebDriver driver) {
		return driver.findElement(_009_CartUI.cartHeader);
	}
	
	public static WebElement value(WebDriver driver) {
		return driver.findElement(_009_CartUI.value);
	}
	
	public static WebElement conShop(WebDriver driver) {
		return driver.findElement(_009_CartUI.conShop);
	}
	
}
