package com.vignesh.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium05_Selenium_Commands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        //driver.quit();
        driver.manage().window().maximize();
        String URL = driver.getCurrentUrl();
        System.out.println(URL);
    }
}
