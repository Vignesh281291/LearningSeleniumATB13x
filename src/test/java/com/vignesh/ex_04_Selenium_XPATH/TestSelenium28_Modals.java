package com.vignesh.ex_04_Selenium_XPATH;

import com.vignesh.Waits_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium28_Modals {

    @Test

    public void test_Modal()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        //new WaitHelpers().waitJVMs(5000);
        new WaitHelpers().waitForVisibility(driver, 5, "//span[@data-cy='closeModal']");
        //waitJVMs(3000);
        WebElement close_modal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        close_modal.click();
    }
}
