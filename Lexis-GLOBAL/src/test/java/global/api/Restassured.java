package global.api;

import org.json.simple.JSONObject;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Restassured extends Endresult {
	protected static ExtentReports htmlreport;
	protected static ExtentSparkReporter sparkreport;
	protected static ExtentTest test;
	protected static RequestSpecification httprequest;
	protected static JSONObject requestParams;
	protected static Response httpresponse;
}
