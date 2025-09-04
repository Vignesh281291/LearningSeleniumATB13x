package com.vignesh.ex_04_Selenium_XPATH;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestSelenium19_Radio_Checkbox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        //Implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));


        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vignesh");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sadhasivam");
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
    }
}
