package depend_1.api;

import java.io.IOException;

import org.testng.Assert;

import auth.api.VerifyBearerToken;
import auth.api.VerifyJsonID;
import auth.api.VerifyJsonResult;
import auth.api.VerifyResponseTime;
import auth.api.VerifyStatusCode;
import auth.api.VerifyStatusLine;
import global.api.Environment;
import io.restassured.RestAssured;

public class FrameSuite extends Environment {

	@SuppressWarnings("static-access")
	public static void POST_Login(String url, String str1) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " POST Function")
					.info("Defined Credentials are " + "[[ " + eusername + " ]]" + " & " + "[[ " + epassword + " ]]");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			withrespectto.loginflexiuser();
			referencereqresponse.PREPOSTresponse(url, str1);
			VerifyBearerToken.ensurelogintokenEX();
			VerifyStatusCode.ensureloginEX();
			VerifyStatusLine.ensureloginEX();
			VerifyResponseTime.ensure1(url, str1);
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on ALL LOGIN USER VALIDATION CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void Region_GET_View(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in GET Method")
					.info("CASE : View All Listed " + executefile + "s");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			htmlreport.flush();
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void Region_GET_View_Specific(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in -GET(ID) Method")
					.info("CASE : View the Specific " + executefile + " Value");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void Region_POST_Create(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in POST Method").info("CASE :: Create  New " + executefile);
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			htmlreport.flush();
		} catch (Exception e) {
			log.debug("Failing(!)...Excepetion occur! on Specific POST Function on CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void Region_DELETE_Delete(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in DELETE Method")
					.info("CASE : Delete the Specific " + executefile + " Value");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific DELETE on CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void Region_PUT_Update(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in PUT Function Method")
					.info("CASE : Update the Specific " + executefile + " Value");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);

			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);

			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);

			withrespectto.updateregioninglobal();
			referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);

			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific PUT Function on CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void UserRegion_GET_View(String url, String str1, String str2, String str3, String str4, String str5,
			String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in GET Method")
					.info("CASE : View All Listed " + executefile + "s");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			htmlreport.flush();
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void UserRegion_GET_View_Specific_UserID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in GET(ID) Method")
					.info("CASE : View the Specific " + executefile + " Value");

			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			ExtractJsonValue.fromResult();
			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);

			// TODO End the HTML Report
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void UserRegion_GET_View_Specific_UserID_RegionID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) {
		try {
			test = htmlreport.createTest(executefile + " in GET(ID) Method")
					.info("CASE : View the Specific " + executefile + " Value");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			// TODO Create a Region and Store Unique ID
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			ExtractJsonValue.fromResult();
			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			Subcategory = "UserIDRegionID";
			referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);

			// TODO End the HTML Report
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}

	}

	@SuppressWarnings("static-access")
	public static void UserRegion_POST_Create(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in GET(ID) Method")
					.info("CASE : View the Specific " + executefile + " Value");

			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			ExtractJsonValue.fromResult();
			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			// TODO Create a Region and Store Unique ID
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.additionUserRegion();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);

			// TODO End the HTML Report
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void UserRegion_DELETE_Delete_UserID_RegionID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in GET(ID) Method")
					.info("CASE : View the Specific " + executefile + " Value");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			// TODO Create a Region and Store Unique ID
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			ExtractJsonValue.fromResult();
			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);

			// TODO End the HTML Report
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_POST_Create(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in POST Method")
					.info("CASE : Create " + executefile + " under Specific Region");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			// TODO Create a Region and Store Region Unique ID
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			/*
			 * // TODO Stage 2 httprequest = RestAssured.given(); // TODO Token Generation
			 * and Store it PrePostRequest.tokengeneration(url, str1);
			 * referencereqresponse.GETresponseALL(url, str2);
			 * VerifyJsonResult.ensurebody(); VerifyStatusCode.ensure();
			 * VerifyStatusLine.ensure(); ExtractJsonValue.fromResult();
			 */
			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);

			// TODO End the HTML Report
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_GET_View(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in GET Method")
					.info("CASE : View All Listed " + executefile + "s");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);

			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			htmlreport.flush();
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_GET_View_Specific_JurisID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) {
		try {
			test = htmlreport.createTest(executefile + " in POST Method")
					.info("CASE : Create " + executefile + " under Specific Region");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			// TODO Create a Region and Store Region Unique ID
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);

			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);
			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);

			// TODO End the HTML Report
			htmlreport.flush();

			// TODO End the HTML Report
			htmlreport.flush();
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}

	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_GET_View_Specific_JurisID_GetMyJurisdiction(String url, String str1, String str2,
			String str3, String str4, String str5, String str6, String str7) {
		try {
			test = htmlreport.createTest(executefile + " in POST Method")
					.info("CASE : Create " + executefile + " under Specific Region");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			// TODO Create a Region and Store Region Unique ID
			withrespectto.createregioninglobal();

			Subcategory = "BaseLine";

			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);

			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);
			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);

			Subcategory = "GetMyJurisdiction";

			referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);

			// TODO End the HTML Report
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}

	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_GET_View_Specific_JurisID_GetJurisdictions(String url, String str1, String str2,
			String str3, String str4, String str5, String str6, String str7) {
		try {
			test = htmlreport.createTest(executefile + " in POST Method")
					.info("CASE : Create " + executefile + " under Specific Region");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			// TODO Create a Region and Store Region Unique ID
			withrespectto.createregioninglobal();

			Subcategory = "BaseLine";

			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);

			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);
			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);

			Subcategory = "GetJurisdictions";

			referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);

			// TODO End the HTML Report
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}

	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_GET_View_GetMyJurisdiction(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in GET Method")
					.info("CASE : View All Listed " + executefile + "s");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			htmlreport.flush();
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on GET ALL Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_PUT_Update(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in POST Method")
					.info("CASE : Create " + executefile + " under Specific Region");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			// TODO Create a Region and Store Region Unique ID
			withrespectto.createregioninglobal();

			// Subcategory = "Non_Jurisdiction"; // Only Temporary Value Declaration for
			// Sequence Order in TESTNG.XML

			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str2
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);

			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);
			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.updationJurisdiction();
			referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);

			htmlreport.flush();
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Jurisdiction PUT Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void Jurisdiction_DELETE_Delete_JurisdictionID(String url, String str1, String str2, String str3,

			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		try {
			test = htmlreport.createTest(executefile + " in GET(ID) Method")
					.info("CASE : View the Specific " + executefile + " Value");
			// TODO Stage 1
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			// TODO Create a Region and Store Unique ID
			withrespectto.createregioninglobal();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromRegionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure2(url, str2, str3, str4);
			// TODO Stage 2
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			withrespectto.creationJurisdiction();
			referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyJsonID.fromJurisdictionID();
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);

			// TODO Stage 3
			httprequest = RestAssured.given();
			// TODO Token Generation and Store it
			PrePostRequest.tokengeneration(url, str1);
			referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
			VerifyJsonResult.ensurebody(url, str3);
			VerifyStatusCode.ensure();
			VerifyStatusLine.ensure();
			VerifyResponseTime.ensure3(url, str2);

			// TODO End the HTML Report
			htmlreport.flush();

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Specific GET Function in CORE FRAME " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_POST_Create(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {

		test = htmlreport.createTest(executefile + " in POST Method")
				.info("CASE : Create " + executefile);

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it

		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		ExtractJsonValue.fromResult();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyJsonResult.ensurebody(url, str3);
		VerifyJsonID.fromRegionID();
		VerifyResponseTime.ensure2(url, str2, str3, str4);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure3(url, str2);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creation_UserJurisdiction();
		Subcategory = "Yes_UserJurisdiction";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure4(url, str6);
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_DELETE_Delete(String url, String str1, String str2, String str3, String str4,
			String str5, String str6, String str7) throws InterruptedException, IOException {

		test = htmlreport.createTest(executefile + " in GET(ID) Method")
				.info("CASE : View the Specific " + executefile + " Value");

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		ExtractJsonValue.fromResult();

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyJsonResult.ensurebody(url, str3);
		VerifyJsonID.fromRegionID();
		VerifyResponseTime.ensure2(url, str2, str3, str4);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure3(url, str2);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.deletion_UserJurisdiction();
		Subcategory = "Yes_UserJurisdiction";
		referencereqresponse.DELETEresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure4(url, str6);
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_GET_View_Specific_UserID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " in GET(ID) Method")
				.info("CASE : View the Specific " + executefile + " Value");

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		ExtractJsonValue.fromResult();

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure4(url, str6);
		htmlreport.flush();

	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_GET_View_Specific_UserIDJurisID(String url, String str1, String str2,
			String str3, String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " in GET(ID) Method")
				.info("CASE : View the Specific " + executefile + " Value");

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		ExtractJsonValue.fromResult();

		// TODO Stage 1
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		// TODO Create a Region and Store Unique ID
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
		VerifyJsonResult.ensurebody(url, str3);
		VerifyJsonID.fromRegionID();
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure2(url, str2, str3, str4);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure3(url, str2);

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		Subcategory = "UserIDJurisdictionID";
		referencereqresponse.GETresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure4(url, str6);
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_POST_Create_GetByJurisID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " in GET(ID) Method")
				.info("CASE : View the Specific " + executefile + " Value");

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		ExtractJsonValue.fromResult();

		// TODO Stage 1
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		// TODO Create a Region and Store Unique ID
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
		VerifyJsonResult.ensurebody(url, str3);
		VerifyJsonID.fromRegionID();
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure2(url, str2, str3, str4);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure3(url, str2);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.getmyjurisdictionID_UserJurisdiction();
		Subcategory = "GetMyJurisdictionID";
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure3(url, str2);
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_GET_All_GetMyJurisdictions(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " in GET(ID) Method")
				.info("CASE : View the Specific " + executefile + " Value");

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		htmlreport.flush();
	}

	@SuppressWarnings("static-access")
	public static void UserJurisdiction_PUT_Update_UserIDJurisID(String url, String str1, String str2, String str3,
			String str4, String str5, String str6, String str7) throws InterruptedException, IOException {
		test = htmlreport.createTest(executefile + " in GET(ID) Method")
				.info("CASE : View the Specific " + executefile + " Value");

		// TODO Stage 2
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.GETresponseALL(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		ExtractJsonValue.fromResult();

		// TODO Stage 1
		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		// TODO Create a Region and Store Unique ID
		withrespectto.createregioninglobal();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7); // url,str4
		VerifyJsonResult.ensurebody(url, str3);
		VerifyJsonID.fromRegionID();
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure2(url, str2, str3, str4);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		withrespectto.creationJurisdiction();
		referencereqresponse.POSTresponse(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyJsonID.fromJurisdictionID();
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		VerifyResponseTime.ensure3(url, str2);

		httprequest = RestAssured.given();
		// TODO Token Generation and Store it
		PrePostRequest.tokengeneration(url, str1);
		referencereqresponse.PUTresponseSPF(url, str2, str3, str4, str5, str6, str7);
		VerifyJsonResult.ensurebody(url, str3);
		VerifyStatusCode.ensure();
		VerifyStatusLine.ensure();
		htmlreport.flush();
		
		
	}
}
