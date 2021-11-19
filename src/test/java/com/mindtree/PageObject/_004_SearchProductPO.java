package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore._004_SearchProductUI;

public class _004_SearchProductPO {
	public WebDriver driver;

	public _004_SearchProductPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement searchBar(WebDriver driver) {
		return driver.findElement(_004_SearchProductUI.searchBar);
	}
	
	public static WebElement searchIcon(WebDriver driver) {
		return driver.findElement(_004_SearchProductUI.searchIcon);
	}
	
	public static WebElement product(WebDriver driver) {
		return driver.findElement(_004_SearchProductUI.product);
	}

}
