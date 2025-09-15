package com.vignesh.ex_06_Action_class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium32_pagedown {

    @Test

    public void test_Pagedown()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com/");

        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
    }
}
