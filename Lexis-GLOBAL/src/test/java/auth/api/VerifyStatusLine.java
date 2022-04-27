package auth.api;

import org.testng.Assert;
import com.aventstack.extentreports.Status;
import global.api.Environment;

public class VerifyStatusLine extends Environment {

	public static void ensureLine200() {
		try {
			statusline = httpresponse.getStatusLine();
			if (statusline.equals("HTTP/1.1 200 OK")) {
				log.debug("Actual Status_Info is ➨➨ " + statusline);
				log.debug("✔️PASS ! 🙂...Expected ➨ [HTTP/1.1 200 OK] == Actual ➨ " + "["+ statusline + "]");
				test.log(Status.PASS, "✔️PASS ! 🙂...Expected ➨ [HTTP/1.1 200 OK] == Actual ➨ " + "["+ statusline + "]");
		    	extendFinalOutput="Pass";
			} else {
				log.debug("Actual Status_Info is ➨➨ " + statusline);
				log.debug("❌ Fail ! 🙁...Expected ➨ [HTTP/1.1 200 OK] ≠≠ Actual ➨ " + "["+ statusline + "]");
				test.log(Status.FAIL, "❌ Fail ! 🙁...Expected ➨ [HTTP/1.1 200 OK] ≠≠ Actual ➨ " + "["+ statusline + "]");
				extendFinalOutput="Fail";
				Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
				Assert.fail();
			}	
		} catch (Exception e) {
			log.debug("❌ Failing ! 🙁...Exception occur! on StatusLine Area with HTTP/1.1 200 OK " + e);
			test.log(Status.FAIL, "Expected Status_Line [HTTP/1.1 200 OK] ≠  Actual Status_Code " + "["+ statusline + "]" + " Bad RESPONSE");
			Assert.fail();
		}
	}
	public static void ensureLine403() {
		try {
			statusline = httpresponse.getStatusLine();
			if (statusline.equals("HTTP/1.1 403 Forbidden")) {
				log.debug("Actual Status_Info is ➨➨ " + statusline);
				log.debug("✔️PASS ! 🙂...Expected ➨ [HTTP/1.1 403 Forbidden] == Actual ➨ " + "["+ statusline + "]");
				test.log(Status.PASS, "✔️PASS ! 🙂...Expected ➨ [HTTP/1.1 403 Forbidden] == Actual ➨ " + "["+ statusline + "]");
				extendFinalOutput="Fail";
			} else {
				log.debug("Actual Status_Info is ➨➨ " + statusline);
				log.debug("❌ Fail ! 🙁...Expected ➨ [HTTP/1.1 403 Forbidden] ≠≠ Actual ➨ " + "["+ statusline + "]");
				test.log(Status.FAIL, "❌ Fail ! 🙁...Expected ➨  [HTTP/1.1 403 Forbidden] ≠≠ Actual ➨ " + "["+ statusline + "]");
				extendFinalOutput="Fail";
				Assert.assertEquals(statusline, "HTTP/1.1 403 Forbidden");
				Assert.fail();
			}	
		} catch (Exception e) {
			log.debug("❌ Failing ! 🙁...Exception occur! on StatusLine Area with HTTP/1.1 200 OK ",e);
			Assert.fail();
		}
	}
	public static void ensureLine400() {
		try {
			statusline = httpresponse.getStatusLine();
			if (statusline.equals("HTTP/1.1 400 Bad Request")) {
				log.debug("Actual Status_Info is ➨➨ " + statusline);
				log.debug("✔️PASS ! 🙂...Expected ➨ [HTTP/1.1 400 Bad Request] == Actual ➨ " + "["+ statusline + "]");
				test.log(Status.PASS, "✔️PASS ! 🙂...Expected ➨ [HTTP/1.1 400 Bad Request] == Actual ➨ " + "["+ statusline + "]");
				extendFinalOutput="Fail";
			} else {
				log.debug("Actual Status_Info is ➨➨ " + statusline);
				log.debug("❌ Fail ! 🙁...Expected ➨ [HTTP/1.1 400 Forbidden] ≠≠ Actual ➨ " + "["+ statusline + "]");
				test.log(Status.FAIL, "❌ Fail ! 🙁...Expected ➨ [HTTP/1.1 400 Forbidden] ≠≠ Actual ➨ " + "["+ statusline + "]");
				extendFinalOutput="Fail";
				Assert.assertEquals(statusline, "HTTP/1.1 400 Bad Request");
				Assert.fail();
			}	
		} catch (Exception e) {
			log.debug("❌ Failing ! 🙁...Exception occur! on StatusLine Area with HTTP/1.1 200 OK ",e);
			Assert.fail();
		}
	}

	public static void prePOSTensure() {
		try {
			statusline = httpresponse.getStatusLine();
			if (statusline.equals("HTTP/1.1 200 OK")) {
				log.debug("✔️PASS ! 🙂...Expected ➨ [HTTP/1.1 200 OK] == Actual ➨ " + "["
						+ statusline + "]");
				// test.log(Status.PASS, "Status_Line "+"["+ statusline+"]"+" Status OK");
			} else {
				log.debug("Actual Status_Info ➨➨ " + statusline);
				log.debug("❌ Fail ! 🙁...Expected ➨ [HTTP/1.1 200 OK] == Actual ➨ " + "["
						+ statusline + "]");
				test.log(Status.FAIL, "Status_Line " + "[" + statusline + "]" + " Bad Request");
				// Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
				// Assert.fail();
			}
		} catch (Exception e) {
			log.debug("❌ Failling ! 🙁...Exception occur! on StatusLine Area with HTTP/1.1 200 OK " + e);
			test.log(Status.FAIL, "Expected Status_Line [HTTP/1.1 200 OK] is Not Equal to  Actual Status_Code " + "["
					+ statusline + "]" + " Bad RESPONSE");
			Assert.fail();
		}
	}


	public static void ensureStatusLineValid() {
		try {
			statusline = httpresponse.getStatusLine();
			log.debug("Actual StatusLine ➨➨  " + statusline);
			if (statusline.equals("HTTP/1.1 200 OK")) {
				log.debug("✔️PASS ! 🙂...Expected ➨ [HTTP/1.1 200 OK]  == Actual ➨ " + "["+ statusline + "]");
				test.log(Status.PASS,"✔️PASS ! 🙂...Expected ➨ [HTTP/1.1 200 OK]  == Actual ➨ " + "[" + statusline + "]");
				extendFinalOutput="Pass";
			} else {
				log.debug("❌ Fail ! 🙁...Expected ➨ [HTTP/1.1 200 OK]  ≠≠ Actual ➨ " + "["+ statusline + "]");
				test.log(Status.FAIL,"❌Fail ! 🙁...Expected ➨ [HTTP/1.1 200 OK]  ≠≠ Actual ➨ " + "[" + statusline + "]");
				extendFinalOutput="Fail";
			}
		} catch (Exception e) {
			log.debug("❌Failing ! 🙁...Exception occur! on Verify StatusLine ", e);
			Assert.fail();
		}
	}

	public static void ensureStatusLineInvalid() {
		try {
			statusline = httpresponse.getStatusLine();
			log.debug("Actual StatusLine ➨➨  " + statusline);
			if (statusline.equals("HTTP/1.1 400 Bad Request")) {
				log.debug("✔PASS ! 🙂...Expected ➨ [HTTP/1.1 400 Bad Request] == Actual ➨ " + "["+ statusline + "]");
				test.log(Status.PASS,"✔️PASS ! 🙂...Expected ➨ [HTTP/1.1 400 Bad Request]  == Actual ➨ " + "[" + statusline + "]");
				extendFinalOutput="Fail";
			} else {
				log.debug("❌ Fail ! 🙁...Expected ➨ [HTTP/1.1 400 Bad Request]  ≠≠ Actual ➨ " + "["+ statusline + "]");
				test.log(Status.FAIL,"❌Fail ! 🙁...Expected ➨ [HTTP/1.1 400 Bad Request]  ≠≠ Actual ➨ " + "[" + statusline + "]");
				extendFinalOutput="Fail";
			}
		} catch (Exception e) {
			log.debug("❌Failing ! 🙁...Exception occur! on Verify StatusLine ", e);
			Assert.fail();
		}
	}
}