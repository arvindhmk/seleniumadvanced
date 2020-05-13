package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class baseclass 
{
	public WebDriver driver;
String path=System.getProperty("user.dir");

	public Properties prop;
	public WebDriver initializedriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\user\\Projectmini\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);

		String browserName = System.getProperty("browser");
		//String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\Downloads\\Compressed\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	
	}
	public void screenshot() throws IOException {
		// TODO Auto-generated method stub
		
		TakesScreenshot scrn= (TakesScreenshot)driver;
		File source=scrn.getScreenshotAs(OutputType.FILE);
		File dest = new File(path+"//screnshot//"+System.currentTimeMillis()+".jpeg");
		FileHandler.copy(source, dest);
	}
	
	public void testmethod()
	{
		System.out.println("test mothod");
	}
}
