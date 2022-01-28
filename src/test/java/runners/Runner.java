package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@Search",
        plugin = {"html:target/cucumber.reports",
                "json:target/cucumber.json"},
        dryRun = false
)

public class Runner {
}
