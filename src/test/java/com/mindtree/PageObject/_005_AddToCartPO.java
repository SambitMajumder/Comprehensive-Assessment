package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore._005_AddToCartUI;

public class _005_AddToCartPO {
	public WebDriver driver;

	public _005_AddToCartPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement secretSanta(WebDriver driver) {
		return driver.findElement(_005_AddToCartUI.secretSanta);
	}
	
	public static WebElement firstProduct(WebDriver driver) {
		return driver.findElement(_005_AddToCartUI.firstProduct);
	}
	
	public static WebElement addButton(WebDriver driver) {
		return driver.findElement(_005_AddToCartUI.addButton);
	}
	
	public static WebElement conShop(WebDriver driver) {
		return driver.findElement(_005_AddToCartUI.conShop);
	}
}
