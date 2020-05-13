package Prop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Propclass 
{
	public WebDriver driver=null;
	@BeforeTest
    public void openFileDialog() {
        System.out.println("openFileDialog()");
    }
     
    @Test
    public void uiGroupDependentTest() throws IOException{
        System.out.println("uiGroupDependentTest()");
        Properties prop = new Properties();
        FileInputStream fis= new FileInputStream("C:\\Users\\user\\eclipse-workspace\\TestNG project\\src\\Prop\\datadriven.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("username"));
        
        if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
        {
        	System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
        	driver = new FirefoxDriver();
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
        	driver = new ChromeDriver();
        }else
        	if(prop.getProperty("browser").equalsIgnoreCase("ie"))
        {
        	System.setProperty("webdriver.ie.driver","C:\\Users\\user\\Downloads\\Compressed\\MicrosoftWebDriver.exe");
        	driver = new InternetExplorerDriver();
        }
        driver.get(prop.getProperty("url"));
    }
 
     
    @AfterTest
    public void backendGroupDependentTest1(){
        System.out.println("backendGroupDependentTest1()");
        driver.close();
    }

}
