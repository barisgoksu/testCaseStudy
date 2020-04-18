package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPageLocators {

	
	@FindBy(how=How.XPATH,using="//*[@id=\"ncol_ref\"]/tbody/tr[2]/td[2]")
	public WebElement controlTotalCharge;

	@FindBy(how=How.ID,using="Ecom_Payment_Card_Name")
	public WebElement creditCardName;

	@FindBy(how=How.ID,using="Ecom_Payment_Card_Number")
	public WebElement creditCardNumber;

	@FindBy(how=How.ID,using="Ecom_Payment_Card_ExpDate_Month")
	public WebElement creditCardExpireDateMonth;

	@FindBy(how=How.ID,using="Ecom_Payment_Card_ExpDate_Year")
	public WebElement creditCardExpireDateYear;

	@FindBy(how=How.ID,using="Ecom_Payment_Card_Verification")
	public WebElement creditCardVerificationCode;

	@FindBy(how=How.ID,using="submit3")
	public WebElement clickConfirmPayment;

	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div/table[2]/tbody/tr/td/h3")
	public WebElement expectedErrorMassage;






}
