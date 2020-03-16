package cn.tjuscs.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {
	public static void main(String[] args) {
//		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
//		System.setProperty("webdriver.gecko.driver", driverPath);
//		WebDriver driver = new FirefoxDriver();
		
		String driverPath = System.getProperty("user.dir") + "/src/driverchrome/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://103.120.226.190/auth/login";
		driver.get(baseUrl);
//		WebElement userName = driver.findElement(By.id("account_name"));		
//		userName.sendKeys("wangzan@tju.edu.cn");
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("admin");
		WebElement passName = driver.findElement(By.name("password"));
		passName.sendKeys("admin");
		
		WebElement submitName = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[3]/input"));
		submitName.click();
		
//		WebElement submitName = driver.findElement(By.xpath("//*[@id='loginForm']/tbody/tr[6]/td/input[1]"));
	
		
	}
	
	

}
