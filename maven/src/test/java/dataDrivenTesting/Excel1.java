package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel1 {
	public static void main(String[] args) throws Exception {
		File excelFilePath=new File("C:\\Users\\Omkar Swarna\\eclipse-workspace\\Myseleniumsessionclasses\\datafiles\\Book1.xlsx");
		System.out.println("line12");
		
		FileInputStream inputStream=new FileInputStream(excelFilePath);
		System.out.println("line15");
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		System.out.println("line17");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		System.out.println("line19");
		//Using for loop
		int rows = sheet.getLastRowNum();
		int col = sheet.getRow(1).getLastCellNum();
		System.out.println("Line21");
		for (int r=0;r<=rows;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<=col;c++) {
				XSSFCell cell=row.getCell(c);
				switch(cell.getCellType()){
				case STRING:System.out.print(cell.getStringCellValue());
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());
				
				}System.out.print("||");
				
			}System.out.println();
		}
	}

}
