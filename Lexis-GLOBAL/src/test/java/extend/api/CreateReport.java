package extend.api;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import global.api.Environment;

public class CreateReport extends Environment {
	@Test(priority = 1)
	public static void extend() {
		try {
            htmlreport = new ExtentReports();
			if (executefile.equals("TOKEN_VALIDATION")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("REGION")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("USER_REGION")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("JURISDICTION")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("USER_JURISDICTION")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("ENTITY_TYPE")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("ENTITY_SUBTYPE")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("ENTITIES")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			sparkreport.config().setTheme(Theme.DARK);
			sparkreport.config().setDocumentTitle("API Automation Report");
			htmlreport.attachReporter(sparkreport);
			// test=htmlreport.createTest("MyFirstTest");
			// test.log(Status.PASS, "Sample test123");
			// htmlreport.flush();
		} catch (Exception e) {
			log.debug("Fail, unable to Create and Store Extent Report in Defined Location" + e);
			Assert.fail();
		}
	}
    public static String timestamp() {
		return new SimpleDateFormat("HH-mm-ss  dd-MM-yyyy").format(new Date());
	}

}
