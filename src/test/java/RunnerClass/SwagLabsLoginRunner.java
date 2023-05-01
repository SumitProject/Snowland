package RunnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\swandhare\\eclipse-workspace\\BDD_cucumber_Proj\\Feature\\SwagLabsLogin.feature",
        glue={"StepDefination"},monochrome = true,
        plugin = {"pretty","junit:target/JUnitReports/report.xml",
        "json:target/JASONReports/report.json",
        "html:target/HtmlReports"})
public class SwagLabsLoginRunner {

}
