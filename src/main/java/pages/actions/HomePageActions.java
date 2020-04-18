package pages.actions;


import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class HomePageActions {

	HomePageLocators homePageLocators=null;

	public HomePageActions()
	{
		
		this.homePageLocators=new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
	}

	public void clickOnSubscribeButton() throws Exception {

		SeleniumHelper.clickElement(homePageLocators.SubscribeButton);

	}


}
