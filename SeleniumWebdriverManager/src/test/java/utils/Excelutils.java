package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils 
{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public Excelutils(String excelPath, String sheetName) throws IOException
	{
		workbook = new XSSFWorkbook(excelPath);
		sheet = workbook.getSheet(sheetName);

	}
	public static void main(String[] args) throws IOException 
	{

		//getRowCount();
		//getcellDataString(0,0);
		//getcellDataNumber(1,1);
	}

	public static int getRowCount() throws IOException
	{
	int rowCount = 0;
	{

		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of Rows: "+rowCount);
	}
	return rowCount;
}
	public static int getcolCount()
	{
	int colCount = 0;
	{
         colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No of Colums: "+colCount);
	}
	return colCount;
}
	public static String getcellDataString(int rowNum,int colNum) throws IOException
	{
		
		String celldata = null;
		
	{
		celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
	
		System.out.println(celldata);
	}
	
	return celldata;
	}
	public static void getcellDataNumber(int rowNum,int colNum) throws IOException
	{

		double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(celldata);
	}
}
