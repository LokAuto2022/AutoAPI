package tenant.api;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Cover2 {

@Test (enabled=false)
    void authentication() {
	
	RestAssured.baseURI="https://lnmjapi.adappt.ai/";
	
	//Data Passing
	  PreemptiveBasicAuthScheme authscheme=new PreemptiveBasicAuthScheme();
	  authscheme.setUserName("LexisnexisAdmin@adappt.co.in");
	  authscheme.setPassword("LonestarAdmin@123");
	  RestAssured.authentication=authscheme;
	 
	
	
	
	RequestSpecification httprequest=RestAssured.given();
	
	//Request Method
	Response response=httprequest.request(Method.POST,"api/Account/token");
	
	
	
	//Verify Json Body Structured any Value or Name
    String responsebody=response.getBody().asString();
    System.out.println("Response Body is." + responsebody);
    //Assert.assertEquals(responsebody.contains("George"), true);
    
    //Verify Status Code
    int statuscode =response.getStatusCode();
    System.out.println("Status Code is-->"+statuscode);
    //Assert.assertEquals(statuscode, 200);
	 
   }

@Test (enabled=false)
void module2() {
	int statuscode=RestAssured.given().auth().preemptive()
	.basic("LexisnexisAdmin@adappt.co.in", "LonestarAdmin@123")
	.when().get("https://lnmjapi.adappt.ai/api/Account/token").getStatusCode();
	System.out.println("Response Code From Server is "+statuscode);
	}
@SuppressWarnings("unchecked")
@Test (enabled=true)
void module3() {
	//RestAssured.useRelaxedHTTPSValidation();
			//ENDPOINT URI
			//RestAssured.useRelaxedHTTPSValidation("https://lnmjapi-env.eu-west-1.elasticbeanstalk.com/swagger/index.html#/");
			//RestAssuredResponseImpl bhe=
			RestAssured.baseURI="https://lnmjapi-env.eu-west-1.elasticbeanstalk.com/swagger/index.html#/";
			
			//RestAssured.given().relaxedHTTPSValidation().when().get();
			//RestAssured.given().contentType(ContentType.JSON).when().get();
			
			//REQUEST
			RequestSpecification httpRequest=(RequestSpecification) RestAssured.get();
		    
			//CARRIED OUT WITH DATA (JSON)
			JSONObject requestParams=new JSONObject();
		   
			requestParams.put("Username", "LexisnexisAdmin@adappt.co.in");
			requestParams.put("Password","LonestarAdmin@123");
			requestParams.put("GrantType", "Password");
			httpRequest.headers("Content-Type","application/json");
			//Converte Json Format into String Format
			httpRequest.body(requestParams.toJSONString());
			
			//If it is Staright Json Format Then use this below Code
			//httpRequest.header("Content-Type","application/json");
	     
			// POST WITH BASE URI 		
			Response response=httpRequest.request(Method.POST,"/");
			
			//CAPTURE IN CONSOLE BODY
			String responseBody=response.getBody().asString();
			
			//VERIFY EXACT VALUE IN BODY
			Assert.assertEquals(responseBody.contains("LexisnexisAdmin@adappt.co.in"),true);
			Assert.assertEquals(responseBody.contains("LonestarAdmin@123"),true);
			Assert.assertEquals(responseBody.contains("Password"),true);
			
			//VERIFY STATUSCODE
			int statuscode=response.getStatusCode();
			Assert.assertEquals(statuscode,200);	
			
	
	
}

	
	
}
