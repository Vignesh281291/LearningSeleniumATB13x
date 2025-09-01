package com.vignesh.Web_Tables;

import com.vignesh.utils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium12_Web_Tables_01 extends BaseClass {


    @Test

    public void Web_Tables() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://awesomeqa.com/webtable.html");

        // Xpath - //table[@id="customers"]/tbody/tr[
        //i
        //]/td[
        //j
        //]
        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String sec_part = "]/td[";
        String third_part = "]";

        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        //System.out.println(rows);
        int cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();
        //System.out.println(cols);
        //closeBrowser(driver);


        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                String Dynamic_path = first_part + i + sec_part + j + third_part;
                //table[@id="customers"]/tbody/tr[ + 2 + ]/td[ + 1 + ] --> table[@id="customers"]/tbody/tr[2]/td[1]
                //System.out.println(Dynamic_path);

                String data = driver.findElement(By.xpath(Dynamic_path)).getText();
                //System.out.println(data);

                if(data.contains("Maria Anders"))
                {
                    String Country_path = Dynamic_path+"/following-sibling::td";
                    String country = driver.findElement(By.xpath(Country_path)).getText();
                    System.out.println(country);
                    System.out.println("-----------");
                    System.out.println("Maria Anders Country is " + country);
                }

            }
        }
        closeBrowser(driver);
    }
}
