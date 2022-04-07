package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        monochrome = true,
        tags = "@regression",
        dryRun = false
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
