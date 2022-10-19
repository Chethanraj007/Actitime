package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandleExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("\\Users\\Dell I3\\Desktop\\Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Invalid login");
		Row r=s.getRow(1);
		Cell c=r.getCell(2);
		String data = c.getStringCellValue();
		System.out.println(data);
	}

}
