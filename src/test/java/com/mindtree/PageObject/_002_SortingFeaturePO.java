package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore._002_SortingFeatureUI;

public class _002_SortingFeaturePO {
	public WebDriver driver;

	public _002_SortingFeaturePO(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement personalizedGifts(WebDriver driver) {
		return driver.findElement(_002_SortingFeatureUI.personalizedGifts);
	}

	public static WebElement pageTitle(WebDriver driver) {
		return driver.findElement(_002_SortingFeatureUI.pageTitle);
	}

	public static WebElement sortBy(WebDriver driver) {
		return driver.findElement(_002_SortingFeatureUI.sortBy);
	}

	public static WebElement firstProduct(WebDriver driver) {
		return driver.findElement(_002_SortingFeatureUI.firstProduct);
	}
}
