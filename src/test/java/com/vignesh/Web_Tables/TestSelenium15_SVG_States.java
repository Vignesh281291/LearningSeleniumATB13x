package com.vignesh.Web_Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium15_SVG_States {

    @Test

    public void SVG_States()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");

        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));

        for(WebElement state: states)
        {
            System.out.println(state.getAttribute("aria-label"));

            if(state.getAttribute("aria-label").contains("Tripura"))
            {
                state.click();
            }
        }
    }
}
