package com.mindtree.UIStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class _008_WishListUI {
	static WebDriver driver;
	
	public static By top50 = By.xpath("//*[@id=\'myheader\']/div[1]/div/div/ul/li[6]/a");
	public static By firstProduct = By.xpath("//*[@id=\'CollectionAjaxContent\']/div[1]/div[1]");
	public static By wishBtn = By.xpath("//*[@id=\'ProductSection-4041073983576\']/div/div/div[1]/div[2]/div/div[1]/div[1]/div/button");
	public static By wishList = By.xpath("//*[@id=\'myheader\']/div[1]/header/div[2]/div[2]/div[4]/div/div/a[2]");
	
}
