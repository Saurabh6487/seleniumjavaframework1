package utils;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider 
{
	@Test(dataProvider="test1data")
	public void test1(String username,String password)
	{
		System.out.println(username+"  |  "+password);
		
	}
	@DataProvider(name ="test1data")
	public Object[][] getData() throws IOException
	{
		String excelPath ="C:\\Users\\admin\\eclipse-workspace\\SeleniumWebdriverManager\\excel\\data.xlsx"; 
        Object data [][] = testData(excelPath, "Sheet1");
        return data;
		
	}
	public  Object[][] testData(String excelPath,String sheetName) throws IOException
	{
		Excelutils excel = new Excelutils(excelPath,sheetName);
		int rowCount=excel.getRowCount();
		int colCount=excel.getcolCount();
		Object data[][] = new Object[rowCount-1][colCount];
		for(int i=0; i<rowCount; i++)
		{
			for(int j=0; j<colCount; j++)
			{
				String celldata = excel.getcellDataString(i, j);
				System.out.print(celldata+"  |  ");
				data[i-1][j]=celldata;
				}
			System.out.println();
		}
		return data;
	}


}
