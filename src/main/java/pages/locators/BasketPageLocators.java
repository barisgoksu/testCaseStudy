package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasketPageLocators {

	
	@FindBy(how=How.CSS,using=".form")
	public WebElement form;

	@FindBy(how=How.ID,using="close")
	public WebElement clickCloseEmailInformationPopup;

	@FindBy(how=How.CSS,using=".bc-subscribe.border-none.show")
	public WebElement clickPayNowButton;

	@FindBy(how=How.CSS,using=".custom-checkbox")
	public WebElement clickCheckTermsCheckBox;



}
