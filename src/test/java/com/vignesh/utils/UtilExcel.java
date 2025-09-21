package com.vignesh.utils;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class UtilExcel {

    //C:\Users\Vihaana\IdeaProjects\LearningSeleniumATB13x = System.getProperty("user.dir")

    public static String SheetPath = System.getProperty("user.dir") + "/src/test/resources/TestData.xlsx";
    static Workbook workbook;
    static Sheet sheet;

    public static Object[][] getTestDataFromExcel(String sheetName)
    {

        //Apache POI
        //Read the file TestData.xlsx

        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(SheetPath);
            workbook = WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
        //Workbook create
        //Sheet
        //Row and cells
        //2D Object - getData()
        // no hardcode -> new Object[21][2];
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {

                // First row email, password -> column name - skip - header
                data[i][j] = sheet.getRow(i + 1).getCell(j).toString();


            }
        }


        return  data;
    }
}
