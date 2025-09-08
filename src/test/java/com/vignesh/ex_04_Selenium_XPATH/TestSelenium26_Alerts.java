package com.vignesh.ex_04_Selenium_XPATH;

import com.vignesh.Waits_Helper.WaitHelpers;
import com.vignesh.utils.BaseClass;
import io.qameta.allure.Description;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium26_Alerts extends BaseClass{

    @Test
    @Description("Handling Alerts")

    public void test_Alerts()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //WebElement Alert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        WebElement Confirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        //WebElement Prompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        WebElement PromptCSS = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));


        //Alert.click();
        //Confirm.click();
        PromptCSS.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        //alert.accept();
        //alert.dismiss();
        alert.sendKeys("Vignesh");
        alert.accept();

        String result = driver.findElement(By.id("result")).getText();

        //Assert.assertEquals(result, "You successfully clicked an alert");
        //Assert.assertEquals(result, "You clicked: Ok");
        //Assert.assertEquals(result,"You clicked: Cancel");
        Assert.assertEquals(result, "You entered: Vignesh");

        closeBrowser(driver);


    }
}
