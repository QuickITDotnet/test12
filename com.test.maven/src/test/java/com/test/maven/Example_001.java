package com.test.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example_001 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browserlaunch();
	}
	
	public static void browserlaunch() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\Selenium_Evening_19_Nov\\jars\\Drivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
	}
	
	

}
