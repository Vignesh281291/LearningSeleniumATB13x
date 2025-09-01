package com.vignesh.Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium13_Web_Tables_02 {

    @Test

    public void web_Tables2()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println(table);
        System.out.println(rows);

        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
            for (WebElement c : cols)
            {
                System.out.println(c.getText());
            }

        }
    }
}
