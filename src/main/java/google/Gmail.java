package google;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import resources.Base;

public class Gmail extends Base{

	@Test(priority=0)
	public void initilizeGoogle()
	{
		driver.get("https://www.google.com/");
	}
	@Test(priority=1)
	public void initilizeGmail()
	{
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	}
}
