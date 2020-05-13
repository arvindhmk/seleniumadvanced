package pageobjectTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import objectrepository.Rediffhomepage;
import objectrepository.Rediffloginpage;

public class logintc 
{
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\Compressed\\geckodriver.exe");
		FirefoxProfile testProfile = new FirefoxProfile();
		testProfile.setAcceptUntrustedCertificates(true);
		testProfile.setAssumeUntrustedCertificateIssuer(true);
		testProfile.setAssumeUntrustedCertificateIssuer(true);
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, testProfile);
		WebDriver driver = new FirefoxDriver(dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Rediffloginpage lp = new Rediffloginpage(driver);
		lp.emailid().sendKeys("test_rediff.com");
		lp.password().sendKeys("testpassword");
		//lp.go().click();
		Rediffhomepage hp = new Rediffhomepage(driver);
		hp.home().click();
		hp.searchbox().sendKeys("watch");
		hp.searchicon().click();
//		WebDriverWait w = new WebDriverWait(driver,30);
//		w.until(ExpectedConditions.urlToBe("http://shopping.rediff.com/product/watches?sc_cid=shopping_inhomesrch"));
		driver.close();
	}
}
