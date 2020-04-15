package cn.tjuscs.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
	public static void main(String[] args) {
//		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
//		System.setProperty("webdriver.gecko.driver", driverPath);
//		WebDriver driver = new FirefoxDriver();
		
		String driverPath = System.getProperty("user.dir") + "/src/driverchrome/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://www.google.com";
		driver.get(baseUrl);
	}
	
	

}
