package com.mindtree.UIStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _003_NavigatingMenuOptionsUI {
	static WebDriver driver;
	
	public static By gifts = By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[7]/a");
	public static By subMenu = By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[7]/ul");
	public static By guys = By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[7]/ul/li[1]/a");
	public static By title1 = By.xpath("//*[@id=\'shopify-section-collection-header\']/div/header/h1");
	public static By Christmas = By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[4]/a");
	public static By title2 = By.xpath("//*[@id=\'shopify-section-collection-header\']/div/header/h1");
}
