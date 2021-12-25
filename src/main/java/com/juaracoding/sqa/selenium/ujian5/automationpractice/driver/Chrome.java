package com.juaracoding.sqa.selenium.ujian5.automationpractice.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy{

	public WebDriver setStrategy() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Training\\QA\\aplikasi\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		return new ChromeDriver(options);
		
		
	}

}
