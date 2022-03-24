package tenant.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Cover1 {
	
	static Response response;
	
	@Test (enabled=false)
	void getmodule() { 
		
		//EndPoint URI
		//RestAssured.baseURI="https://reqres.in/";
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification httprequest=RestAssured.given();
		
		//Request Method
		Response response=httprequest.request(Method.GET,"api/users");
	    
		//Verify Json Body Structured any Value or Name
        String responsebody=response.getBody().asString();
        System.out.println("Response Body is." + responsebody);
        Assert.assertEquals(responsebody.contains("George"), true);
        
        //Verify Complete Json Value or Name
		/*
		 * JsonPath jsonpath=response.jsonPath();
		 * System.out.println(jsonpath.get("page"));
		 * System.out.println(jsonpath.get("per_page"));
		 * System.out.println(jsonpath.get("total"));
		 * System.out.println(jsonpath.get("total_pages"));
		 * Assert.assertEquals(jsonpath.get("page"),1);
		 * Assert.assertEquals(jsonpath.get("per_page"),6);
		 */
        
        //Verify Status Code
        int statuscode =response.getStatusCode();
        System.out.println("Status Code is-->"+statuscode);
        Assert.assertEquals(statuscode, 200);
        
        //Verify Status Line
        String statusline=response.getStatusLine();
        System.out.println("Status Line is-->"+ statusline);
        Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
         
        //Verify Exact Header value in Headers
	    String contentype=response.header("Content-Type");
	    System.out.println("ContentType is-->"+contentype);
	    String server=response.header("Server");
	    System.out.println("Server Vlaue is-->"+server);
	    
	    //Verify All the Header value in Headers
	    Headers allheaders=response.headers();
		for(Header headers:allheaders) {
			System.out.println("All Headers is-->"+headers);
			
			
		}
	}
	    
	 	
	@Test (enabled=true)
	void module2() {
             RestAssured.baseURI="https://reqres.in/";
             
             PreemptiveBasicAuthScheme authscheme=new PreemptiveBasicAuthScheme();
             authscheme.setUserName("eve.holt@reqres.in");
             authscheme.setPassword("cityslicka");
             RestAssured.authentication=authscheme;
             
             RequestSpecification httprequest=RestAssured.given();
     		
     		//Request Method
     		Response response=httprequest.request(Method.POST,"api/login");
            
     		String responsebody=response.getBody().asString();
            System.out.println("Response Body is." + responsebody);
       }
}