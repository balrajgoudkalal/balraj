package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {


		File f=new File("C:\\Users\\tm\\Desktop\\Java Test\\Testdata.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wrkbk=new XSSFWorkbook(fis);
		
		XSSFSheet sht=wrkbk.getSheet("TestData");
		
		
		
		
				
		//Getting Row count
		
		int rcnt=sht.getLastRowNum();
		System.out.println("The total Row count is :"+rcnt);
		
		for(int r=1;r<=rcnt;r++)
		{
			
			int ccnt=sht.getRow(r).getLastCellNum();
			
			
			
			for(int c=0;c<=ccnt-1;c++)
			{
				
				
				CellType celltype=sht.getRow(r).getCell(c).getCellTypeEnum();
				
				switch (celltype) {
				
				case NUMERIC:
					
					int numericdata=(int) sht.getRow(r).getCell(c).getNumericCellValue();					
					System.out.println(numericdata);
					
					break;
				case STRING:
					
					String rowdata=sht.getRow(r).getCell(c).getStringCellValue();
					
					System.out.println(rowdata);
					
					break;

				default:
					break;
				}
				
				
				
				
			}
			
			
			
			
			
		}
		
		
	}

}
