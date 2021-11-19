package com.mindtree.UIStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _006_AddGiftCardUI {
	static WebDriver driver;
	
	public static By giftCard = By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[3]");
	public static By value = By.xpath("//*[@id=\'ProductSelect-738195636312-option-0\']/div[3]/label");
	public static By addButton = By.xpath("//*[@id=\'AddToCartForm-738195636312\']/button");
	public static By conShop = By.xpath("//*[@id=\'CartDrawer\']/form/div[2]/div[3]/a");
}

