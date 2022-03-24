package auth.api;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

import global.api.Environment;

public class VerifyJsonResult extends Environment {

	public static void ensurebody(String url,String str3) {
		try {
			ActualBodyResult = httpresponse.getBody().asString();
			log.debug("Actual JsonBody Result is --> " + ActualBodyResult);
			if (ActualBodyResult.equals("Region Prefix Already Exits")) {
				test.log(Status.FAIL, "Region Prefix Already Exits while Create or Update "+executefile);
				log.debug("FAIL(!)...Region Prefix Already Exits while Create or Update "+executefile);
				Assert.fail();
			}
		} catch (Exception e) {
			log.debug("FAILING(!)...Exception occur! on Pretty Body Structure Area" + e);
			Assert.fail();
		}

	}

}
