package auth.api;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

//import com.aventstack.extentreports.Status;

import global.api.Environment;

public class VerifyStatusCode extends Environment {

	public static void ensureCode200() {
		try {
			statuscode = httpresponse.getStatusCode();
		    if (statuscode == 200) {
				log.debug("Actual StatusCode ➨➨ " + statuscode);
				log.debug("✔️PASS ! 🙂...Expected StatusCode [200] == Actual StatusCode " + "[" + statuscode+ "]");
				test.log(Status.PASS, "✔️PASS ! 🙂...Expected StatusCode [200] == Actual StatusCode "+"[ "+statuscode+"]");
				
				Assert.assertEquals(statuscode, 200);
			} else {
				log.debug("Actual StatusCode ➨➨ " + statuscode);
				log.debug("❌ Fail ! 🙁...Expected StatusCode [200] ≠≠ Actual StatusCode " + "["+ statuscode + "]");
				test.log(Status.FAIL, "❌ Fail ! 🙁...Expected StatusCode [200] ≠≠ Actual StatusCode "+"[ "+statuscode+"]");
			}
		} catch (Exception e) {
			log.debug("❌ Failling ! 🙁...Exception occur! on StatusCode in Global ", e);
			Assert.fail();
		}
	}
	public static void ensureCode403() {
		try {
			statuscode = httpresponse.getStatusCode();
		    if (statuscode == 403) {
				log.debug("Actual Status_Code ➨➨ " + statuscode);
				log.debug("✔️PASS ! 🙂...Expected StatusCode [403] == Actual StatusCode " + "[" + statuscode+ "]");
				test.log(Status.PASS, "✔️PASS ! 🙂...Expected StatusCode [403] == Actual StatusCode "+"[ "+statuscode+"]");
				Assert.assertEquals(statuscode, 403);
				extendFinalOutput="Fail";
			} else {
				log.debug("Actual Status_Code ➨➨ " + statuscode);
				log.debug("❌ Fail ! 🙁...Expected StatusCode [403] ≠≠ Actual StatusCode " + "["+ statuscode + "]");
				test.log(Status.FAIL, "❌ Fail ! 🙁...Expected StatusCode [403] ≠≠ Actual StatusCode "+"[ "+statuscode+"]");
				extendFinalOutput="Fail";
				// Assert.assertEquals(statuscode, 200);
				// Assert.fail();
			}
		} catch (Exception e) {
			log.debug("❌ Failling ! 🙁...Exception occur! on StatusCode in Regional ", e);
			test.log(Status.FAIL, "Expected Status_Code [200] is Not Equal to Actual Status_Code " + "[" + statuscode
					+ "]" + " Bad RESPONSE");
			Assert.fail();
		}
		
	}
	
	public static void ensureCode400() {
		try {
			statuscode = httpresponse.getStatusCode();
		    if (statuscode == 400) {
				log.debug("Actual Status_Code ➨➨ " + statuscode);
				log.debug("✔️PASS ! 🙂...Expected StatusCode [400] == Actual StatusCode " + "[" + statuscode+ "]");
				test.log(Status.PASS, "✔️PASS ! 🙂...Expected StatusCode [400] == Actual StatusCode "+"[ "+statuscode+"]");
				Assert.assertEquals(statuscode, 400);
			} else {
				log.debug("Actual Status_Code ➨➨ " + statuscode);
				log.debug("❌ Fail ! 🙁...Expected StatusCode [400] ≠≠ Actual StatusCode " + "["+ statuscode + "]");
				test.log(Status.FAIL, "❌ Fail ! 🙁...Expected StatusCode [400] ≠≠ Actual StatusCode "+"[ "+statuscode+"]");
				// Assert.assertEquals(statuscode, 200);
				// Assert.fail();
			}
		} catch (Exception e) {
			log.debug("❌ Failling ! 🙁...Exception occur! on StatusCode in Regional ", e);
			Assert.fail();
		}
		
	}
	public static void prePOSTensure() {
		try {
			statuscode = httpresponse.getStatusCode();
			if (statuscode == 200) {
				log.debug("✔️PASS ! 🙂...Expected StatusCode [200] == Actual Status_Code " + "[" + statuscode
						+ "]");
				// test.log(Status.PASS, "Actual Status_Code "+"["+ statuscode+"]");
				Assert.assertEquals(statuscode, 200);
			} else {
				log.debug("Actual Status_Code ➨➨ " + statuscode);
				log.debug("❌ Fail ! 🙁...Expected StatusCode [200] ≠≠ Actual StatusCode " + "["
						+ statuscode + "]");
				test.log(Status.FAIL, "Actual Status_Code ➨➨ " + "[" + statuscode + "]");
				// Assert.assertEquals(statuscode, 200);
				// Assert.fail();
			}

		} catch (Exception e) {
			log.debug("❌ Failling ! 🙁...Exception occur! on StatusCode Genration Area with 200 " + e);
			test.log(Status.FAIL, "Expected Status_Code [200] is Not Equal to Actual Status_Code " + "[" + statuscode
					+ "]" + " Bad RESPONSE");
			Assert.fail();
		}
	}

	public static void ensureStatusCodeValid() {
		try {
			statuscode = httpresponse.getStatusCode();
			log.debug("Actual Status_Code ➨➨ " + statuscode);
			if (statuscode == 200) {
				log.debug(
						"✔️PASS ! 🙂...Expected StatusCode ➨ [200]  == Actual StatusCode ➨ " + "[" + statuscode + "]");
				test.log(Status.PASS,
						"✔️PASS ! 🙂...Expected StatusCode ➨ [200]  == Actual StatusCode ➨ " + "[" + statuscode + "]");
			} else {
				log.debug(
						"❌ Fail ! 🙁...Expected StatusCode ➨ [200]  ≠≠ Actual StatusCode ➨ " + "[" + statuscode + "]");
				test.log(Status.FAIL,
						"❌Fail ! 🙁...Expected StatusCode ➨ [200]  ≠≠ Actual StatusCode ➨ " + "[" + statuscode + "]");
			}
		} catch (Exception e) {
			log.debug("❌Failing ! 🙁...Exception occur! on Verify StatusCode", e);
			Assert.fail();
		}
	}

	public static void ensureStatusCodeInvalid() {
		try {
			statuscode = httpresponse.getStatusCode();
			log.debug("Actual Status_Code ➨➨ " + statuscode);
			if (statuscode == 400) {
				log.debug(
						"✔️PASS ! 🙂...Expected StatusCode ➨ [400]  == Actual StatusCode ➨ " + "[" + statuscode + "]");
				test.log(Status.PASS,
						"✔️PASS ! 🙂...Expected StatusCode ➨ [400]  == Actual StatusCode ➨ " + "[" + statuscode + "]");
			} else {
				log.debug(
						"❌ Fail ! 🙁...Expected StatusCode ➨ [400]  ≠≠ Actual StatusCode ➨ " + "[" + statuscode + "]");
				test.log(Status.FAIL,
						"❌Fail ! 🙁...Expected StatusCode ➨ [400]  ≠≠ Actual StatusCode ➨ " + "[" + statuscode + "]");
			}
		} catch (Exception e) {
			log.debug("❌Failing ! 🙁...Exception occur! on Verify StatusCode", e);
			Assert.fail();
		}
	}
}
