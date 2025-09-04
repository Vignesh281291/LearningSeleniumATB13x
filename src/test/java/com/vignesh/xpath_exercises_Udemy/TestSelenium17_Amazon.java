package com.vignesh.xpath_exercises_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium17_Amazon {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        //Thread.sleep(3000);
        driver.findElement(By.linkText("Your Account")).click();
        driver.findElement(By.name("field-keywords")).sendKeys("Barbie Dolls");

        //Thread.sleep(3000);
        driver.findElement(By.id("nav-search-submit-button")).click();

        //Thread.sleep(4000);
        driver.findElement(By.partialLinkText("Baby Doctor")).click();

        //Thread.sleep(2000);

        String product_title = driver.findElement(By.id("productTitle")).getText();
        String product_price = driver.findElement(By.className("a-price-whole")).getText();
        System.out.println(product_title);
        System.out.println(product_price);
    }
}
