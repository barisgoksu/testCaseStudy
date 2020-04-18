package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.BasketPageActions;
import pages.actions.PaymentPageActions;

public class PaymentPageStep {


    PaymentPageActions paymentPageActions= new PaymentPageActions();



    @Then("^Expect for a total charge of \"([^\"]*)\" since this is a free trial package$")
    public void expect_for_a_total_charge_of_since_this_is_a_free_trial_package(String expected) throws Throwable {
        paymentPageActions.controlTotalCharge(expected);
    }

    @When("^Write CarD Name as \"([^\"]*)\"$")
    public void write_CarD_Name_as(String cardName) throws Throwable {
        paymentPageActions.setCreditCardName(cardName);

    }

    @And("^Write CarD Number as \"([^\"]*)\"$")
    public void write_CarD_Number_as(String cardNumber) throws Throwable {
        paymentPageActions.setCreditCardNumber(cardNumber);

    }

    @And("^Select Card ExpDate Month as \"([^\"]*)\"$")
    public void select_Card_ExpDate_Month_as(String cardExpireDateMonth) throws Throwable {
        paymentPageActions.setCreditCardExpireDateMonth(cardExpireDateMonth);

    }

    @And("^Select Card ExpDate Year as \"([^\"]*)\"$")
    public void select_Card_ExpDate_Year_as(String cardExpireDateYear) throws Throwable {
        paymentPageActions.setCreditCardExpireDateYear(cardExpireDateYear);

    }

    @And("^Write Card Verification code as \"([^\"]*)\"$")
    public void write_Card_Verification_code_as(String cardVerificationCode) throws Throwable {
        paymentPageActions.setCreditCardVerificationCode(cardVerificationCode);

    }

    @Then("^Click Confirm My Payment$")
    public void click_Confirm_My_Payment() throws Throwable {
        paymentPageActions.clickOnConfirmPayment();

    }

    @Then("^Should See Error Text as \"([^\"]*)\"$")
    public void should_See_Error_Text_as(String expected) throws Throwable {
       paymentPageActions.controlExpectedErrorMessage(expected);
    }
}

