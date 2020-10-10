package com.usa.smarttech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mathematics {

public static void main(String[] args) {
	System. setProperty("webdriver.chrome.driver", "C:\\Users\\malai\\eclipse-workspace\\SmartTech_Automation\\Driver\\chromedriver.exe");
	// Initialize browser.
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
}
