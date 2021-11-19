package com.mindtree.UIStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _009_CartUI {
	static WebDriver driver;
	
	public static By Cart = By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[4]");
	public static By cartHeader = By.xpath("//*[@id=\'CartDrawer\']/form/div[1]");
	public static By value = By.xpath("//*[@id=\'CartDrawer\']/form/div[2]/div[3]/div[2]/div[2]");
	public static By conShop = By.xpath("//*[@id=\'CartDrawer\']/form/div[2]/div[3]/a");
}
