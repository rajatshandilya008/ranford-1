package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import jxl.write.Label;

import baseTest.Base;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ExcelDataDriven extends Base{
	public static String folderpath = Base.getconfig("excelFolderPath");
	static Workbook wb;
	static Sheet sh;
	static WritableWorkbook wwb;
	static WritableSheet wsh;
	public static void excelconnection(String filename, String sheetname) {
		try {
			File f=new File(folderpath+filename);
			wb=Workbook.getWorkbook(f);
			sh=wb.getSheet(sheetname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int rcount() {
		int i = sh.getRows();
		return i;
	}
	public static int ccount() {
		int i = sh.getColumns();
		return i;
	}
	public static String readdata(int col,int row) {
		String x = sh.getCell(col, row).getContents();
		return x;
	}
	public static void outputexcelconnection(String ifilename,String ofilename,String Sheetname) {
		try {
			FileInputStream fis=new FileInputStream(folderpath+ifilename);
			wb=	Workbook.getWorkbook(fis);
			wb.getSheet(Sheetname);
			FileOutputStream fos=new FileOutputStream(folderpath+ofilename);
			wwb=Workbook.createWorkbook(fos, wb);
			wsh = wwb.getSheet(Sheetname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void writedada(int col,int row,String data) {
		try {
			Label l=new Label(col, row, data);
			wsh.addCell(l);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void saveworkbook() {
		try {
			wwb.write();
			wwb.close();
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



