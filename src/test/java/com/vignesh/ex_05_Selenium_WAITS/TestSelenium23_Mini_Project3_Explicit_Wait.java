package com.vignesh.ex_05_Selenium_WAITS;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium23_Mini_Project3_Explicit_Wait {
    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Pramod Dutta")
    @Test

    public void test_vwo_invalid_login()
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://app.vwo.com");

        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.


        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password  and enter the 1234.
        // Step 3 - Find the Submit  and click on the button.
        WebElement email_address = driver.findElement(By.id("login-username"));
        email_address.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("1234");

        WebElement sign_in = driver.findElement(By.id("js-login-btn"));
        sign_in.click();

        // Step 4 - Wait some time.
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e.getMessage());
//        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        // Step 5 - Verify the message error message.
        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());
        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        driver.quit();
    }
}
