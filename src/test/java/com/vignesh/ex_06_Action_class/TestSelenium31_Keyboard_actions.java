package com.vignesh.ex_06_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium31_Keyboard_actions {

    @Test
    public void test_keyboard_actions()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        Actions action = new Actions(driver);
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

        action.keyDown(Keys.SHIFT).sendKeys(firstname, "vignesh").keyUp(Keys.SHIFT).build().perform();
    }
}
