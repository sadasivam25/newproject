package SampleMay29;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SaturdayClass2 {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\ExcelData\\Framework.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("sheet1");
		
		for (int i=0; i < sheet.getPhysicalNumberOfRows(); i ++) {
		Row row = sheet.getRow(i);
			for (int j = 0;  j < row.getPhysicalNumberOfCells();j ++) {
			Cell cell = row.getCell(j);
			
			int cellType = cell.getCellType();
			if(cellType == 1) {
			String StringCellValue = cell.getStringCellValue();	
			System.out.println(StringCellValue);
			} else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue =  cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
				String format = dateFormat.format(dateCellValue);
				System.out.println(format);	
			
			}else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				System.out.println(l);
				}
			}
		}
	}

}
