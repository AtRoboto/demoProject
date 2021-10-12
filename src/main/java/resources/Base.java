package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	
	public static WebDriver driver; // Driver can be created only once
	
	@BeforeTest
	public void initilizeDriver()
	{
		//execute in chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\ExternalFiles\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		//driver = new ChromeDriver(options);// headless browser
		driver = new ChromeDriver(); // Normal browser
		driver.manage().window().maximize();
		
	}
	
}
