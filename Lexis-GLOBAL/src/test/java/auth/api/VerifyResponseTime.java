package auth.api;

import org.testng.Assert;

import com.aventstack.extentreports.Status;

//import com.aventstack.extentreports.Status;

import global.api.Environment;

public class VerifyResponseTime extends Environment {

	public static void ensure1(String url, String str1) {
		try {
			httpresponse = httprequest.given().when().get(url + str1);
			log.debug("@Finding Response Time for this API endpoint i.e. " + url + str1);
			Long responsetime = httpresponse.then().extract().time();
			log.debug("Response Time is " + responsetime);
			if (responsetime < 2000) {
				log.debug("Response time less than 2 seconds i.e. " + responsetime + " milliseconds");

			} else {
				log.debug("Warning(!)...Response time is Greater than 2 seconds i.e. " + responsetime + " milliseconds");
				
			}
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Response Time Generate Area with str1 " + e);
			Assert.fail();
		}
	}

	public static void ensure2(String url, String str2, String str3, String str4) {
		try {
			httpresponse = httprequest.given().when().get(url + str3);
			log.debug("@Finding Response Time for this endpoint "+ (url + str3));
			Long responsetime = httpresponse.then().extract().time();
			log.debug("Actual Response Time ➨ " + responsetime);
			if (responsetime < 2000) {
				log.debug("Response time less than 2 seconds ➨ " + responsetime + " milliseconds");
			} else {
				log.debug(
						"Warning (!) ...Response time is Greater than 2 seconds ➨ " + responsetime + " milliseconds");
			}
		} catch (Exception e) {
			log.debug("❌ Failling ! 🙁...Exception occur! on Response Time " + e);
			Assert.fail();
		}
	}

	public static void ensure3(String url, String str2) {
		try {
			httpresponse = httprequest.given().when().get(url + str2 + "/" + uniqueidr1);
			log.debug("@Finding Response Time for this (API) i.e. " + (url + str2 + "/" + uniqueidr1));
			Long responsetime = httpresponse.then().extract().time();
			log.debug("Response Time is " + responsetime);
			if (responsetime < 2000) {
				log.debug("Response time less than 2 seconds i.e. " + responsetime + " milliseconds");
				test.log(Status.INFO, "[[ " + url + str2 + "/" + uniqueidr1 + " ]]" + " ->Response Time is "
						+ responsetime + " milliseconds");

			} else {
				log.debug(
						"Warning(!)...Response time is Greater than 2 seconds i.e. " + responsetime + " milliseconds");
				test.log(Status.WARNING, "[[ " + url + str2 + "/" + uniqueidr1 + " ]]" + " ->Response Time is "
						+ responsetime + " milliseconds");
			}

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur!...on Response Time Generate Area with  str2 and uniqueID " + e);
			Assert.fail();
		}
	}

	public static void ensure4(String url, String str6) {
		try {
			httpresponse = httprequest.given().when().get(url + str6 + "/" + uniqueidr1);
			log.debug("@Finding Response Time for this (API) i.e. " + (url + str6 + "/" + uniqueidr1));
			Long responsetime = httpresponse.then().extract().time();
			log.debug("Response Time is " + responsetime);
			if (responsetime < 2000) {
				log.debug("Response time less than 2 seconds i.e. " + responsetime + " milliseconds");
				test.log(Status.INFO,
						"[[ " + url + str6 + " ]]" + " ->Response Time is " + responsetime + " milliseconds");

			} else {
				log.debug(
						"Warning(!)...Response time is Greater than 2 seconds i.e. " + responsetime + " milliseconds");
				test.log(Status.WARNING,
						"[[ " + url + str6 + " ]]" + " ->Response Time is " + responsetime + " milliseconds");
			}

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur!...on Response Time Generate Area with  str2 and uniqueID " + e);
			Assert.fail();
		}
	}
}
