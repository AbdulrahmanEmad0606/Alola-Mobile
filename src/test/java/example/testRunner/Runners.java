package example.testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/main/resources/Features",
        glue = {"example.stepDefs"},
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@regression"
)
// AbstractTestNGCucumberTests => Runs cucumber every detected feature as separated test
public class Runners extends AbstractTestNGCucumberTests{
}
