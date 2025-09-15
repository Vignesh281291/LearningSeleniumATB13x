package com.vignesh.ex_06_Action_class;

import com.vignesh.Waits_Helper.WaitHelpers;
import com.vignesh.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium29_Makemytrip extends BaseClass {

    @Test

    public void test_makemytrip() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        new WaitHelpers().waitForVisibility(driver, 5, "//span[@data-cy='closeModal']");
        WebElement close_modal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        close_modal.click();

        new WaitHelpers().waitJVMs(5000);
        WebElement from_city = driver.findElement(By.xpath("//input[@id='fromCity']"));
        from_city.click();
//        WebElement to_city = driver.findElement(By.xpath("//input[@id='toCity']"));

//        from.sendKeys("IXC");
        Actions actions = new Actions(driver);
        actions.moveToElement(from_city).click()
                .sendKeys("IXC").build().perform();

//        actions.moveToElement(to_city).click()
//                .sendKeys("BOM").build().perform();

        new WaitHelpers().waitJVMs(3000);

        List<WebElement> from_cities = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));

        try {
            for (WebElement cities : from_cities) {

                if (cities.getText().contains("Chandigarh")) {
                    cities.click();
                }


            }
        } catch (Exception e) {
            System.out.println("OK");
        }
        //driver.quit();
    }
}
