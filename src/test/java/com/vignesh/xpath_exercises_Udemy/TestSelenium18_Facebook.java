package com.vignesh.xpath_exercises_Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium18_Facebook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        //driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Vignesh");

        //Dynamic element - OR
        driver.findElement(By.xpath("//input[@id='u_0_8_ck' or contains(@name,'first')]")).sendKeys("Vicky");
        //driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("S3");
        
        //Dynamic element - AND
        driver.findElement(By.xpath("//input[contains(@aria-label,'Surname') and @name='lastname']")).sendKeys("Vihaana");
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        //driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("vignesh28@gmail.com");


        //Dynamic element - Hybrid (Starts-with, contains, AND)
        driver.findElement(By.xpath("//input[starts-with(@aria-label,'Mobile') and contains(@name,'email')]")).sendKeys("vicky@gmail.com");
    }
}