package com.vignesh.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium04_Change_Driver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        //driver.close();
        driver = new FirefoxDriver();
        //driver.close();
    }
}
