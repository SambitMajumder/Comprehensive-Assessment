package com.mindtree.UIStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _010_AboutUsUI {
	static WebDriver driver;
	
	public static By AboutUs = By.xpath("//*[@id=\'shopify-section-footer\']/footer[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	public static By title = By.xpath("//*[@id=\'MainContent\']/div/div[1]/div/header/h1");
}
