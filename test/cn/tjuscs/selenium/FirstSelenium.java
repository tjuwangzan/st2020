package cn.tjuscs.selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
		
//		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		WebDriver driver = new ChromeDriver();
		
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    	

        
        String baseUrl = "http://www.tju.edu.cn";
        String expectedTitle = "天津大学";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
	}

}
