package com.mindtree.UIStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _005_AddToCartUI {
static WebDriver driver;
	
	public static By secretSanta = By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[5]/a");
	public static By firstProduct = By.xpath("//*[@id=\'CollectionAjaxContent\']/div[1]/div[1]/div/a/div[2]/div[1]");
	public static By addButton = By.xpath("//*[@id=\'AddToCartForm-6783747686598\']/button/span");
	public static By conShop = By.xpath("//*[@id=\'CartDrawer\']/form/div[2]/div[3]/a");
}
