package com.microfocus.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {

	@DataProvider
	public Object[][] commonDataProvider(Method mtd) throws IOException {
		
		//testMethodName is the sheetname
		String testMethodName=mtd.getName();
		
		Object[][] data = ExcelUtils.getSheetIntoTwoDimensionalArray
				("test-data/openemr_data.xlsx", testMethodName);
		
		return data;
	}

	@DataProvider
	public Object[][] validLoginData() {

		Object[][] data = new Object[2][3];

		data[0][0] = "admin";
		data[0][1] = "pass";
		data[0][2] = "OpenEMR";

		data[1][0] = "accountant";
		data[1][1] = "accountant";
		data[1][2] = "OpenEMR";

		return data;
	}

}
