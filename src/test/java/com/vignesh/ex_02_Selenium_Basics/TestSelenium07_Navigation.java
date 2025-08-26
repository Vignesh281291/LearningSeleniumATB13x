package com.vignesh.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium07_Navigation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com/");

        driver.navigate().to("https://www.google.com/");
        //driver.navigate().forward();
        //driver.navigate().back();
        driver.navigate().refresh();
    }
}
