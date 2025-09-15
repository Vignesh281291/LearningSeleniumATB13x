package com.vignesh.ex_06_Action_class;

import com.vignesh.Waits_Helper.WaitHelpers;
import com.vignesh.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestSelenium30_SpiceJet extends BaseClass {

    @Test

    public void test_actions()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        WebElement from_Spicejet = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));
        WebElement to_Spicejet = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div/input"));

        action.moveToElement(from_Spicejet).click().sendKeys("BLR").moveToElement(to_Spicejet).click().sendKeys("DEL").build().perform();
        closeBrowser(driver);
    }
}
