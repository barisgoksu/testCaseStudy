package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPageLocators {

	
	@FindBy(how=How.XPATH,using="//*[@id=\"form-register\"]/div/div[2]/div[3]/input")
	public WebElement firstNameText;

	@FindBy(how=How.XPATH,using="//*[@id=\"form-register\"]/div/div[2]/div[4]/input")
	public WebElement lastNameText;

	@FindBy(how=How.XPATH,using="//*[@id=\"form-register\"]/div/div[2]/div[5]/input")
	public WebElement emailText;

	@FindBy(how=How.ID,using="password")
	public WebElement passwordText;

	@FindBy(how=How.XPATH,using="//*[@id=\"form-register\"]/div/div[2]/div[11]/input")
	public WebElement clickRegisterButton;


}
