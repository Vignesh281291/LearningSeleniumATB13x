package com.vignesh.ex_08_Windows;

import com.vignesh.Waits_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium36_windows_Advanced {

    @Test
    public void test_windows_IQ() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/analyze/heatmap/3/reports?token=eyJhY2NvdW50X2lkIjoxMTM0NTkxLCJleHBlcmltZW50X2lkIjozLCJjcmVhdGVkX29uIjoxNzU2MDA4MDkyLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiZTlmNmY0ZGZlMGJhMGIxNmQxMjZmMGJlOTUyMDQ3MmEiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&accountId=1134591");
        driver.manage().window().maximize();

        new WaitHelpers().waitJVMs(5000);

        String ParentWindow = driver.getWindowHandle();
        System.out.println("PW:" + ParentWindow);

        WebElement URL = driver.findElement(By.name("primaryUrl"));
        URL.clear();
        URL.sendKeys("https://thetestingacademy.com");

        new WaitHelpers().waitJVMs(2000);
        WebElement view_heatmap = driver.findElement(By.xpath("//button[text()=' View Heatmap ']"));
        view_heatmap.click();

        new WaitHelpers().waitJVMs(10000);

        Set<String> allwindow = driver.getWindowHandles();
        System.out.println(allwindow);

        for(String windows: allwindow)
        {
            if(!windows.equals(ParentWindow))
            {
                driver.switchTo().window(windows);
                driver.switchTo().frame("heatmap-iframe");
                new WaitHelpers().waitJVMs(5000);

                WebElement compare_btn = driver.findElement(By.xpath("//span[text()='Compare']"));
                Actions actions = new Actions(driver);
                actions.moveToElement(compare_btn).click().build().perform();
            }
        }
    }
}
