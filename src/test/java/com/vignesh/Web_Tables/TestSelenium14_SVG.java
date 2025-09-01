package com.vignesh.Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v137.page.model.WebAppManifest;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium14_SVG {

    @Test

    public void test_SVG()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svg = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svg.get(0).click();
    }
}
