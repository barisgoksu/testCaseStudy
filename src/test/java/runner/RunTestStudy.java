package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        monochrome = true,
        features =
                {"src/test/resources/FeatureFiles/"},

        plugin= {"pretty","html:target/cucumber-htmlreport","json:target/cucumber/cucumber.json"},



        glue = {"steps/"}

)


public class RunTestStudy {
}
