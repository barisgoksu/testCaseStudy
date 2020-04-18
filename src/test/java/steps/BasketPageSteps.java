package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.BasketPageActions;


public class BasketPageSteps {

    BasketPageActions basketPageActions= new BasketPageActions();


    @Then("^Should see Email Info Pop-up$")
    public void should_see_Email_Info_Pop_up() throws Throwable {
        basketPageActions.shouldSeeEmailInfoPopup();

    }

    @And("^Click Ignore email verification alert$")
    public void click_Ignore_email_verification_alert() throws Throwable {
        basketPageActions.clickOnCloseEmailInformationPopup();
    }

    @When("Click Agreed to the Terms And Conditions Checkbox")
    public void clickAgreedToTheTermsAndConditionsCheckbox() throws Exception {
        basketPageActions.clickOnCheckTermsCheckBox();

    }

    @And("Click Pay Now Button")
    public void clickPayNowButton() throws Exception {
        basketPageActions.clickOnPayNowButton();

    }
}
