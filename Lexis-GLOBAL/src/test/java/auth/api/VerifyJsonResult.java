package auth.api;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

import global.api.Environment;

public class VerifyJsonResult extends Environment {

	public static void ensurebodyToken() {
		try {
			ActualBodyResult = httpresponse.getBody().asString();
			log.debug("Actual JsonBody Result is ➨➨ " + ActualBodyResult);

			if (ActualBodyResult.equals("Region Prefix Already Exits")) {
				log.debug("❌ Fail ! 🙁...Region Prefix Already Exits while Create or Update " + executefile);
				test.log(Status.FAIL, "Region Prefix Already Exits while Create or Update " + executefile);
				
			    // Assert.fail();
			}
		} catch (Exception e) {
			log.debug("Failing ! ☹...Exception occur! on Pretty Body Structure Area" + e);
			Assert.fail();
		}
	}

	public static void ensurebodyUNtoken() {
		try {
			ActualBodyResult = httpresponse.getBody().asString();
			//log.debug("Actual JsonBody Result is ➞➞ " + ActualBodyResult);
		} catch (Exception e) {
			log.debug("Failing ! ☹...Exception occur! on Pretty Body Structure Area" + e);
			Assert.fail();
		}
	}
}
