package tenant.api;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;


import auth.api.VerifyJsonID;
import depend_1.api.SupportProperties;
import dependent_2.api.CurrentTime;
import global.api.Environment;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@SuppressWarnings("unused")
public class Sa extends Environment {

	static String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6WyIxNjIzYjg2MS1mYWQxLTRhNTgtYTZhZS05ZWUxNTYwMWMzODkiLCIxNjIzYjg2MS1mYWQxLTRhNTgtYTZhZS05ZWUxNTYwMWMzODkiXSwic3ViIjoiMTYyM2I4NjEtZmFkMS00YTU4LWE2YWUtOWVlMTU2MDFjMzg5IiwiZW1haWwiOiJMZXhpc25leGlzQWRtaW5AYWRhcHB0LmNvLmluIiwicm9sZSI6IlN1cGVyIEFkbWluIiwibmJmIjoxNjM4MjY5ODYzLCJleHAiOjE2NDA4NjE4NjMsImlhdCI6MTYzODI2OTg2MywiaXNzIjoiaHR0cHM6Ly91YXQuYXBpLmxleGlzbmV4aXMuY28udWsiLCJhdWQiOiJodHRwczovL3VhdC5hcGkubGV4aXNuZXhpcy5jby51ayJ9.hSQqMsSkw6I0z1zYnzMRkKt_QvoAE5O0KdeTT0TlZgs";
	@Test (enabled = false)
	public static void POST() {
		RestAssured.baseURI="https://lnmjapi.adappt.ai/api/Account/token";
		RequestSpecification request=RestAssured.given(); 
		JSONObject requestParams = new JSONObject();
		requestParams.put("Username", "LexisnexisAdmin@adappt.co.in");
		requestParams.put("Password", "LonestarAdmin@123");
		request.headers("Content-Type", "application/json");
        request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST,"/");
	    System.out.println("---POST--- Request Given Successfully");
	    String actualresult = response.getBody().asString();
	    System.out.println("POST Using TOKEN is "+actualresult);
	    //request.header("Authorization","Bearer"+actualresult).headers("Content-Type", "application/json"); 
	    //String addd="{\r\n"
	    	//	+ "  \"Name\": \"TestA\",\r\n"
	    	//	+ "  \"Prefix\": \"212\",\r\n"
	    	//	+ "  \"Description\": \"TestDes\",\r\n"
	    	//	+ "  \"DataCentre\": \"TesT\",\r\n"
	    	//	+ "  \"Hosting\": \"TestHosting\"\r\n"
	    	//	+ "}";
	    //Response str=request.body(addd).post("api/v1/Region");
		//String ss=str.getBody().asString();
		//System.out.println(ss);
	}
	@Test (enabled = false)
	public static void GET() {
		RestAssured.baseURI="https://lnmjapi.adappt.ai/api/v1/Region";
		RequestSpecification request=RestAssured.given();
		request.headers("Content-Type", "application/json")
		.header("Authorization","Bearer "+ token);
		Response response=request.request(Method.GET,"/");
	    String responsebody=response.getBody().asString();
	    System.out.println(responsebody);
	}
	@Test (enabled = false)
	public static void GET1() throws IOException {
		URL url = new URL("https://lnmjapi.adappt.ai/api/v1/Region");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Bearer "+token); 
        http.setRequestMethod("GET");
		System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
		http.disconnect();


	}
	@Test (enabled = false)
	public void copypaste() throws IOException {
		 

		URL url = new URL("https://lnmjapi.adappt.ai/api/v1/Region/021e9882-2d9c-4626-ae5d-ec606da05a29");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("PUT");
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6WyIxNjIzYjg2MS1mYWQxLTRhNTgtYTZhZS05ZWUxNTYwMWMzODkiLCIxNjIzYjg2MS1mYWQxLTRhNTgtYTZhZS05ZWUxNTYwMWMzODkiXSwic3ViIjoiMTYyM2I4NjEtZmFkMS00YTU4LWE2YWUtOWVlMTU2MDFjMzg5IiwiZW1haWwiOiJMZXhpc25leGlzQWRtaW5AYWRhcHB0LmNvLmluIiwicm9sZSI6IlN1cGVyIEFkbWluIiwibmJmIjoxNjM4NTEzNjU4LCJleHAiOjE2NDExMDU2NTgsImlhdCI6MTYzODUxMzY1OCwiaXNzIjoiaHR0cHM6Ly91YXQuYXBpLmxleGlzbmV4aXMuY28udWsiLCJhdWQiOiJodHRwczovL3VhdC5hcGkubGV4aXNuZXhpcy5jby51ayJ9.8TxIBlkein16N3E10EcVmp5sIApg0dESL0arXYI6RD8");
		http.setRequestProperty("Content-Type", "application/json");

		String data = "{\n  \"Name\": \"UdPd2\",\n  \"Prefix\": \"ub2\",\n  \"Description\": \"string\",\n  \"DataCentre\": \"string\",\n  \"Hosting\": \"string\"\n}";

		byte[] out = data.getBytes(StandardCharsets.UTF_8);
   
		OutputStream stream = http.getOutputStream();
		stream.write(out);

		System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
		http.disconnect();


	}
	@Test (enabled=false)
	public void xxx() {
			int empid = 15410;

				RestAssured.baseURI ="https://dummy.restapiexample.com/api/v1";
				RequestSpecification request = RestAssured.given();
				
				JSONObject requestParams = new JSONObject();
				requestParams.put("name", "Zion"); // Cast
				requestParams.put("age", 23);
				requestParams.put("salary", 12000);

				request.body(requestParams.toJSONString());
				Response response = request.put("/update/"+ empid);

				int statusCode = response.getStatusCode();
				System.out.println(response.asString());
				Assert.assertEquals(statusCode, 200); 
			}
	@Test (enabled=false)
	public void xxx1() {
			int empid = 15410;

				RestAssured.baseURI ="https://lnmjapi.adappt.ai";
				RequestSpecification request = RestAssured.given();
				
				JSONObject requestParams = new JSONObject();
				requestParams.put("Name", "Zion"); // Cast
				requestParams.put("Prefix", "BXX");
				requestParams.put("Description", "zszs");
				requestParams.put("DataCentre", "dedf");
				requestParams.put("Hosting", "adwd");

				request.body(requestParams.toJSONString());
				Response response = request.put("/api/v1/Region/021e9882-2d9c-4626-ae5d-ec606da05a29");

				int statusCode = response.getStatusCode();
				System.out.println(response.asString());
				Assert.assertEquals(statusCode, 200); 
			}
	@Test
	public static void as() {
		
		//PRE_POST
		RestAssured.baseURI = "https://lnmjapi.adappt.ai/";
		RequestSpecification httprequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("Username", "LexisnexisAdmin@adappt.co.in");
	    requestParams.put("Password", "LonestarAdmin@123");
		requestParams.put("GrantType", "Password");
        httprequest.body(requestParams.toJSONString());       //
        httprequest.headers("Content-Type", "application/json");
		Response httpresponse = httprequest.request(Method.POST,"api/Account/token");
		String token = httpresponse.getBody().asString();
		System.out.println("PASS(!)...BEARER TOKEN Generated Succeed i.e. " + token);
		
		//POST
		requestParams.put("Name", "SepTesting7");
		requestParams.put("Prefix", "Sep7");
		requestParams.put("Description","Description");
	    requestParams.put("DataCentre", "DataCentre");
		requestParams.put("Hosting", "Hosting");
		httprequest.body(requestParams.toJSONString());
		httprequest.headers("Content-Type", "application/json");
		httprequest.header("Authorization", "Bearer " + token);
		httpresponse = httprequest.request(Method.POST,"api/v1/Region");
		String ActualBodyResult = httpresponse.getBody().asString();
		System.out.println("Actual JsonBody Result is --> " + ActualBodyResult);
		
		//Unique ID
		String uniqueid = JsonPath.from(ActualBodyResult).get("Id");
		System.out.println("Created Unique ID is " + uniqueid);
		
		//PRE-POST
		RestAssured.baseURI = "https://lnmjapi.adappt.ai/";
		httprequest = RestAssured.given();
		requestParams = new JSONObject();
		requestParams.put("Username", "LexisnexisAdmin@adappt.co.in");
	    requestParams.put("Password", "LonestarAdmin@123");
		requestParams.put("GrantType", "Password");
        httprequest.body(requestParams.toJSONString());
        httprequest.headers("Content-Type", "application/json");
		httpresponse = httprequest.request(Method.POST,"api/Account/token");
		token = httpresponse.getBody().asString();
		System.out.println("PASS(!)...BEARER TOKEN Generated Succeed i.e. " + token);
		
		/*
		 * //GET Specific httprequest.headers("Content-Type", "application/json");
		 * httprequest.header("Authorization", "Bearer " + token); httpresponse =
		 * httprequest.request(Method.GET,"api/v1/Region"+"/"+uniqueid);
		 * ActualBodyResult = httpresponse.getBody().asString();
		 * System.out.println("Actual JsonBody Result is --> " + ActualBodyResult);
		 */
	}
	
	public static void http() {
		
		/*
		 * httprequest = RestAssured.given(); withrespectto.loginflexiuser();
		 * referencereqresponse.PREPOSTresponse(url, str1);
		 * VerifyBearerToken.ensuretoken(); withrespectto.createregioninglobal();
		 * referencereqresponse.POSTresponse(url, str2); VerifyJsonResult.ensurebody();
		 * VerifyJsonID.ensure(); URL fullurl = new URL(url + str2 + "/" + uniqueid);
		 * HttpURLConnection http = (HttpURLConnection) fullurl.openConnection();
		 * http.setRequestMethod("DELETE");
		 * log.debug("<¦DELETE¦> Requested Initiated for (HTTP): " + url + str2 + "/" +
		 * uniqueid); http.setRequestProperty("Accept", "application/json");
		 * http.setRequestProperty("Authorization", "Bearer " + token);
		 * log.debug("Actual Statuscode is " + http.getResponseCode());
		 * log.debug("Actual StatusLine is " + http.getResponseMessage());
		 * http.disconnect(); VerifyResponseTime.ensure3(url, str2);
		 */
	}
	public static void httpss() {
		/*
		 * httprequest = RestAssured.given(); withrespectto.loginflexiuser();
		 * referencereqresponse.PREPOSTresponse(url, str1);
		 * VerifyBearerToken.ensuretoken(); withrespectto.createregioninglobal();
		 * referencereqresponse.POSTresponse(url, str2); VerifyJsonResult.ensurebody();
		 * VerifyJsonID.ensure(); URL fullurl = new URL(url + str2 + "/" + uniqueid);
		 * HttpURLConnection http = (HttpURLConnection) fullurl.openConnection();
		 * http.setRequestMethod("PUT");
		 * log.debug("<¦PUT¦> Requested Initiated for (HTTP): " + url + str2 + "/" +
		 * uniqueid); http.setDoOutput(true); http.setRequestProperty("Accept",
		 * "application/json"); http.setRequestProperty("Authorization", "Bearer " +
		 * token); http.setRequestProperty("Content-Type", "application/json");
		 * withrespectto.updateregioninglobal(); String data = requestParams.toString();
		 * byte[] out = data.getBytes(StandardCharsets.UTF_8); OutputStream stream =
		 * http.getOutputStream(); stream.write(out); log.debug("Actual StatusCode is "
		 * + http.getResponseCode()); log.debug("Actual StatusLine is " +
		 * http.getResponseMessage()); http.disconnect();
		 * VerifyResponseTime.ensure3(url, str2);
		 */
	}
}

