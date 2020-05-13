package dqonloadfiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadmultiplefiles 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://document.online-convert.com/convert-to-html");
		//ControlFocus("File Upload","","Edit1")
		//ControlSetText("File Upload","","Edit1",$CmdLine[1])
		//ControlClick("File Upload","","Button1")
		
		driver.findElement(By.xpath("//span[@id='fileUploadButton']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\autoit\\multiupload.exe"+" "+"C:\\Users\\user\\Desktop\\SQL.docx");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[@id='fileUploadButton']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\autoit\\multiupload.exe"+" "+"C:\\Users\\user\\Desktop\\SQL.docx");
		
	}

}
