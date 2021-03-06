package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        monochrome = true,

        features =
                {"src/test/resources/feature/"},

        plugin= {"pretty","html:target/cucumber-reports","json:target/cucumber/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},


        glue = {"steps/", "hooks/"}

)


public class RunTestStudy {
}
