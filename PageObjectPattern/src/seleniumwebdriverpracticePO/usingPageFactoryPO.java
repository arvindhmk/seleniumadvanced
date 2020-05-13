package seleniumwebdriverpracticePO;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class usingPageFactoryPO 
{
	@FindBy(how = How.ID, using="tricycle-checkbox")
	public static WebElement checkbox;
	
	@FindBy(id = "booksCheckboxes")
	public static WebElement radiobutton;
	
	@FindBy(id = "enterText")
	public static WebElement text;
	
	

}
