package com.vignesh.ex_07_File_Upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium34_Fileupload {

    @Test

    public void fileupload()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement uploadfile = driver.findElement(By.id("fileToUpload"));
        String user_dir = System.getProperty("user.dir");
        String path = user_dir + "/src/test/java/com/vignesh/ex_07_File_Upload/testdata.txt";
        uploadfile.sendKeys(path);
        driver.findElement(By.name("submit")).click();


    }
}
