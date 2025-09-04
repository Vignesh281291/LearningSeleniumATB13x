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

import java.util.List;

public class TestSelenium21_Mini_Project2_Katalon extends BaseClass {

    @Owner("Vignesh")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that with valid email, pass, appointment page is loaded")
    @Test
    public void test_katalon_login() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();

        List<WebElement> username = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username.get(1).sendKeys("John Doe");

        List<WebElement> password = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login = driver.findElement(By.xpath("//button[@id='btn-login']"));
        // //button[text()="Login"]
        login.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");


        //h2[text()="Make Appointment"]
        WebElement Title = driver.findElement(By.xpath("//h2[text()='Make Appointment']"));
        Assert.assertEquals(Title.getText(), "Make Appointment");
        Assert.assertTrue(Title.isDisplayed());
    }
}

