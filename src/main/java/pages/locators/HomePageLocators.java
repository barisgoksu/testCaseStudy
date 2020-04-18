package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

	
	@FindBy(how=How.CSS,using=".menu-user-panel .subscribe")
	public WebElement SubscribeButton;
}
