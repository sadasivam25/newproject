package SampleMay31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TrailOne {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\ExcelData\\Framework.xlsx");
		
		FileInputStream fileinputstream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(fileinputstream);
		
		Sheet sheet = workbook.getSheet("sheet1");
		
		Row row = sheet.getRow(2);
		
		Cell cell =row.getCell(0);
		
		String ss = cell.getStringCellValue();
		System.out.println(ss);
		
		if(ss.equals("sada")) {
			cell.setCellValue("Santhosh");
		}
		
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);
		
		
		
	}

}
