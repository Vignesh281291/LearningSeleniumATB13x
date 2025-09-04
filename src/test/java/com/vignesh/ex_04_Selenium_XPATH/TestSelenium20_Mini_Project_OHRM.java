package com.vignesh.ex_04_Selenium_XPATH;

import com.vignesh.utils.BaseClass;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium20_Mini_Project_OHRM extends BaseClass {

    @Owner("Vignesh")
    @Description("Verify login to OHRM")
    @Severity(SeverityLevel.CRITICAL)
    @Test

    public void login_OHRM()
    {
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hacker@4321");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }

        WebElement PIM = driver.findElement(By.xpath("//h6[text()='PIM']"));
        Assert.assertEquals(PIM.getText(),"PIM");

        closeBrowser(driver);
    }
}
