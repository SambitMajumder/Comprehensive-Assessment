package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore._006_AddGiftCardUI;

public class _006_AddGiftCardPO {
	public WebDriver driver;

	public _006_AddGiftCardPO(WebDriver driver) {
		this.driver = driver;
	}
	
	public static WebElement giftCard(WebDriver driver) {
		return driver.findElement(_006_AddGiftCardUI.giftCard);
	}
	
	public static WebElement value(WebDriver driver) {
		return driver.findElement(_006_AddGiftCardUI.value);
	}
	
	public static WebElement addButton(WebDriver driver) {
		return driver.findElement(_006_AddGiftCardUI.addButton);
	}
	
	public static WebElement conShop(WebDriver driver) {
		return driver.findElement(_006_AddGiftCardUI.conShop);
	}
}
