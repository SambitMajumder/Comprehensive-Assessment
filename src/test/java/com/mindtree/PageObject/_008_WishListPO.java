package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore._008_WishListUI;

public class _008_WishListPO {
	public WebDriver driver;

	public _008_WishListPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement top50(WebDriver driver) {
		return driver.findElement(_008_WishListUI.top50);
	}

	public static WebElement firstProduct(WebDriver driver) {
		return driver.findElement(_008_WishListUI.firstProduct);
	}
	
	public static WebElement wishBtn(WebDriver driver) {
		return driver.findElement(_008_WishListUI.wishBtn);
	}
	
	public static WebElement wishList(WebDriver driver) {
		return driver.findElement(_008_WishListUI.wishList);
	}
	
}
