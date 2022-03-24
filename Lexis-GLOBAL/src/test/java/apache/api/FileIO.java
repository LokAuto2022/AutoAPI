package apache.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import depend_1.api.AllBodyStructure;
import depend_1.api.Start;
import global.api.Environment;
import main.api.ExecuteAPILead;

import request.api.MANRequestmodule;

public class FileIO extends Environment {

	@SuppressWarnings({ "rawtypes", "unchecked", "incomplete-switch" })
	public static void coreutility(String sheetname) throws IOException, InterruptedException {
		try {
			
			a = new ArrayList();
			api = new ExecuteAPILead();
			referencereqresponse = new MANRequestmodule();
			withrespectto = new  AllBodyStructure();
			Start.accessedfile();
		    file = new FileInputStream(projectpath + "\\Coredata\\"+executefile+".xlsx");
			book = new XSSFWorkbook(file);
			sh = book.getSheet(sheetname);
			Iterator itr = sh.iterator();
			while (itr.hasNext()) {
				Row rowitr = (Row) itr.next();
				Iterator cellitr = rowitr.cellIterator();
				while (cellitr.hasNext()) {
					Cell cell = (Cell) cellitr.next();
					switch (cell.getCellType()) {
					case STRING:
						a.add(cell.getStringCellValue());
						// System.out.println(cell.getStringCellValue());
						break;
					case NUMERIC:
						a.add(cell.getNumericCellValue());
						// System.out.println(cell.getNumericCellValue());
						break;
					case BOOLEAN:
						a.add(cell.getBooleanCellValue());
						// System.out.println(cell.getBooleanCellValue());
						break;
					}
				}
			}

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! while Fetching Data from Excel " + e);
			//Assert.fail();
		}

	}
}
