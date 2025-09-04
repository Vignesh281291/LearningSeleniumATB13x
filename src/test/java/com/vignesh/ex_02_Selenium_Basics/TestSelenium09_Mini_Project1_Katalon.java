package com.vignesh.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium09_Mini_Project1_Katalon {

    @Description("Verify the text exists on Katalon website")
    @Test

    public void test_verify_text_katalon() {
        //ChromeOptions chromeOptions = new ChromeOptions();

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");

        if(driver.getPageSource().contains("CURA Healthcare Service"))
        {
            System.out.println("Passed");
            Assert.assertTrue(true);
        }
        else
        {
            System.out.println("Failed");
            Assert.fail();
        }
        driver.quit();
    }

}
