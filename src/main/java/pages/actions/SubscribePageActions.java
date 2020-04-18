package pages.actions;


import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import pages.locators.SubscribePageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class SubscribePageActions {

	SubscribePageLocators subscribePageLocators=null;

	public SubscribePageActions()
	{
		
		this.subscribePageLocators=new SubscribePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), subscribePageLocators);
	}

	public void clickOnSubscribeOneMonthPackageButton() throws Exception {

		SeleniumHelper.clickElement(subscribePageLocators.subscriptionOneMonthPackageButton);


	}

	public void clickOnSubscriptionMonthlyOneWeekFreeTrialPackageButton() throws Exception {


		SeleniumHelper.clickElement(subscribePageLocators.subscriptionMonthlyOneWeekFreeTrialPackageButton);

	}

}
