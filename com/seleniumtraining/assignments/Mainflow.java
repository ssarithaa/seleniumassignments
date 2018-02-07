package com.seleniumtraining.assignments;

import org.openqa.selenium.WebDriver;

public class Mainflow {
	public static void main(String[] args) throws InterruptedException {

		String browser = "chrome";
		String url = "https://www.timeanddate.com/calendar/";
		String countryxpath = "//select[@id='sf_country']";
		String country = "Ireland";

		BrowserInteraction browserClassInstance = new BrowserInteraction();
		browserClassInstance.setDriver(browser);
		WebDriver driver = browserClassInstance.getDriver();
		driver.get(url);
		browserClassInstance.selectDropDown(countryxpath, country);
	}
}
