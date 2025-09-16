package com.vignesh.ex_10_ShadowDOM;

import com.vignesh.Waits_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium38_ShowdowDOM {

    @Test
    public void test_shadowdom()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        new WaitHelpers().waitJVMs(5000);

        //driver.findElement(By.id("pizza")).sendKeys("Margarita");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement pizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('input#pizza');");
        pizza.sendKeys("Margarita");

    }
}
