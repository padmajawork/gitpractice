package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:/Users/myth/Desktop/Testdata.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet2");
		int rowIndex=sh.getLastRowNum();
	//	System.out.println("size is" +rowIndex);
	//	for(int i=0;i<rowIndex;i++)
		//{
		//	Row r=sh.getRow(i);
			//String s=r.getCell(0).getStringCellValue();
			//System.out.println(s);
	//	}
		
	Row r=sh.getRow(0);
	
	//System.out.println(s);
		

	}
	}
	
