package testRunner;
import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.Status;
import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Karate.class)
@KarateOptions(features = "C:\\Users\\Administrator\\IdeaProjects\\SeleniumGradle\\src\\test\\java\\Features\\getRequest.feature")
public class testRunnerAPI {
}
