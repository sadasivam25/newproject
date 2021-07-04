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

public class TrailTwo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\ExcelData\\Framework.xlsx");
		
		FileInputStream fileinputstream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(fileinputstream);
		
		Sheet createsheet = workbook.createSheet("Sadasivam");
		
		Row createrow = createsheet.createRow(0);
		
		Cell createcell = createrow.createCell(1);
		
		createcell.setCellValue("gowri");
		
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);
				
		
	}

}
