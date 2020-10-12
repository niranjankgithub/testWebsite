package BusinessLogic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddtoCart {
    @Test
    public void AddItemtoCart()
    {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        //WebDriver driver=new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/inventory.html");
        driver.findElement(By.xpath("//div[contains(@class, 'inventory_item_name') and contains(., 'Sauce Labs Backpack')]")).click();
        driver.findElement(By.xpath("//button[contains(@class, 'btn_primary btn_inventory') and contains(., 'ADD TO CART')]")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'shopping_cart_link fa-layers fa-fw')]")).click();
        boolean itemDisplayed = driver.findElement(By.xpath("//div[contains(@class, 'inventory_item_name') and contains(., 'Sauce Labs Backpack')]")).isDisplayed();
        Assert.assertFalse(itemDisplayed);
    }
}