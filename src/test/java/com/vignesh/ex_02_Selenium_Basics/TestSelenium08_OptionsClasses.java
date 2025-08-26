package com.vignesh.ex_02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSelenium08_OptionsClasses {
    public static void main(String[] args) {

        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--headless"); //ChromeOprions and other options classes has some specific functions like headless mode
        //incognito mode, guest mode where it (headless) can be used when a test case doesn't need to be seen
        //--headless -> However, in the backend the browser will be launched and the test case will be executed as usual but will not be seen

        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

        WebDriver driver = new ChromeDriver(chrome);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }
}
