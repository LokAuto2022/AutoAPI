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
				log.debug("PASS ! 🙂...BEARER TOKEN Generated Succeed ");
				test.log(Status.PASS, "TOKEN Generated Succeed with POST method");
			} else {
				log.debug("FAIL ! ☹...Unable to generate TOKEN with POST method.");
				log.debug("Actual Result ➨➨ " + token);
				test.log(Status.FAIL, "Unable to generate TOKEN with POST method");
				Assert.fail();
		  }
		} catch (Exception e) {
			log.debug("Failing ! ☹...Exception occur! on Verify Bearer Token Genration" + e);
			e.printStackTrace();
			Assert.fail();
		}
	}

	public static void ensurelogintokenEX() {
		try {
			token = httpresponse.getBody().asString();
			if (token.contains("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9")) {
				log.debug("PASS ! 🙂...BEARER TOKEN Generated Succeed");
			}
			if (token.equals("Invalid Login")) {
			    log.debug("FAIL ! ☹...Unable to generate TOKEN.");
				log.debug("Actual Result ➨➨ " + token);
				// Assert.fail();
			}
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on All User Login Validation " + e);
			Assert.fail();
		}
	}

}
