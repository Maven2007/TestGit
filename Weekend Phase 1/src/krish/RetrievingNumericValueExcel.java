package krish;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RetrievingNumericValueExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

           File srcfile=new File("C:\\Users\\kishu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcfile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int rcnt=ws.getLastRowNum();
		for (int i = 1; i < rcnt; i++) {
			if (ws.getRow(i).getCell(0).getCellType()==CellType.NUMERIC) {
				int data1=(int) ws.getRow(i).getCell(0).getNumericCellValue();
				
				String data= String.valueOf(data1);
				
				System.out.println(data);
			}
		}

		fis.close();
		wb.close();
	}

}
