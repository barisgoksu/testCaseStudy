package pages.actions;


import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import pages.locators.RegisterPageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class RegisterPageActions {

	RegisterPageLocators registerPageLocators=null;

	public RegisterPageActions()
	{
		
		this.registerPageLocators=new RegisterPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), registerPageLocators);
	}

	public void setFirstName(String firstName) throws Exception {


		SeleniumHelper.setElement(registerPageLocators.firstNameText,firstName);

	}


	public void setLastName(String lastName) throws Exception {

		SeleniumHelper.setElement(registerPageLocators.lastNameText,lastName);


	}

	public void setRandomEmail() throws Exception {

		SeleniumHelper.setElement(registerPageLocators.emailText, SeleniumHelper.generateEmail("gmail.com", 5));


	}

	public void setPassword(String password) throws Exception {

		SeleniumHelper.setElement(registerPageLocators.passwordText,password);


	}


	public void clickOnRegisterButton() throws Exception {
	    SeleniumHelper.clickElement(registerPageLocators.clickRegisterButton);

	}



}
