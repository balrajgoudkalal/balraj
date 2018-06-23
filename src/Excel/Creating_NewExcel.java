package Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Creating_NewExcel {

	public static void main(String[] args) throws IOException {
		
		
		File f=new File("C:\\Users\\tm\\Desktop\\Java Test\\Testdata1.xlsx");
		
		
		XSSFWorkbook wrkbk=new XSSFWorkbook();
		
		XSSFSheet sheet=wrkbk.createSheet("Newsheet");
		
		XSSFRow row=sheet.createRow(0);
		
		XSSFCell cell=row.createCell(0);
		
		cell.setCellValue("Hello iam writing");
		
		FileOutputStream fos=new FileOutputStream(f);
		wrkbk.write(fos);
		fos.flush();
		wrkbk.close();
		
		fos.close();
		
		
		

	}

}
