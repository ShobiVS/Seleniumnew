package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumsam {
	public static void main(String[] args) {
		// browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHOBI\\eclipse-workspace\\Seleniumsample\\Driver\\chromedriver.exe");
		 
		// browser launching
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("Current page title: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("Current page url " +url);
		driver.close();
		driver.quit();
	}

}
