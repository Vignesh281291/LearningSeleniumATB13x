package com.vignesh.ex_12_Selenium_Exceptions;

import com.vignesh.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium43_Nosuchelement_Exception {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();


        //Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#Vignesh"}
        try {
            WebElement name = driver.findElement(By.id("Vignesh"));
        } catch (NoSuchElementException e) {
            System.out.println("No Element Found!");
        }
    }
}
