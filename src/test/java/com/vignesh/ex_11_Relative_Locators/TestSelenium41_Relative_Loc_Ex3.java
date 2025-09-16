package com.vignesh.ex_11_Relative_Locators;

import com.vignesh.Waits_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestSelenium41_Relative_Loc_Ex3 {

    @Test
    public void test_aqi() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        new WaitHelpers().waitJVMs(5000);
        WebElement search_box = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        search_box.sendKeys("india" + Keys.ENTER);

        new WaitHelpers().waitJVMs(5000);

        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,'location-name')]/p"));

        for (WebElement location : locations)
        {
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.xpath("//div[contains(@class,\"aqi-level\")]")).toRightOf(location)).getText();
            System.out.println("| +" + rank + " | " + location.getText() + " | " + aqi + " | ");
        }
    }
}
