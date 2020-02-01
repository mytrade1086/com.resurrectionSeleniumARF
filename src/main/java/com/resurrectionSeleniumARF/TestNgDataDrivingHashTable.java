package com.resurrectionSeleniumARF;

import java.util.Hashtable;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataDrivingHashTable {
	// We created method with @DataProvider(name="provider")
	// it returns 2D array of objects
	// Created a @Test method @Test(dataProvider="provider") which will use created DataProvider

	ExcelReader xls = null;
	Workbook wb = null;
	Sheet sheet = null;
	Row row = null;
	Cell cell = null;
	// Normal Usage
	@Test(dataProvider = "provider", enabled = false)
	public void mymethod(int un, int pwd) {
		System.out.println("un is" + un + " password is " + pwd);
	}
	
	@DataProvider(name = "provider")
	public Object[][] givedata() {
		Object[][] data = new Object[2][2];
		data[0][0] = 00;
		data[0][1] = 01;
		data[1][0] = 02;
		data[1][1] = 03;
		return data;
	}

	@Test(dataProvider = "xlsprovider")
	public void ExcelHashTable(Hashtable<String, String> data) {
		System.out.println(data.get("username") + " " + data.get("password") + " " + data.get("env"));
	}

	@DataProvider(name = "xlsprovider")
	public Object[][] readExcelData() {
		xls = new ExcelReader("H:\\ExcelReading\\DataPoi.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int colCount = xls.getColumnCount("Sheet1");
		// System.out.println("Total Rows:"+rowCount+" "+"Total Column Count"+colCount);
		// //3 3
		// System.out.println("Getting data"+xls.getCellData("Sheet1", 2, 1));

		Object[][] data = new Object[rowCount - 1][1];
		// use Row num-1 in declaration. Column will always 1 as we just want one
		// argumnt in @Test method

		for (int row = 2; row <= rowCount; row++) {
			Hashtable<String, String> table = new Hashtable<String, String>();
			for (int col = 0; col < colCount; col++) {
				table.put(xls.getCellData("Sheet1", col, 1), xls.getCellData("Sheet1", col, row));
			}
			System.out.println("printing table after iteration" + table);
			data[row - 2][0] = table;
		}
		return data;
	}
}
