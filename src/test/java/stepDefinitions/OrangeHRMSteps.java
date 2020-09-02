package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import oracle.jrockit.jfr.ActiveSettingEvent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRMSteps {

    WebDriver driver;
    @Given("^I launch Chrome browser")
    public void I_launch_Chrome_browser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @When("^I open orange hrm homepage")
    public void I_open_orange_hrm_homepage()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
    }

    @Then("^I verify that the logo present on page")
    public void verify_logo()
    {
        boolean logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).isDisplayed();
        Assert.assertEquals(true,logo);
    }

    @Then("^I enter \"(.*)\" and \"(.*)\"")
    public void enter_credentials(String Username, String Password)
    {
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(Username);
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(Password);
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
    }

    @Then("^I should enter successfully")
    public void validate_login() throws Throwable
    {
        try {
            boolean btnSubscribeExists = driver.findElement(By.xpath("//*[@id=\"Subscriber_link\"]")).isDisplayed();
            Assert.assertEquals(true,btnSubscribeExists);
        }
        catch (Exception e)
        {

        }

    }

    @And("^close browser")
    public void close_browser()
    {
        driver.quit();
    }


}
