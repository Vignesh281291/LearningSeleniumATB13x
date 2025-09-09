package com.vignesh.Web_Tables;

import com.vignesh.Waits_Helper.WaitHelpers;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium_SVG_NextPage {

    @Test

    public void test_flipkart_Nextpage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/search");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("macmini");

        //List of SVG's - Many SVG's
        List<WebElement> svgs = driver.findElements(By.xpath("//*[local-name()='svg']")); // alternate xpath - //*[name()='svg']
        svgs.get(0).click();


        WaitHelpers wait = new WaitHelpers();
        wait.waitForVisibility(driver, 5, "//div[contains(@data-id,'CPU')]/div/a[2]");

//        List<WebElement> titles_1 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

//        for (WebElement title : titles_1)
//            System.out.println(title.getText());
        int pg_count = 1;
        while (true) {
            try {
                System.out.println("Page " + pg_count + " Products:");
                List<WebElement> titles_1 = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));
                for (WebElement title : titles_1)
                    System.out.println(title.getText());
                wait.waitForVisibility(driver, 5, "//a[normalize-space()='Next']");
                WebElement next_btn = driver.findElement(By.xpath("//a[normalize-space()='Next']"));
                next_btn.click();
                System.out.println("Clicked Next");
                pg_count++;
                Thread.sleep(5000);
                if (titles_1.isEmpty()) {
                    System.out.println("No products");
                    break;
                }

            } catch (NoSuchElementException e) {
                System.out.println("No Next button found. Reached last page.");
                break;
            } catch (ElementClickInterceptedException e) {
                System.out.println("Next button not clickable. Stopping.");
                break;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

