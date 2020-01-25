package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetDataExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C:\\ShwetaSelenium\\Basiccorejava3\\src\\filehandling\\Testdata.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(file);
	
	    XSSFSheet sheet=wb.getSheet("Sheet1");
	    
	    XSSFRow row=sheet.getRow(13);
	    
	    if(row==null)
	    	row=sheet.createRow(13);
	    
	    XSSFCell cell=row.getCell(5);
	    
	    if(cell==null)
	     cell=row.createCell(5);
	    
	   cell.setCellValue("Shweta");
	   FileOutputStream file2=new FileOutputStream("C:\\ShwetaSelenium\\Basiccorejava3\\src\\filehandling\\Testdata.xlsx");
       wb.write(file2);
       
       
	}

}
