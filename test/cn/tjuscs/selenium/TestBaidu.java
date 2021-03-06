package cn.tjuscs.selenium;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TestBaidu {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	
	@Before
	public void setUp() {
		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		
		 driver = new FirefoxDriver();
		 js = (JavascriptExecutor) driver;
		 vars = new HashMap<String, Object>();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testBD() {
	 driver.get("https://www.baidu.com/");
	 driver.manage().window().setSize(new Dimension(1936, 1056));
	 driver.findElement(By.id("kw")).click();
	 driver.findElement(By.id("kw")).sendKeys("天津大学");
	 driver.findElement(By.id("su")).click();
	 assertThat(driver.getTitle(), is("天津大学_百度搜索"));
	}
}