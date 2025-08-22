package com.vignesh.ex_02_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSelenium03 {
    public static void main(String[] args) {
        //SearchContext - Interface
        //WebDriver - Interface
        //RemoteWebDriver - Class
        //Chrome Driver //Firefox Driver //Edge Driver //Opera Driver

        //SearchContext driver = new EdgeDriver(); //Only 2 functions, so not used mostly
        //driver.findElement();
        //driver.findElements();



        //RemoteWebDriver driverr = new FirefoxDriver();
        //driverr.get();

        //If u want to run the test cases on Chrome or Edge? 1 to 2%
        //ChromeDriver driverc = new ChromeDriver();
        //driverc.get();

        //If u want to run the test cases on Chrome and later u want to change to Edge or other browser? 96%
        WebDriver driverw = new ChromeDriver();
        driverw = new FirefoxDriver();

        //If u want to run the test cases on multiple browsers, aws machine? 2%
        //RemoteWebDriver driver (with GRID) - Advanced - last 2 sessions


    }
}
