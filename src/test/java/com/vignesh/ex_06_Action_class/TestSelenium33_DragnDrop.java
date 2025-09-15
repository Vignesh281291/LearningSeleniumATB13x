package com.vignesh.ex_06_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSelenium33_DragnDrop {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        WebElement A = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement B = driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions action = new Actions(driver);
        action.dragAndDrop(A,B).build().perform();
    }
}