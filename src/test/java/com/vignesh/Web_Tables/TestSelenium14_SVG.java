package com.vignesh.Web_Tables;

import com.vignesh.Waits_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v137.page.model.WebAppManifest;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium14_SVG {

    @Test

    public void test_SVG() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/search");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("macmini");

        //List of SVG's - Many SVG's
        List<WebElement> svgs = driver.findElements(By.xpath("//*[local-name()='svg']")); // alternate xpath - //*[name()='svg']
        svgs.get(0).click();


        WaitHelpers wait = new WaitHelpers();
        wait.waitForVisibility(driver, 5, "//div[contains(@data-id,'CPU')]/div/a[2]");

        List<WebElement> titles_1 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

//        for (WebElement title : titles_1)
//            System.out.println(title.getText());

        WebElement next_btn = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
//        next_btn.click();

        while (next_btn.isDisplayed()) {
            //WebElement next_button = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
            next_btn.click();
            wait.waitForVisibility(driver, 3, "//a[normalize-space()='Next']" );



//            wait.waitForVisibility(driver, 5, "//div[contains(@data-id,'CPU')]/div/a[2]");
//
//            List<WebElement> titles_2 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
//
//            for (WebElement title : titles_2)
//                if (title.getText() != null) {
//                    System.out.println(title.getText());
        }
    }
}
