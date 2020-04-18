package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

public class HomePageSteps {

    HomePageActions homePageActions= new HomePageActions();


    @Given("^Navigate to \"([^\"]*)\" of CarsGuide Website$")
    public void navigate_to_of_CarsGuide_Website(String webSiteURL) throws Throwable {
        SeleniumDriver.openPage(webSiteURL);
    }

    @When("^Click Subscribe button$")
    public void click_Subscribe_button() throws Throwable {
        homePageActions.clickOnSubscribeButton();

    }
}
