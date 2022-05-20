package selenium_Implementation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Accessing_test_data_from_excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\ANUMDUTT\\OneDrive - Capgemini\\Desktop\\data.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook(file); //XSSF: XML Spreadsheet Format
		XSSFSheet s= wb.getSheet("sheet1");
		
		//Reading in excel
		
		int row =s.getLastRowNum();
		System.out.println("Number of rows : " +row);    //printing number of rows in the sheet
		
		int column =s.getRow(0).getLastCellNum();
		System.out.println("Number of columns : "+column);  //printing number of columns in the sheet
		for(int i=0;i<=row;i++) { //read to use rows
		
			XSSFRow currentRow=s.getRow(i);
		
			for( int j=0;j<column;j++) {   //Printing elements of the sheet
				String value=currentRow.getCell(j).toString();
				System.out.print(value+" ");
				}
			System.out.println();
			}
		
		
		//Writing in excel
		
		Sheet sheet1 = wb.getSheetAt(0);
		int lastRow = sheet1.getLastRowNum();
		
		for(int i=0; i<=lastRow; i++){   //Writing on the sheet
			Row row2 = sheet1.getRow(i);
			Cell cell = row2.createCell(3);
			cell.setCellValue("WriteintoExcel");
		}

		FileOutputStream fos = new FileOutputStream("C:\\Users\\ANUMDUTT\\OneDrive - Capgemini\\Desktop\\data.xlsx");
		wb.write(fos);
		fos.close();
		}
	}


