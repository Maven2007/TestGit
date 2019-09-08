package krish;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File srcfile=new File("C:\\Users\\kishu\\Desktop\\TestData.xlsx");

		FileInputStream fis=new FileInputStream(srcfile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		ws.getRow(0).createCell(2).setCellValue("Results");
		
		ws.getRow(1).createCell(2).setCellValue("Krish");
		
		FileOutputStream fos=new FileOutputStream(srcfile);
		
		wb.write(fos);
		wb.close();
	}

}
