package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore._010_AboutUsUI;

public class _010_AboutUsPO {
	public WebDriver driver;

	public _010_AboutUsPO(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement aboutUs(WebDriver driver) {
		return driver.findElement(_010_AboutUsUI.AboutUs);
	}

	public static WebElement title(WebDriver driver) {
		return driver.findElement(_010_AboutUsUI.title);
	}
}
