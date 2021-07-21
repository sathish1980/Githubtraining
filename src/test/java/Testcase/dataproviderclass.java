package Testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Util.excelreadandwrite;



public class dataproviderclass 
{
	String filepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\8oclockmavenproject\\inputFile\\";
	String fileName="inputdata.xls";
	String sheetName ="input";

	excelreadandwrite ew= new excelreadandwrite();

	@DataProvider
	public String[][] excel() throws IOException
	{
		return ew.excelreaddata(filepath,fileName,sheetName );
	}

}
