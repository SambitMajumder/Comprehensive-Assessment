package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore._003_NavigatingMenuOptionsUI;

public class _003_NavigatingMenuOptionsPO {
	public WebDriver driver;

	public _003_NavigatingMenuOptionsPO(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement gifts(WebDriver driver) {
		return driver.findElement(_003_NavigatingMenuOptionsUI.gifts);
	}
	
	public static WebElement subMenu(WebDriver driver) {
		return driver.findElement(_003_NavigatingMenuOptionsUI.subMenu);
	}
	
	public static WebElement guys(WebDriver driver) {
		return driver.findElement(_003_NavigatingMenuOptionsUI.guys);
	}
	
	public static WebElement title1(WebDriver driver) {
		return driver.findElement(_003_NavigatingMenuOptionsUI.title1);
	}
	
	public static WebElement Christmas(WebDriver driver) {
		return driver.findElement(_003_NavigatingMenuOptionsUI.Christmas);
	}
	
	public static WebElement title2(WebDriver driver) {
		return driver.findElement(_003_NavigatingMenuOptionsUI.title2);
	}
}




