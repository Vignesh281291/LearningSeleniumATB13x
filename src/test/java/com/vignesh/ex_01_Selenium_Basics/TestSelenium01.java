package com.vignesh.ex_01_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {
    @Test
    public void test_Code()
    {
        Assert.assertEquals("Vignesh", "Vignesh");
    }
    @Test
    public void test_OpenTestingAcademy()
    {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://thetestingacademy.com/");
    }
}
