package automacao.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		tags = "",
		glue = "automacao/steps",
		plugin = {"json:target/reports/CucumberReports.json", "pretty"},
		snippets = CucumberOptions.SnippetType.CAMELCASE
		)

public class RunnerTest {

}
