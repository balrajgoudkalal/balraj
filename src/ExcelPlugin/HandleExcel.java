package ExcelPlugin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleExcel {
	
	public static String path;
	
	public static XSSFWorkbook wrkbk;
	
	public static XSSFSheet sheet;
	
	
	public static XSSFCell cell;
	
	
	public static int rowcount=0;
	
	public static int colcnt=0;
	
	
	
	public HandleExcel(String path)
	{
		this.path=path;
	}
	
	public static void openExcel() throws IOException
	{
		File f=new File(path);
		
		FileInputStream fis=new FileInputStream(f);
		
	    wrkbk=new XSSFWorkbook(fis);
	
	}
	
	
	public static int getRowCount(String sheetname)
	{
		 sheet=wrkbk.getSheet(sheetname);
		 rowcount=sheet.getLastRowNum();
		 
		 return rowcount;
	}
	
	public static int  getColumnCount(String sheetname)
	{
		 sheet=wrkbk.getSheet(sheetname);
		 colcnt=sheet.getRow(getRowCount(sheetname)).getLastCellNum();
		 
		 return colcnt;
	}
	
	public static int getColumn_Header_Position(String sheetname,String columnname) throws IOException
		
	{
		
		
		int columnnumber=0;
		
		for(int i=0;i<getColumnCount(sheetname)-1;i++)
		{
			
			String columndata=sheet.getRow(0).getCell(i).getStringCellValue();
			
			if(columndata.toLowerCase().equals(columnname.toLowerCase()))
			{
				columnnumber=i;
				break;
			}
					
		}
		
		return columnnumber;
		
	}
	
	public static int getRowNumber_Testcase_Position(String sheetname,String testcase)
	{
		int rownumber=0;
		for(int i=0;i<=getRowCount(sheetname);i++)
		{
			String rowdata=sheet.getRow(i).getCell(0).getStringCellValue();
			
			if(rowdata.toLowerCase().equals(testcase.toLowerCase()))
			{
				rownumber=i;
				break;
			}
			
		}
		
		return rownumber;
	
		
	}
	
	public static void getData(String sheetname,String testcase,String columnname) throws IOException
	{
		openExcel();
		String data="No data found";
		
		int row=getRowNumber_Testcase_Position(sheetname,testcase);
		
		if(!(row==0))
		{
			int colnmber=getColumn_Header_Position(sheetname,columnname);
			
			
			if(!(colnmber==0))
			{
				CellType celltype=sheet.getRow(row).getCell(colnmber).getCellTypeEnum();
				
				switch (celltype) {
				
				case NUMERIC:
					
					int numericdata=(int) sheet.getRow(row).getCell(colnmber).getNumericCellValue();					
					System.out.println(numericdata);
					
					
					
					break;
				case STRING:
					
					String rowdata=sheet.getRow(row).getCell(colnmber).getStringCellValue();
					
					System.out.println(rowdata);
					
					break;

				default:
					break;
				}
				
				
			}
			
		}
		
	}
}
