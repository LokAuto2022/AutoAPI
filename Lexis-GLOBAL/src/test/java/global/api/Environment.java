package global.api;

import java.io.FileInputStream;
import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import depend_1.api.AllBodyStructure;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import main.api.ExecuteAPILead;

import request.api.MANRequestmodule;

public class Environment {
	
	protected static RequestSpecification httprequest;
	protected static JSONObject requestParams;
	protected static Response httpresponse;
	protected static String payload;
	protected static FileInputStream file;
	protected static Properties pro;
	@SuppressWarnings("rawtypes")
	protected static ArrayList a;
	protected static XSSFWorkbook book;
	protected static Sheet sh;
	protected static String sheetname;
	protected static String url;
	protected static ExecuteAPILead api;
	protected static MANRequestmodule referencereqresponse ;
	protected static AllBodyStructure withrespectto;
	protected static String eusername;
	protected static String epassword;
	protected static String statusline;
	protected static int statuscode;
	protected static String ActualBodyResult;
	protected static String token;
	protected static String uniqueidr1;
	protected static String uniqueidj1;
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
	protected static Logger log=Logger.getLogger(ExecuteAPILead.class.getName());
	protected static String projectpath=System.getProperty("user.dir");
	protected static String finalreport="C:\\Users\\adapp\\OneDrive\\Desktop\\GetMe-API";
	protected static ExtentReports htmlreport;
	protected static ExtentSparkReporter sparkreport;
	protected static ExtentTest test;
	protected static String executefile;
	protected static String Subcategory;
	protected static String Index;
    protected static String UsersID;
  
}
