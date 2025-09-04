package com.vignesh.xpath_exercises_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium16_ActiTime {

    @Test

    public void test_actiTime() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.actitime.com/");
        driver.manage().window().maximize();

        //LinkText and Id - Default
        driver.findElement(By.linkText("Try actiTIME for Free")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("FirstName")).sendKeys("Vignesh");
        driver.findElement(By.id("LastName")).sendKeys("S");
        driver.findElement(By.id("Email")).sendKeys("vignesh281291@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Test");
        //driver.findElement(By.id("confirm-button")).click();

    }
}
