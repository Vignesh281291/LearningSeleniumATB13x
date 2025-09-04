package com.vignesh.ex_05_Selenium_WAITS;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSelenium22_Implicit_Wait {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //IW - This will never be used in real time
        driver.get("https://app.vwo.com");
    }
}
