package dqonloadfiles;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Downloadfile
{
	String download_path = System.getProperty("user.dir");
	public WebDriver driver=null;

	@Test
	public void Browser()
	{	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
			HashMap<String,Object> chromePrefs = new HashMap<String,Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", download_path);
			ChromeOptions opt = new ChromeOptions();
			opt.setExperimentalOption("prefs", chromePrefs);
			driver = new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
			driver.get("https://the-internet.herokuapp.com/download");
		}
		
	@Test
	public void Downloadfile()
	{
driver.findElement(By.xpath("//a[contains(text(),'UploadThis.txt')]")).click();
		
		File f=new File(download_path+"/UploadThis.txt");

		if(f.exists())

		{

		Assert.assertTrue(f.exists());

		if(f.delete())

		System.out.println("file deleted");

		}

	}
}
