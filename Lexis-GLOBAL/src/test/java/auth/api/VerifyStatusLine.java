package auth.api;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

import global.api.Environment;

public class VerifyStatusLine extends Environment {

	public static void ensure() {
		try {
			statusline = httpresponse.getStatusLine();
			log.debug("Actual Status_Info is ➨➨ " + statusline);

			if (statusline.equals("HTTP/1.1 200 OK")) {
				log.debug("PASS ! 🙂...Expected Status_Line [HTTP/1.1 200 OK] is Equal to Actual Status_Code " + "[" + statusline
						+ "]");
				test.log(Status.PASS, "Status_Line "+"["+ statusline+"]"+" Status OK");

			} else {

				log.debug("FAIL ! ☹...Expected Status_Code [HTTP/1.1 200 OK] is Not Equal to Actual Status_Code " + "["
						+ statusline + "]");
				test.log(Status.FAIL, "Status_Line "+"["+ statusline+"]"+" Bad Request");
				Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
				Assert.fail();
			}

		} catch (Exception e) {
			log.debug("Failing ! ☹...Exception occur! on StatusLine Area with HTTP/1.1 200 OK " + e);
			test.log(Status.FAIL, "Expected Status_Line [HTTP/1.1 200 OK] is Not Equal to  Actual Status_Code "+"["+ statusline+"]"+" Bad RESPONSE");
			Assert.fail();
		}
	}
	
	public static void prePOSTensure() {
		try {
			statusline = httpresponse.getStatusLine();
			log.debug("Actual Status_Info ➨➨ " + statusline);

			if (statusline.equals("HTTP/1.1 200 OK")) {
				log.debug("PASS ! 🙂...Expected Status_Line [HTTP/1.1 200 OK] is Equal to Actual Status_Code " + "[" + statusline
						+ "]");
				//test.log(Status.PASS, "Status_Line "+"["+ statusline+"]"+" Status OK");
			} else {
                log.debug("FAIL ! ☹...Expected Status_Code [HTTP/1.1 200 OK] is Not Equal to Actual Status_Code " + "["
						+ statusline + "]");
				test.log(Status.FAIL, "Status_Line "+"["+ statusline+"]"+" Bad Request");
				//Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
				//Assert.fail();
			}
		} catch (Exception e) {
			log.debug("Failing ! ☹...Exception occur! on StatusLine Area with HTTP/1.1 200 OK " + e);
			test.log(Status.FAIL, "Expected Status_Line [HTTP/1.1 200 OK] is Not Equal to  Actual Status_Code "+"["+ statusline+"]"+" Bad RESPONSE");
			Assert.fail();
		}
	}

	public static void ensureloginEX() {
		try {
			statusline = httpresponse.getStatusLine();
			log.debug("Actual Status_Info is ➨➨  " + statusline);
			if (statusline.equals("HTTP/1.1 200 OK")) {
				log.debug("PASS ! 🙂...Expected Status_Code [HTTP/1.1 200 OK]  is Equal to Actual Status_Code " + "["
						+ statusline + "]");
		 } else {
				log.debug("FAIL ! ☹...Expected Status_Code [HTTP/1.1 400 Bad Request]  is Equal to Actual Status_Code " + "["
						+ statusline + "]");

			}
		} catch (Exception e) {
			log.debug("Failing ! ☹...Exception occur! on StatusLine Generation Area with Login Verification " + e);
			Assert.fail();
		}
	}
}