package resources;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        plugin = { "pretty", "html:src/test/java/cucumber-reports/test-results.html"}
)
public class runnerTest {

}
