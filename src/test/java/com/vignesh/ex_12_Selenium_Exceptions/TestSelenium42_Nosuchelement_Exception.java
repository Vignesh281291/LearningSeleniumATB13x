package com.vignesh.ex_12_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium42_Nosuchelement_Exception {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.id("Vignesh"));
        //Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#Vignesh"}

    }
}
