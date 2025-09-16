package com.vignesh.ex_12_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium44_Staleelement_Exception {

    @Test
    public void test_selenium_Stale_elemet_exception() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Start of program");

        WebElement search_input_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));


        driver.navigate().refresh();
//        org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
//        (Session info: chrome=140.0.7339.128)

        search_input_box.sendKeys("the testing academy" + Keys.ENTER);
    }
}