package com.mindtree.UIStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _002_SortingFeatureUI {
	static WebDriver driver;

	public static By personalizedGifts = By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[2]/a");
	public static By pageTitle = By.xpath("//*[@id=\'shopify-section-collection-header\']/div/header/h1");
	public static By sortBy = By.id("sortBy");
	public static By firstProduct = By.xpath("//*[@id=\'CollectionAjaxContent\']/div[1]/div[1]/div/a/div[2]/div[1]");
}
