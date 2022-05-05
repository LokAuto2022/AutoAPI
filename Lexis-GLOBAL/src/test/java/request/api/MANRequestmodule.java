package request.api;

import org.testng.Assert;

import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.Status;
import global.api.Environment;
import io.restassured.http.Method;

public class MANRequestmodule extends Environment {

	public static void PREPOSTresponse(String url, String str1) {
		try {
			httprequest.headers("Content-Type", "application/json");
			httpresponse = httprequest.request(Method.POST, str1);
			log.debug("⏪ PRE_POST ⏩  Requested for: " + url + str1);
			// test.log(Status.PASS, "POST Method Succeed ( ! ) for Login Athentication");

		} catch (Exception e) {
			log.debug("Failing ! ☹...Exception occur! on PRE-POST Request " + e);
			// test.log(Status.FAIL, "FAIL, unable to access POST Method for Login
			// Authentication");
			htmlreport.flush();
			// Assert.fail();
		}
	}

	public static void POSTresponse(String url, String str2, String str3, String str4, String str5, String str6,
			String str7) {
		if (executefile.equals("REGION")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str3);
					log.debug("⏪ POST ⏩ Requested for " + url + str3);
					test.log(Status.INFO, "POST Method  ➜ " + url + str3);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to Initiate POST Method for " + executefile + " Creation");
					test.log(Status.FAIL, "❌ Fail ! 🙁...Expected ➨ [200] ≠≠ Actual ➨ " + "[ " + statuscode + "]");
				}
			}
		}
		if (executefile.equals("USER_REGION")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str3);
					log.debug("⏪ POST ⏩ Requested for " + url + str3);
					test.log(Status.INFO, "POST Method  ➜ " + url + str3);

				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method from UserRegion Includes UserID");
					Assert.fail();
				}
			}
			if (Subcategory.equals("UserIDRegionID")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str3);
					log.debug("⏪ POST ⏩ Requested for " + url + str3);
					test.log(Status.INFO, "POST Method  ➜ " + url + str3);

				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion includes UserIDRegionID");
					Assert.fail();
				}
			}
			if (Subcategory.equals("Add_UserRegion")) {
				try {httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str4);
					log.debug("⏪ POST ⏩ Requested for " + url + str4);
					test.log(Status.INFO, "POST Method  ➜ " + url + str4);

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
		}
		if (executefile.equals("JURISDICTION")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str3);
					log.debug("⏪ POST ⏩ Requested for " + url + str3);
					test.log(Status.INFO, "POST Method  ➜ " + url + str3);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("Yes_Jurisdiction")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str5);
					log.debug("⏪ POST ⏩ Requested for " + url + str5);
					test.log(Status.INFO, "POST Method  ➜ " + url + str5);
					Subcategory = "BaseLine";
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
		}
		if (executefile.equals("USER_JURISDICTION")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str3);
					log.debug("⏪ POST ⏩ Requested for " + url + str3);
					test.log(Status.INFO, "POST Method  ➜ " + url + str3);
					Subcategory = "BaseLine";
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserJurisdiction");
					Assert.fail();
				}
			}
			if (Subcategory.equals("Yes_Jurisdiction")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str5);
					log.debug("⏪ POST ⏩ Requested for " + url + str5);
					test.log(Status.INFO, "POST Method  ➜ " + url + str5);
					Subcategory = "BaseLine";

				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("Yes_UserJurisdiction")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					// httpresponse=httprequest.body(payloadd).post(str6);
					httpresponse = httprequest.request(Method.POST, str6);
					log.debug("⏪ POST ⏩ Requested for " + url + str6);
					test.log(Status.INFO, "POST Method  ➜ " + url + str6);
					Subcategory = "BaseLine";
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("GetMyJurisdictionID")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					// httpresponse=httprequest.body(payload).post(str7);
					httpresponse = httprequest.request(Method.POST, str7);
					log.debug("⏪ POST ⏩ Requested for " + url + str7);
					test.log(Status.INFO, "POST Method  ➜ " + url + str7);

				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
		}
		if (executefile.equals("ENTITY_TYPE")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str3);
					log.debug("⏪ POST ⏩ Requested for " + url + str3);
					test.log(Status.INFO, "POST Method  ➜ " + url + str3);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("Yes_Jurisdiction")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str5);
					log.debug("⏪ POST ⏩ Requested for " + url + str5);
					test.log(Status.INFO, "POST Method  ➜ " + url + str5);
					Subcategory = "BaseLine";
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("CreateEntity")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str7);
					log.debug("⏪ POST ⏩ Requested for " + url + str7);
					test.log(Status.INFO, "POST Method  ➜ " + url + str7);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
		}
		if (executefile.equals("ENTITY_SUBTYPE")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str3);
					log.debug("⏪ POST ⏩ Requested for " + url + str3);
					test.log(Status.INFO, "POST Method  ➜ " + url + str3);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
		 if (Subcategory.equals("Yes_Jurisdiction")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.POST, str5);
				log.debug("⏪ POST ⏩ Requested for " + url + str5);
				test.log(Status.INFO, "POST Method  ➜ " + url + str5);
				Subcategory = "BaseLine";
			} catch (Exception e) {
				log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
				Assert.fail();
			} 
		}
		if (Subcategory.equals("CreateEntity")) { 
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.POST, str7);
				log.debug("⏪ POST ⏩ Requested for " + url + str7);
				test.log(Status.INFO, "POST Method  ➜ " + url + str7);
			} catch (Exception e) {
				log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
				Assert.fail();
			}
		}
		if (Subcategory.equals("CreateEntitySubType")) { 
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.POST, str8 );
				log.debug("⏪ POST ⏩ Requested for " + url + str8);
				test.log(Status.INFO, "POST Method  ➜ " + url + str8);
			} catch (Exception e) {
				log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
				Assert.fail();
			}
		}
		if (Subcategory.equals("CreateEntitySubTypeClone")) { 
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.POST, str8 +"/Clone");
				log.debug("⏪ POST ⏩ Requested for " + url + str8+"/Clone");
				test.log(Status.INFO, "POST Method  ➜ " + url + str8+"/Clone");
			} catch (Exception e) {
				log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
				Assert.fail();
			}
		}
	}
		if (executefile.equals("ENTITIES")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str3);
					log.debug("⏪ POST ⏩ Requested for " + url + str3);
					test.log(Status.INFO, "POST Method  ➜ " + url + str3);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			 if (Subcategory.equals("Yes_Jurisdiction")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.POST, str5);
						log.debug("⏪ POST ⏩ Requested for " + url + str5);
						test.log(Status.INFO, "POST Method  ➜ " + url + str5);
						Subcategory = "BaseLine";
					} catch (Exception e) {
						log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
						Assert.fail();
					} 
				}
				if (Subcategory.equals("CreateEntity")) { 
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.POST, str7);
						log.debug("⏪ POST ⏩ Requested for " + url + str7);
						test.log(Status.INFO, "POST Method  ➜ " + url + str7);
					} catch (Exception e) {
						log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
						Assert.fail();
					}
				}
				if (Subcategory.equals("CreateEntitySubType")) { 
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.POST, str8 );
						log.debug("⏪ POST ⏩ Requested for " + url + str8);
						test.log(Status.INFO, "POST Method  ➜ " + url + str8);
					} catch (Exception e) {
						log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
						Assert.fail();
					}
				}
				if (Subcategory.equals("CreateEntities")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.POST, str9);
						log.debug("⏪ POST ⏩ Requested for " + url + str9);
						test.log(Status.INFO, "POST Method  ➜ " + url + str9);
					} catch (Exception e) {
						log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
						Assert.fail();
					}
				}
		}
}


	public static void GETresponseALL(String url, String str2, String str3, String str4, String str5, String str6,
			String str7) {
		if (executefile.equals("REGION")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.GET, str3);
				log.debug("⏪ GET_ALL ⏩ Request for " + url + str3);
				test.log(Status.INFO, "GET Method  ➜ " + url + str3);

			} catch (Exception e) {
				log.debug("Failing ! ☹...Exception occur! on GET Method in " + executefile + e);
				test.log(Status.FAIL, "Failing ! ☹...Exception occur! on GET Method in " + executefile);
				htmlreport.flush();
				Assert.fail();
			}
		}
		if (executefile.equals("USER_REGION")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.GET, str2);
				log.debug("⏪ GET_ALL ⏩ Request for " + url + str2);
				test.log(Status.INFO, "GET Method  ➜ " + url + str2);

			} catch (Exception e) {
				log.debug("Failing ! ☹...Exception occur! on GET Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access GET Method for Viewing");
				htmlreport.flush();
				Assert.fail();
			}
		}
		if (executefile.equals("JURISDICTION")) {
			if (Subcategory.equals("BaseLine")) { // complex
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str5);
					log.debug("⏪ GET_ALL ⏩ Request for " + url + str5);
					test.log(Status.INFO, "GET Method  ➜ " + url + str5);

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET Method for Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (Subcategory.equals("GetMyJurisdiction")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str6);
					log.debug("⏪ GET_ALL ⏩ Request for " + url + str6);
					test.log(Status.INFO, "GET Method  ➜ " + url + str6);

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET Method for Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
		}
		if (executefile.equals("USER_JURISDICTION")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str2);
					log.debug("⏪ POST ⏩ Requested for " + url + str2);
					test.log(Status.INFO, "GET Method  ➜ " + url + str2);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("UserID")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str2);
					log.debug("⏪ GET_ALL ⏩ Requested for " + url + str2);
					test.log(Status.INFO, "GET Method  ➜ " + url + str2);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("UserIDJurisdictionID")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str2);
					log.debug(" ⏪ GET_ALL ⏩ Requested for " + url + str2);
					test.log(Status.INFO, "GET Method  ➜ " + url + str2);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("GetByJurisdictionID")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str2);
					log.debug("⏪ GET_ALL ⏩ Requested for " + url + str2);
					test.log(Status.INFO, "GET Method  ➜ " + url + str2);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("GetMyJurisdictions")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str7);
					log.debug("⏪ GET_ALL ⏩ Requested for " + url + str7);
					test.log(Status.INFO, "GET Method  ➜ " + url + str7);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("UpdateDefaultJurisdiction")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str2);
					log.debug("⏪ GET_ALL ⏩ Requested for " + url + str2);
					test.log(Status.INFO, "GET Method  ➜ " + url + str2);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
		}
		if (executefile.equals("ENTITY_TYPE")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str7);
					log.debug("⏪ GET_ALL ⏩ Requested for " + url + str7);
					test.log(Status.INFO, "GET Method  ➜ " + url + str7);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("CreateEntity")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str7);
					log.debug("⏪ GET_ALL ⏩ Requested for " + url + str7);
					test.log(Status.INFO, "GET Method  ➜ " + url + str7);
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
		}
	}

	public static void GETresponseSPF(String url, String str2, String str3, String str4, String str5, String str6,
			String str7) {
		if (executefile.equals("REGION")) {
			if (user.equals("GlobalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str3 + "/" + uniqueidr1);
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str3 + "/" + uniqueidr1);
					test.log(Status.INFO, "GET(ID) Method  ➜ " + url + str3 + "/" + uniqueidr1);
				
				} catch (Exception e) {
					log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("RegionalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO,
							"GET(ID) Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("CompanyAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO,
							"GET(ID) Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("AccountIT")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO,
							"GET(ID) Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("Approver")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO,
							"GET(ID) Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("NormalUser")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO,
							"GET(ID) Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
		}
		if (executefile.equals("USER_REGION")) {
			if (Subcategory.equals("UserID")) {
				if (user.equals("GlobalAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						test.log(Status.PASS,
								"GET (ID) Method ➜ " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");

					} catch (Exception e) {
						log.debug(
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID in "
										+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("RegionalAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						test.log(Status.PASS,
								"GET (ID) Method ➜ " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");

					} catch (Exception e) {
						log.debug(
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID in "
										+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("CompanyAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						test.log(Status.PASS,
								"GET (ID) Method ➜ " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID "
								+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("AccountIT")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						test.log(Status.PASS,
								"GET (ID) Method ➜ " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID "
								+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("Approver")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						test.log(Status.PASS,
								"GET (ID) Method ➜ " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID "
								+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("NormalUser")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");
						test.log(Status.PASS,
								"GET (ID) Method ➜ " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID "
								+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
			}
			if (Subcategory.equals("UserIDRegionID")) {
				if (user.equals("GlobalAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + UsersID + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + UsersID + "/"
								+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS, "GET (ID) Method ➜ " + url + str4 + "/" + UsersID + "/"
								+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

					} catch (Exception e) {
						log.debug(
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID in "
										+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("RegionalAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/"
										+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7"
								+ "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS,
								"GET (ID) Method ➜ " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/"
										+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

					} catch (Exception e) {
						log.debug(
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID in "
										+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("CompanyAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + UsersID + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + UsersID + "/"
								+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS, "GET (ID) Method ➜ " + url + str4 + "/" + UsersID + "/"
								+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID "
								+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("AccountIT")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + UsersID + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + UsersID + "/"
								+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS, "GET (ID) Method ➜ " + url + str4 + "/" + UsersID + "/"
								+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID "
								+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("Approver")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/"
										+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7"
								+ "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS,
								"GET (ID) Method ➜ " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/"
										+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID "
								+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("NormalUser")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/"
										+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7"
								+ "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS,
								"GET (ID) Method ➜ " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/"
										+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID "
								+ e);
						test.log(Status.FAIL,
								"Failing ! ☹...Exception occur on GET Specific Method in UserRegion Include UserID ");
						htmlreport.flush();
						Assert.fail();
					}
				}
			}
		}
		if (executefile.equals("JURISDICTION")) {
			if (Subcategory.equals("BaseLine")) {
				if (user.equals("GlobalAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET, str5 + "/" + uniqueidj1);
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + uniqueidj1);
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("RegionalAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET, str5 + "/" + uniqueidj1);
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + uniqueidj1);
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("CompanyAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("AccountIT")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("Approver")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("NormalUser")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
			}
			if (Subcategory.equals("GetMyJurisdiction")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str5 + "/" + uniqueidj1);
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + uniqueidj1);
					test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (Subcategory.equals("GetJurisdictions")) {
				if (user.equals("GlobalAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET, str7 + "/" + uniqueidr1);
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + uniqueidr1);
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("RegionalAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str7 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("CompanyAdmin")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str7 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("AccountIT")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str7 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("Approver")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str7 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
				if (user.equals("NormalUser")) {
					try {
						httprequest.headers("Content-Type", "application/json");
						httprequest.header("Authorization", "Bearer " + token);
						httpresponse = httprequest.request(Method.GET,
								str7 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						log.debug(
								"⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
						test.log(Status.PASS, "GET (ID) Method Accomplished ( ! ) for Specific Viewing");

					} catch (Exception e) {
						log.debug("Failing ! ☹...Exception occur on Spcefic GET Request " + e);
						test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
						htmlreport.flush();
						Assert.fail();
					}
				}
			}
		}
		if (executefile.equals("USER_JURISDICTION")) {
			if (Subcategory.equals("UserID")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str6 + "/" + UsersID);
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str6 + "/" + UsersID);
					test.log(Status.INFO, "GET(ID) Method  ➜ " + url + str6 + "/" + UsersID);

				} catch (Exception e) {
					log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (Subcategory.equals("UserIDJurisdictionID")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str6 + "/" + UsersID+ "/" + uniqueidj1);
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str6 + "/" + UsersID+ "/" + uniqueidj1);
					test.log(Status.INFO, "GET(ID) Method  ➜ " + url + str6 + "/" + UsersID+ "/" + uniqueidj1);

				} catch (Exception e) {
					log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
		}
		if (executefile.equals("ENTITY_TYPE")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.GET, str7 + "/" + uniqueide1);
				log.debug("⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + uniqueide1);
				test.log(Status.INFO, "GET(ID) Method  ➜ " + url + str7 + "/" + uniqueide1);

			} catch (Exception e) {
				log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
				htmlreport.flush();
				Assert.fail();
			}
		}
		if (executefile.equals("ENTITY_SUBTYPE")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str8 + "/" + uniqueide1);
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str8 + "/" + uniqueide1);
					test.log(Status.INFO, "GET(ID) Method  ➜ " + url + str8+ "/" + uniqueide1);

				} catch (Exception e) {
					log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
			}
			}
			if (Subcategory.equals("IsVersionChangedEnabled")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str8 + "/IsVersionChangeEnabled/" + uniqueides1);
					log.debug("⏪ GET_SPF ⏩ Request for " + url + str8 + "/IsVersionChangeEnabled/" + uniqueides1);
					test.log(Status.INFO, "GET(ID) Method  ➜ " + url + str8 + "/IsVersionChangeEnabled/" + uniqueides1);

				} catch (Exception e) {
					log.debug("Failing ! ☹..Exception occur on Spcefic GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET (ID) for Specific Viewing");
					htmlreport.flush();
					Assert.fail();
			}
		}
    }
}

	public static void DELETEresponseSPF(String url, String str2, String str3, String str4, String str5, String str6,
			String str7) {
		if (executefile.equals("REGION")) {
			if (user.equals("GlobalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE, str3 + "/" + uniqueidr1);
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/" + uniqueidr1);
					test.log(Status.INFO, "DELETE Method  ➜ " + url + str3 + "/" + uniqueidr1);

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("RegionalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE,
							str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/"
							+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO,
							"DELETE Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("CompanyAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE,
							str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/"
							+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO,
							"DELETE Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("AccountIT")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE,
							str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/"
							+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO,
							"DELETE Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("Approver")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE,
							str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/"
							+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO,
							"DELETE Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("NormalUser")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE,
							str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/"
							+ "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO,
							"DELETE Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
		}
		if (executefile.equals("USER_REGION")) {
			if (user.equals("GlobalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE, str4 + "/" + UsersID + "/" + uniqueidr1);
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/" + UsersID + "/" + uniqueidr1);
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("RegionalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE, str4 + "/"
							+ "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/"
							+ "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("CompanyAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE, str4 + "/"
							+ "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/"
							+ "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("AccountIT")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE, str4 + "/"
							+ "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/"
							+ "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("Approver")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE, str4 + "/"
							+ "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/"
							+ "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("NormalUser")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE, str4 + "/"
							+ "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/"
							+ "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
		}
		if (executefile.equals("JURISDICTION")) {
			if (user.equals("GlobalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE, str5 + "/" + uniqueidj1);
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str5 + "/" + uniqueidj1);
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("RegionalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE, str5 + "/" + uniqueidj1);
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str5 + "/" + uniqueidj1);
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("CompanyAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE,
							str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str5 + "/"
							+ "ede71740-7101-4e8d-9415-0815886613e3");
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("AccountIT")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE,
							str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str5 + "/"
							+ "ede71740-7101-4e8d-9415-0815886613e3");
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("Approver")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE,
							str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str5 + "/"
							+ "ede71740-7101-4e8d-9415-0815886613e3");
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("NormalUser")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE,
							str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str5 + "/"
							+ "ede71740-7101-4e8d-9415-0815886613e3");
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
		}

		if (executefile.equals("USER_JURISDICTION")) {
			if (user.equals("GlobalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.DELETE, str6);
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str6);
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
			if (user.equals("RegionalAdmin")) {

			}
			if (user.equals("CompanyAdmin")) {

			}
			if (user.equals("AccountIT")) {

			}
			if (user.equals("Approver")) {

			}
			if (user.equals("NormalUser")) {

			}
		}
		if (executefile.equals("ENTITY_TYPE")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.DELETE, str7 + "/" + uniqueide1);
				log.debug("⏪ DELETE ⏩ Request initiated for " + url + str7 + "/" + uniqueide1);
				test.log(Status.INFO, "DELETE Method  ➜ " + url + str7 + "/" + uniqueide1);
				

			} catch (Exception e) {
				log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
				htmlreport.flush();
				Assert.fail();
			}
		}
		if (executefile.equals("ENTITY_SUBTYPE")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.DELETE, str8 + "/" + uniqueides1);
				log.debug("⏪ DELETE ⏩ Request initiated for " + url + str8 + "/" + uniqueides1);
				test.log(Status.INFO, "DELETE Method  ➜ " + url + str8 + "/" + uniqueides1);
				

			} catch (Exception e) {
				log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
				htmlreport.flush();
				Assert.fail();
			}
		}
	}

	public void PUTresponseSPF(String url, String str2, String str3, String str4, String str5, String str6,
			String str7) {
		if (executefile.equals("REGION")) {
			if (user.equals("GlobalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str3 + "/" + uniqueidr1);
					log.debug("⏪ PUT ⏩ Request for " + url + str3 + "/" + uniqueidr1);
					test.log(Status.INFO, "PUT Method  ➜ " + url + str3 + "/" + uniqueidr1);

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (user.equals("RegionalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str3 + "/" + UsersID);
					log.debug("⏪ PUT ⏩ Request for " + url + str3 + "/" + UsersID);
					test.log(Status.INFO, "PUT Method  ➜ " + url + str3 + "/" + UsersID);

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (user.equals("CompanyAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ PUT ⏩ Request for " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO, "PUT Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (user.equals("AccountIT")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ PUT ⏩ Request for " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO, "PUT Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (user.equals("Approver")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ PUT ⏩ Request for " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO, "PUT Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (user.equals("NormalUser")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					log.debug("⏪ PUT ⏩ Request for " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
					test.log(Status.INFO, "PUT Method  ➜ " + url + str3 + "/" + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
		}

		if (executefile.equals("JURISDICTION")) {
			if (user.equals("GlobalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str5 + "/" + uniqueidj1);
					log.debug("⏪ PUT ⏩ Request Intiated for " + url + str5 + "/" + uniqueidj1);
					test.log(Status.PASS,
							"PUT(ID) Method Accomplished (!) for Updating the Specific " + executefile + " Values");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (user.equals("RegionalAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str5 + "/" + uniqueidj1);
					log.debug("⏪ PUT ⏩ Request Intiated for " + url + str5 + "/" + uniqueidj1);
					test.log(Status.PASS,
							"PUT(ID) Method Accomplished (!) for Updating the Specific " + executefile + " Values");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (user.equals("CompanyAdmin")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str5 + "/" + "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
					log.debug("⏪ PUT ⏩ Request Intiated for " + url + str5 + "/"
							+ "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
					test.log(Status.PASS,
							"PUT(ID) Method Accomplished (!) for Updating the Specific " + executefile + " Values");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (user.equals("AccountIT")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str5 + "/" + "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
					log.debug("⏪ PUT ⏩ Request Intiated for " + url + str5 + "/"
							+ "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
					test.log(Status.PASS,
							"PUT(ID) Method Accomplished (!) for Updating the Specific " + executefile + " Values");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (user.equals("Approver")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str5 + "/" + "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
					log.debug("⏪ PUT ⏩ Request Intiated for " + url + str5 + "/"
							+ "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
					test.log(Status.PASS,
							"PUT(ID) Method Accomplished (!) for Updating the Specific " + executefile + " Values");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (user.equals("NormalUser")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str5 + "/" + "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
					log.debug("⏪ PUT ⏩ Request Intiated for " + url + str5 + "/"+ "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
					test.log(Status.PASS,"PUT(ID) Method Accomplished (!) for Updating the Specific " + executefile + " Values");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
		}
		if (executefile.equals("USER_JURISDICTION")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.PUT, str7 + "/" + uniqueidj1 + "/" + UsersID);
				log.debug("⏪ PUT ⏩ Request Intiated for " + url + str7 + "/" + uniqueidj1 + "/" + UsersID);
				test.log(Status.PASS,
						"PUT(ID) Method Accomplished (!) for Updating the Specific " + executefile + " Values");

			} catch (Exception e) {
				log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
				Assert.fail();
			}
		}
		if (executefile.equals("ENTITY_TYPE")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.PUT, str7);
				log.debug("⏪ PUT ⏩ Request for " + url + str7);
				test.log(Status.INFO, "PUT Method  ➜ " + url + str7);
				
			} catch (Exception e) {
				log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
				Assert.fail();
			}
		}
		if (executefile.equals("ENTITY_SUBTYPE")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str8+ "/" + uniqueides1);
					log.debug("⏪ PUT ⏩ Request for " + url + str8+ "/" + uniqueides1);
					test.log(Status.INFO, "PUT Method  ➜ " + url + str8+ "/" + uniqueides1);
					
				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			if (Subcategory.equals("StartVersionChange")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.PUT, str8+ "/StartVersionChange/" + uniqueides1);
					log.debug("⏪ PUT ⏩ Request for " + url + str8+ "/StartVersionChange/" + uniqueides1);
					test.log(Status.INFO, "PUT Method  ➜ " + url + str8+ "/StartVersionChange/" + uniqueides1);
					
				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
			
		}
	}	
}

