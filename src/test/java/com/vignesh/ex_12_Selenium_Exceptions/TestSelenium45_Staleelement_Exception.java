package com.vignesh.ex_12_Selenium_Exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium45_Staleelement_Exception {

    @Test
    public void test_selenium_Stale_elemet_exception() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Start of program");

        WebElement input = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));


        driver.navigate().refresh();
//        org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
//        (Session info: chrome=140.0.7339.128)

        try {
            input.sendKeys("the testing academy" + Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("Stale Element Exception");
            // Again to find the  element
            WebElement inputbox  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            inputbox.sendKeys("the testing academy"+ Keys.ENTER);
        }
    }
}