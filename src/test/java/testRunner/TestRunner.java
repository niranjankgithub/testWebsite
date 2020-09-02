package testRunner;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.Status;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Administrator\\IdeaProjects\\SeleniumGradle\\src\\test\\resources\\Features\\OrangeHRM.feature",
                 glue={"stepDefinitions"},
                 plugin = {"pretty", "html:target/cucumber-reports/reports.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = true)

public class TestRunner {



}
