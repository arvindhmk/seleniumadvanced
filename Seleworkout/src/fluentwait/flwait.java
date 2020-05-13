package fluentwait;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class flwait {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

		WebElement button = driver.findElement(By.xpath("//p[@id='demo']//preceding::button"));
		
		button.click();
		
		Wait<WebDriver> wt = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		WebElement output = wt.until(new Function<WebDriver,WebElement>(){

			
			public WebElement apply(WebDriver driver) 
			{
				// TODO Auto-generated method stub
				
				WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
				
				if(text.getAttribute("innerHTML").equalsIgnoreCase("WebDriver"))
				{
					System.out.println("The Value is:"+text.getAttribute("innerHTML"));
					
					return text;
				}
				
				System.out.println("Value is :"+text.getAttribute("innerHTML"));
				return null;
			}
			
			
			
		});
		
		System.out.println("Final Visible status=="+output.isDisplayed());
		
		driver.close();
	}

}
