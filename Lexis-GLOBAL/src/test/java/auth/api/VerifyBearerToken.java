package auth.api;

import org.testng.Assert;

import com.aventstack.extentreports.Status;
import global.api.Environment;

public class VerifyBearerToken extends Environment {

	public static void ensuretoken() {
		try {
			token = httpresponse.getBody().asString();
			String partialtoken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
			if (token.contains(partialtoken)) {
				log.debug("âï¸PASS ! ð...BEARER TOKEN Generated Succeed ");
				test.log(Status.PASS, "âï¸ TOKEN Generated Succeed !");
			} else {
				log.debug("Actual Result â¨â¨ " + token);
				log.debug("â Fail ! ð...Unable to generate TOKEN with POST method.");
				test.log(Status.FAIL, "â Fail ! ð...Unable to Generate TOKEN");
				 Assert.fail();
			}
		} catch (Exception e) {
			log.debug("â Failling ! ð...Exception occur! on Verify Bearer Token Genration" + e);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public static void ensurelogintokenValid() {
		try {
			token = httpresponse.getBody().asString();
			if (token.contains("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9")) {
				log.debug("âï¸PASS ! ð...BEARER TOKEN Generated Succeed.");
				test.log(Status.PASS, "BEARER TOKEN Generated Succeed.");
			} else {
				log.debug("âFail ! ð...BEARER TOKEN is Not Generated");
				test.log(Status.FAIL, "BEARER TOKEN is Not Generated");
				// log.debug("Actual Result â¨â¨ " + token);
				// Assert.fail();
			}
		} catch (Exception e) {
			log.debug("Failing (!) ð...Exception occur! on All User Login Validation " + e);
			Assert.fail();
		}
	}

	public static void ensurelogintokenInvalid() {
		try {
			token = httpresponse.getBody().asString();
			if (token.contains("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9")) {
				log.debug("âï¸PASS ! ð...BEARER TOKEN Generated Succeed.");
				test.log(Status.FAIL, "BEARER TOKEN Generated Succeed.");
			} else {
				log.debug("âï¸PASS ! ð...BEARER TOKEN is Not Generated.");
				test.log(Status.PASS, "BEARER TOKEN is Not Generated.");
				// log.debug("Actual Result â¨â¨ " + token);
				// Assert.fail();
			}
		} catch (Exception e) {
			log.debug("Failing (!) ð...Exception occur! on All User Login Validation " + e);
			Assert.fail();
		}
	}

}
