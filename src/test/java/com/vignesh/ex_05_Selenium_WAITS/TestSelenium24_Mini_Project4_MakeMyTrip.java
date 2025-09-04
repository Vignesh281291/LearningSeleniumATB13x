package com.vignesh.ex_05_Selenium_WAITS;

import com.vignesh.Waits_Helper.WaitHelpers;
import com.vignesh.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium24_Mini_Project4_MakeMyTrip extends BaseClass {

    @Test

    public void closeModal()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        new WaitHelpers().waitForVisibility(driver, 3, "//span[@data-cy='closeModal']");
        WebElement close = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        close.click();

        closeBrowser(driver);
    }
}
