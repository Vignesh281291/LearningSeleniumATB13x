package com.vignesh.ex_03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium11_Locators_Start_A_Free_Trial_VWO {

    @Description("Verify Starting a Free Trial on VWO app and check error is displayed when providing invalid business email")
    @Test

    public void test_invalid_business_email_vwo()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        // Step 1 - Click on Start a Free Trial link on app.vwo.com
        try
        {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
        WebElement link = driver.findElement(By.cssSelector("a[data-qa=bericafeqo]"));
        link.click();

        // Step 2 - Enter invalid email address and check the checkbox

        WebElement business_email = driver.findElement(By.id("page-v1-step1-email"));
        business_email.sendKeys("vicky");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();

        // Step 3 - Click on Create a Free Trial Account button

        driver.findElement(By.cssSelector("[data-qa='page-su-submit']")).click();

        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }

        //Step 4 - Verify error message
        WebElement error_msg = driver.findElement(By.xpath("//*[text()='The email address you entered is incorrect.']"));
        System.out.println(error_msg.getText());
        Assert.assertEquals(error_msg.getText(), "The email address you entered is incorrect.");

        driver.quit();
    }
}
