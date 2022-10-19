package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDate {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("\\Users\\Dell I3\\Desktop\\Testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("Invalid login").getLastRowNum();
		for (int i=1; i<=rowcount; i++) {
			String un = wb.getSheet("Invalid login").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("Invalid login").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"  "+pw);
		}
	}

}
