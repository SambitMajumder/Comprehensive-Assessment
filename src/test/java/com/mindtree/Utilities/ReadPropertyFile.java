package com.mindtree.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	static Properties config;
	

	//TO READ THE PROPERTY FILE
	ReadPropertyFile() {
		config = new Properties();
		FileInputStream fis;
		try {
			
			fis = new FileInputStream("./test-input/config.properties");
			try {
				config.load(fis);
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			}
		} catch (IOException e) {
			System.out.println("Innput output exception");
		}
	}
	
	public String getDriver() {
		String driver = config.getProperty("chromeDriver");
		if(driver!=null) {
			return driver;
		}else {
			throw new RuntimeException("CD is not specified");
		}
	}
	
	public String getBrowserName() {
		String browserName = config.getProperty("browser");
		if(browserName!=null) {
			return browserName;
		}else {
			throw new RuntimeException("Browser is not specified");
		}
	}
	
	public String geturl() {
		String driver = config.getProperty("AmazonUrl");
		if(driver!=null) {
			return driver;
		}else {
			throw new RuntimeException("url is not specified");
		}
	}
	
	public static String getExtentReport() {
		String driver = config.getProperty("ExtentReportPath");
		if(driver!=null) {
			return driver;
		}else {
			throw new RuntimeException("path is not specified");
		}
	}
	
}












