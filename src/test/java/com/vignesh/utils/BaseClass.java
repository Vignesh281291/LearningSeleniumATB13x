package com.vignesh.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {

    public WebDriver driver;
public WebDriver openBrowser(WebDriver driver, String URL)
{

    driver.get(URL);
    driver.manage().window().maximize();
    return driver;
}

public void closeBrowser(WebDriver driver)
{
    try
    {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e.getMessage());
    }
    driver.quit();
}

public WebElement findElementByLinkText(WebDriver driver, String text)
{
    return driver.findElement(By.linkText(text));
}
}
