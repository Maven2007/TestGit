package krish;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingMultipleDataExcelFiles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File srcfile=new File("C:\\Users\\kishu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcfile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 0; i < rcnt; i++) {
			
			String data=ws.getRow(i).getCell(0).getStringCellValue();
			String data1=ws.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(data+"  "+data1);
			
		}
		
		fis.close();
		wb.close();
	}

}
