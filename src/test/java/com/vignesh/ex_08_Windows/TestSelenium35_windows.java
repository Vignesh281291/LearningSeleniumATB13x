package com.vignesh.ex_08_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium35_windows {

    @Test

    public void test_windows()
    {
        WebDriver driver = new ChromeDriver();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id);
        System.out.println(driver);

        WebElement link_parent = driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        link_parent.click();

        //2 windows
        Set<String> windows_id = driver.getWindowHandles();
        System.out.println(windows_id);

        for(String window: windows_id) {
            driver.switchTo().window(window);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Passed");
            }
        }
        driver.switchTo().window(parent_id);
    }
}
