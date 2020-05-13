package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//parallel attribute can be set at method and test level
public class paralleltest 
{
	@Test
	public void opengoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
	@Test
	public void openbing()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();
	}
}
