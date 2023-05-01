package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import Base.BrowserOpen;

public class Utility extends BrowserOpen {
	 public static void screenshot(String name) throws IOException
	    {
	        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File dest=new File("C:\\Users\\swandhare\\eclipse-workspace\\CucumberNew\\Screenshot"+name+".jpg");
	        org.openqa.selenium.io.FileHandler.copy(source, dest);
	    }

//	    public static String readExcelFile(int rowNum,int cellNum) throws EncryptedDocumentException, IOException
//	    {
//	        FileInputStream file=new FileInputStream("C:\\Users\\swandhare\\eclipse-workspace\\Dxc_framework\\TestData\\EXCEL1.xlsx");
//	        Sheet excelSheet = WorkbookFactory.create(file).getSheet("sheet1");
//	        String value = excelSheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
//	        return value;
//	    }

	    public static void inputValue(WebElement ele, String text)
	    {
	        ele.sendKeys(text);
	    }

	    public static void click(WebElement ele)
	    {
	        ele.click();
	    }

	    public static String getText(WebElement ele)
	    {
	        return ele.getText();
	    }
	    public static void visible(WebElement ele)
	    {
	        ele.isDisplayed();
	    }

}
