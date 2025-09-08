package com.vignesh.ex_04_Selenium_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestSelenium27_Select_Static {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        WebElement select_element = driver.findElement(By.id("dropdown"));
        Select select = new Select(select_element);
        //select.selectByVisibleText("Option 1");
        select.selectByIndex(1);


    }
}
