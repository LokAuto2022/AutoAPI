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
			if (executefile.equals("Login_Validation")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("Region")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("UserRegion")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("Jurisdiction")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("UserJurisdiction")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			if (executefile.equals("EntityType")) {
				sparkreport = new ExtentSparkReporter(finalreport + "\\" + executefile + " " + timestamp() + ".html");
			}
			sparkreport.config().setTheme(Theme.STANDARD);
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
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
