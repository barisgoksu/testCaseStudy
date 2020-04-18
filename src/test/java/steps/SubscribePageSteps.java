package steps;

import cucumber.api.java.en.And;
import pages.actions.SubscribePageActions;


public class SubscribePageSteps {

    SubscribePageActions subscribePageActions= new SubscribePageActions();



    @And("^Choose One Month Package$")
    public void choose_One_Month_Package() throws Throwable  {
        subscribePageActions.clickOnSubscribeOneMonthPackageButton();

    }

    @And("^Choose Monthly Pass with One Week Free Trial Package Price$")
    public void choose_Monthly_Pass_with_One_Week_Free_Trial_Package_Price() throws Throwable{
        subscribePageActions.clickOnSubscriptionMonthlyOneWeekFreeTrialPackageButton();

    }

}
