package SampleMay28;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TrailTwo {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\ExcelData\\Framework.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("sheet1");
		
		for (int i=0; i < sheet.getPhysicalNumberOfRows(); i ++) {
		Row row = sheet.getRow(i);
		
			for (int j = 0;  j < row.getPhysicalNumberOfCells();j ++) {
			Cell cell = row.getCell(j);
		
		String StringCellValue = cell.getStringCellValue();
		System.out.println(StringCellValue);

			}
			
		}
		
	}
	

}
