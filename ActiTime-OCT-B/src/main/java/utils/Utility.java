package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	public static  String getDataFromExcel(String vinod,int row,int col) throws EncryptedDocumentException, IOException {
		String path ="C:\\Users\\Hp\\OneDrive\\Desktop\\vinod.xlsx";

		FileInputStream file = new FileInputStream(path);
		
	    String value =WorkbookFactory.create(file).getSheet("vinod").getRow(1).getCell(1).getStringCellValue();

	     System.out.println(value);

		return value ;

		
	}
	
	public static void getScrrenShot(WebDriver driver , int testID) throws IOException {
		
		   
		   File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File ("E:\\vinod\\testID.jpg");
		 
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		   LocalDateTime now = LocalDateTime.now();
		   System.out.println(dtf.format(now)); 

			
			 FileHandler.copy(src, dest);
			
		
	}


	

}

