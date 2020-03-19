package cn.tjuscs.selenium;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {
	public static void main(String[] args) {
		// 一、declaration and instantiation of objects/variables
		//1. 定义FireFox浏览器驱动
		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
			
		//2. 定义Chrome浏览器驱动
//		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		WebDriver driver = new ChromeDriver();
		
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    	

        //二、定义要访问的网址
        String baseUrl = "http://www.tju.edu.cn";
        String expectedTitle = "天津大学";
        String actualTitle = "";

        //三、访问给定的网址launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        //四、得到网址的title， get the actual value of the title
        actualTitle = driver.getTitle();
        

        /*
         * 五、比对Title和预期值compare the actual title of the page with the expected one and print
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
