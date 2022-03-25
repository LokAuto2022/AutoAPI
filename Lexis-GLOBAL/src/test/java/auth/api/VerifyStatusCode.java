package auth.api;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

//import com.aventstack.extentreports.Status;

import global.api.Environment;

public class VerifyStatusCode extends Environment {

	public static void ensure() {
		try {
			statuscode = httpresponse.getStatusCode();
			log.debug("Actual Status_Code ➨➨ " + statuscode);

			if (statuscode == 200) {
				log.debug("PASS ! 🙂...Expected Status_Code [200] is Equal to Actual Status_Code " + "[" + statuscode
						+ "]");
				test.log(Status.PASS, "Status_Code "+"["+ statuscode+"]");
				Assert.assertEquals(statuscode, 200	);
			} else {
				log.debug("FAIL ! ☹...Expected Status_Code [200] is Not Equal to Actual Status_Code " + "[" + statuscode
						+ "]");
				test.log(Status.FAIL, "Actual Status_Code ➨➨ "+"["+ statuscode+"]");
				//Assert.assertEquals(statuscode, 200);
				//Assert.fail();
			}

		} catch (Exception e) {
			log.debug("Failing ! ☹...Exception occur! on StatusCode Genration Area with 200 " + e);
			test.log(Status.FAIL, "Expected Status_Code [200] is Not Equal to Actual Status_Code "+"["+ statuscode+"]"+" Bad RESPONSE");
			Assert.fail();
		}
	}
	
	public static void prePOSTensure() {
		try {
			statuscode = httpresponse.getStatusCode();
			log.debug("Actual Status_Code ➨➨ " + statuscode);

			if (statuscode == 200) {
				log.debug("PASS 🙂...Expected Status_Code [200] is Equal to Actual Status_Code " + "[" + statuscode
						+ "]");
				//test.log(Status.PASS, "Actual Status_Code "+"["+ statuscode+"]");
				Assert.assertEquals(statuscode, 200	);
			} else {
				log.debug("FAIL ! ☹...Expected Status_Code [200] is Not Equal to Actual Status_Code " + "[" + statuscode
						+ "]");
				test.log(Status.FAIL, "Actual Status_Code ➨➨ "+"["+ statuscode+"]");
				//Assert.assertEquals(statuscode, 200);
				//Assert.fail();
			}

		} catch (Exception e) {
			log.debug("Failing ☹...Exception occur! on StatusCode Genration Area with 200 " + e);
			test.log(Status.FAIL, "Expected Status_Code [200] is Not Equal to Actual Status_Code "+"["+ statuscode+"]"+" Bad RESPONSE");
			Assert.fail();
		}
	}

	public static void ensureloginEX() {
		try {
			statuscode = httpresponse.getStatusCode();

			log.debug("Actual Status_Code ➨➨ " + statuscode);

			if (statuscode == 200) {
				log.debug("PASS ! 🙂...Expected Status_Code [200] is Equal to Actual Status_Code " + "[" + statuscode
						+ "]");
				test.log(Status.PASS, "Expected Status_Code [200] is Equal to  Actual Status_Code "+"["+ statuscode+"]"+" Status OK");

			}

			if (statuscode == 400) {

				log.debug("PASS ! 🙂...Expected Status_Code [400] is Equal to Actual Status_Code " + "[" + statuscode
						+ "]");
				test.log(Status.PASS, "Expected Status_Code [400] is Equal to Actual Status_Code "+"["+ statuscode+"]"+" Bad Request");

			}

		} catch (Exception e) {
			log.debug("Failing ! ☹...Exception occur! on StatusCode Area -NO- 200 and 400 in Login Validation " + e);
			Assert.fail();
		}

	}
}
