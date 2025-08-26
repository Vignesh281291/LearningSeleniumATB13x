package com.vignesh.ex_02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium06_Assertions {

    @Description("Verify the assetions on the URL Title")
    @Test
    public void test_Assertions()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String URL = driver.getCurrentUrl();

        //TestNG Assertions
        Assert.assertEquals(URL, "https://www.google.com/");

        //Assertj Assertions
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        //RestAssured assertions cannot be used as no response data will be available

    }
}
