package com.mindtree.UIStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _004_SearchProductUI {
	static WebDriver driver;
	
	public static By searchBar = By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	public static By searchIcon = By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[3]/form/div/img");
	public static By product = By.xpath("//*[@id=\'snize-product-6617900843206\']/a/div/span/span[1]");
}
