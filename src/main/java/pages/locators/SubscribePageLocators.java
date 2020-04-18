package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SubscribePageLocators {


	@FindBy(how=How.XPATH,using="/html/body/div[6]/div[1]/div[2]")
	public WebElement subscriptionOneMonthPackageButton;

	@FindBy(how=How.XPATH,using="/html/body/div[6]/div[3]/div/div[2]/div[2]/div[2]/a")
	public WebElement subscriptionMonthlyOneWeekFreeTrialPackageButton;
}
