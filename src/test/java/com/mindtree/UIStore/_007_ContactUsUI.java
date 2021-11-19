package com.mindtree.UIStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _007_ContactUsUI {
	static WebDriver driver;
	
	public static By contact = By.xpath("//*[@id=\'shopify-section-footer\']/footer[1]/div[1]/div[1]/div[3]/ul/li[1]/a");
	public static By name = By.id("ContactFormName-page-contact-template-0");
	public static By email = By.id("ContactFormEmail-page-contact-template-0");
	public static By msg = By.id("ContactFormMessage-page-contact-template-0");
	public static By btn = By.xpath("//*[@id=\'contact_form\']/button");
	public static By success = By.xpath("//*[@id=\'contact_form\']/p[1]");
}
