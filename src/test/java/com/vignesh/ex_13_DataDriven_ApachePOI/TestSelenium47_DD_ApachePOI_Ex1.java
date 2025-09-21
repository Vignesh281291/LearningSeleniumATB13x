package com.vignesh.ex_13_DataDriven_ApachePOI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium47_DD_ApachePOI_Ex1 {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String username, String password, String ActRes, String ExpRes) {
        System.out.println("Running....");
        System.out.println(username + "-" + password);
        System.out.println("Logged in");
        System.out.println(ActRes + "-" + ExpRes);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                new Object[]{"admin1@admin.com", "pwd@123", "AR1", "ER1"},
                new Object[]{"admin2@admin.com", "pwd@1234","AR2", "ER2"},
                new Object[]{"admin3@admin.com", "pwd@1235","AR3", "ER3"}
        };

    }
}
