package br.com.chronosAcademy.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@fecharModal",
        glue = "br/com/chronosAcademy/steps",
        features = "src/test/resources/features/",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"json:target/reports/CucumberReports.json", "pretty"}
)
public class RunnerTest {
}
