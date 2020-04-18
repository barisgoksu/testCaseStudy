package pages.actions;


import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;
import pages.locators.BasketPageLocators;


import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class BasketPageActions {

	BasketPageLocators basketPageLocators=null;

	public BasketPageActions()
	{
		this.basketPageLocators= new BasketPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), basketPageLocators);
	}

	public void shouldSeeEmailInfoPopup()
	{

		SeleniumHelper.wait_element_visible(basketPageLocators.form);
		assertTrue(basketPageLocators.form.isDisplayed());
	}

	public void clickOnCloseEmailInformationPopup() throws Exception {
		SeleniumHelper.clickElement(basketPageLocators.clickCloseEmailInformationPopup);
	}

	public void clickOnCheckTermsCheckBox() throws Exception {

		SeleniumHelper.clickElement(basketPageLocators.clickCheckTermsCheckBox);

	}


	public void clickOnPayNowButton() throws Exception {

		SeleniumHelper.clickElement(basketPageLocators.clickPayNowButton);

	}

}
