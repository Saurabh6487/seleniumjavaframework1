package utils;

import java.io.IOException;

public class Excelutilsdemo {

	public static void main(String[] args) throws IOException 
	{
		Excelutils excel = new Excelutils("C:\\Users\\admin\\eclipse-workspace\\SeleniumWebdriverManager\\excel\\data.xlsx","Sheet1");

		excel.getRowCount();
		excel.getcellDataString(0, 0);
		excel.getcellDataNumber(1, 1);
		
	}

}
