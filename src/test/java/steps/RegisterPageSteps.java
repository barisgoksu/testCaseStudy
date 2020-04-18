package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.RegisterPageActions;

public class RegisterPageSteps {

    RegisterPageActions registerPageActions= new RegisterPageActions();

    @When("^Write Name As \"([^\"]*)\"$")
    public void write_Name_As(String firstName) throws Throwable {
        registerPageActions.setFirstName(firstName);

    }

    @When("^Write Surname As \"([^\"]*)\"$")
    public void write_Surname_As(String lastName) throws Throwable {
        registerPageActions.setLastName(lastName);

    }

    @When("^Write Email As randomly$")
    public void write_Email_As_randomly() throws Throwable {
        registerPageActions.setRandomEmail();
    }

    @When("^Write Password As \"([^\"]*)\"$")
    public void write_Password_As(String password) throws Throwable {
        registerPageActions.setPassword(password);
    }

    @And("^Click Create Account Button$")
    public void click_Create_Account_Button() throws Throwable {

        registerPageActions.clickOnRegisterButton();
    }

}
