package com.vignesh.ex_13_DataDriven_ApachePOI;

import com.vignesh.utils.UtilExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium49_DD_ApachePOI_Ex3 {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String username, String password) {
        System.out.println("Running....");
        System.out.println("        Email                         Password");
        System.out.println(username + "-" + password);

    }

    @DataProvider
    public Object[][] getData() {
        return UtilExcel.getTestDataFromExcel("sheet1");
        }

    }
