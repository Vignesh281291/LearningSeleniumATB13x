package com.vignesh.ex_03_Selenium_Locators;

import com.vignesh.utils.BaseClass;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium11_Locators_Start_a_free_trial_VWO extends BaseClass {

    @Description("Verify Starting a Free Trial on VWO app and check error is displayed when providing invalid business email")
    @Test

    public void test_invalid_business_email_vwo()
    {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com/");

        // Step 1 - Click on Start a Free Trial link on app.vwo.com
        //LinkText
        //WebElement link = driver.findElement(By.linkText("Start a free trial"));
        WebElement link = findElementByLinkText(driver, "Start a free trial");
        link.click();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("trial"));
        //Partial link text
        //WebElement partial_link = driver.findElement(By.partialLinkText("Start a free"));

        // Step 2 - Enter invalid text
        // and check the checkbox

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
        //WebElement error_msg = driver.findElement(By.xpath("//*[text()='The email address you entered is incorrect.']"));
        WebElement error = driver.findElement(By.className("invalid-reason"));
        System.out.println(error.getText());
        Assert.assertEquals(error.getText(), "The email address you entered is incorrect.");

        closeBrowser(driver);
    }
}
