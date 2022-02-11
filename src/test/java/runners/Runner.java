package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "",
        plugin = {"html:target/cucumber.reports",
                "json:target/cucumber.json"},
        dryRun = false,
        monochrome = true
)

public class Runner {
}
