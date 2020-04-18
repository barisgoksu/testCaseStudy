package steps;


import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.SeleniumDriver;


public class AfterActions {

    @After
    public static void tearDown(Scenario scenario) throws Exception {
    	
    	WebDriver driver= SeleniumDriver.getDriver();
    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/jpg");

         }
        SeleniumDriver.tearDown();
    }
}
