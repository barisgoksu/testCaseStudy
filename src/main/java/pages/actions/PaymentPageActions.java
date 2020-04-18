package pages.actions;


import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.locators.BasketPageLocators;
import pages.locators.PaymentPageLocators;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

import static org.junit.Assert.assertTrue;

public class PaymentPageActions {

	PaymentPageLocators paymentPageLocators=null;

	public PaymentPageActions()
	{
		this.paymentPageLocators= new PaymentPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), paymentPageLocators);
	}

	public void controlTotalCharge(String expected)
	{


		SeleniumHelper.wait_element_visible(paymentPageLocators.controlTotalCharge);

		Assert.assertTrue(paymentPageLocators.controlTotalCharge.getText().contains(expected));

	}

	public void setCreditCardName(String cardName) throws Exception {

		SeleniumHelper.setElement(paymentPageLocators.creditCardName,cardName);


	}

	public void setCreditCardNumber(String cardNumber) throws Exception {

		SeleniumHelper.setElement(paymentPageLocators.creditCardNumber,cardNumber);

	}

	public void setCreditCardExpireDateMonth(String cardExpireDateMonth) throws Exception {

     SeleniumHelper.selectElement(paymentPageLocators.creditCardExpireDateMonth,cardExpireDateMonth);
	}

	public void setCreditCardExpireDateYear(String cardExpireDateYear) throws Exception {

		SeleniumHelper.selectElement(paymentPageLocators.creditCardExpireDateYear,cardExpireDateYear);

	}


	public void setCreditCardVerificationCode(String cardVerificationCode) throws Exception {

		SeleniumHelper.setElement(paymentPageLocators.creditCardVerificationCode,cardVerificationCode);

	}


	public void clickOnConfirmPayment() throws Exception {

		SeleniumHelper.clickElement(paymentPageLocators.clickConfirmPayment);

	}


	public void controlExpectedErrorMessage(String expected)
	{


		SeleniumHelper.wait_element_visible(paymentPageLocators.expectedErrorMassage);

		Assert.assertTrue(paymentPageLocators.expectedErrorMassage.getText().equals(expected));

	}


}
