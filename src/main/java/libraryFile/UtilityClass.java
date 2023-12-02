package libraryFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//Author name:Sanjay
	//this method is use to get Test data from excel sheet
	//need to pass 2 inputs 1:rowIndex 2:colIndex
	
	//public static String getTD(int rowIndex,int colIndex) 
	{
	//	FileInputStream file=new FileInputStream("D:\\Daily Example\\24th June\\24June.xlx");
	//	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
	//	String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
	//	return value;
	}
	public static void captureSS(WebDriver driver)throws IOException
	{
		//File src=(TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File ("D:\\workspace\\24th June selenium\\FailedTCesss\\TestcaseID.jpg");
		//FileHandler.copy(src, dest);
	}
	

}
