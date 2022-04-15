package global.api;

import java.io.FileInputStream;
import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GBdeclered extends Subcall {
	protected static String url;
	protected static String executefile;
	protected static String Subcategory;
	@SuppressWarnings("rawtypes")
	protected static ArrayList a;
	protected static FileInputStream file;
	protected static Properties pro;
	protected static XSSFWorkbook book;
	protected static Sheet sh;
	protected static String sheetname;
	protected static Format f;
	protected static String currenttime12;
	protected static String currenthour;
	protected static String currentminute;
	protected static String currentseconds;
	protected static String currentdate;
	protected static long millis;
	protected static Date date;
	protected static DateTimeFormatter dtf;
	protected static LocalDateTime now;
	protected static String Index;
	protected static String extendFinalOutput;
}
