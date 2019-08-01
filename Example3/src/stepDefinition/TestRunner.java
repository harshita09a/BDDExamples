package stepDefinition;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/framework" }, glue = { "stepDefinition" })
public class TestRunner {

}
