package seleniumChrome;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	 XSSFWorkbook work_book;
	 XSSFSheet sheet;
	public ReadExcelFile(String excelfilepath) {
		try {
			File s =new File(excelfilepath);
			FileInputStream stream = new FileInputStream(s);
			work_book = new XSSFWorkbook(stream);
		}	
		catch(Exception e){
			 System.out.println(e.getMessage());
		}
	}
	public String getData(int sheetnumber,int row,int col ) {
		sheet=work_book.getSheetAt(sheetnumber);
		String data= sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	public int getRowCount(int i){
		int row = work_book.getSheetAt(i).getLastRowNum();
		row = row + 1;
		return row;
		}

}
