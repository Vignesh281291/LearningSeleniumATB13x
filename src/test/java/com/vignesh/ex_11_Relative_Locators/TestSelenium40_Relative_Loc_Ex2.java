package com.vignesh.ex_11_Relative_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestSelenium40_Relative_Loc_Ex2 {

    @Test
    public void test_RL_codepen()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");
        driver.findElement(By.xpath("//form[@id='form']/button")).click();

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));

        WebElement error_username = driver.findElement(with(By.tagName("small")).below(username));

        String error_txt = error_username.getText();
        //System.out.println(error_txt);

        Assert.assertEquals(error_txt, "Username must be at least 3 characters");
    }
}
