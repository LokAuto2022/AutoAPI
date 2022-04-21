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
					Assert.fail();
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
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");

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
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");

				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion includes UserIDRegionID");
					Assert.fail();
				}
			}
			if (Subcategory.equals("Add_UserRegion")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str4);
					log.debug("⏪ POST ⏩ Requested for " + url + str4);
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");

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
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
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
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
					Subcategory = "BaseLine";
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
		}
		if (executefile.equals("UserJurisdiction")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.POST, str3);
					log.debug("⏪ POST ⏩ Requested for " + url + str3);
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
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
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
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
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
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
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");

				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
		}
		if (executefile.equals("EntityType")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.POST, str7);
				log.debug("⏪ POST ⏩ Requested for " + url + str7);
				test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");

			} catch (Exception e) {
				log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
				Assert.fail();
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
				log.debug("Failing ! ☹...Exception occur! on GET Method in "+executefile + e);
				test.log(Status.FAIL, "Failing ! ☹...Exception occur! on GET Method in "+executefile);
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
					test.log(Status.PASS, "GET Method Accomplished ( ! ) for Viewing All " + executefile + "s");

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
					test.log(Status.PASS, "GET Method Accomplished ( ! ) for Viewing All " + executefile + "s");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on GET Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access GET Method for Viewing");
					htmlreport.flush();
					Assert.fail();
				}
			}
		}
		if (executefile.equals("UserJurisdiction")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str2);
					log.debug("⏪ POST ⏩ Requested for " + url + str2);
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
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
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
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
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
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
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
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
					httpresponse = httprequest.request(Method.GET, str2);
					log.debug("⏪ GET_ALL ⏩ Requested for " + url + str2);
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
		}
		if (executefile.equals("EntityType")) {
			if (Subcategory.equals("BaseLine")) {
				try {
					httprequest.headers("Content-Type", "application/json");
					httprequest.header("Authorization", "Bearer " + token);
					httpresponse = httprequest.request(Method.GET, str7);
					log.debug("⏪ GET_ALL ⏩ Requested for " + url + str7);
					test.log(Status.PASS, "POST Method Accomplished ( ! ) for New " + executefile + " Creation");
				} catch (Exception e) {
					log.debug("Failing ! ☹....Exception occur! on POST Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access POST Method for UserRegion");
					Assert.fail();
				}
			}
			if (Subcategory.equals("EntityTypeID")) {

			}

		}
	}
	public static void GETresponseSPF(String url, String str2, String str3, String str4, String str5, String str6,
			String str7) {
		if (executefile.equals("REGION")) {

		}
		if (executefile.equals("USER_REGION")) {

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
						httpresponse = httprequest.request(Method.GET, str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
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
						httpresponse = httprequest.request(Method.GET, str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
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
						httpresponse = httprequest.request(Method.GET, str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
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
						httpresponse = httprequest.request(Method.GET, str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
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
						httpresponse = httprequest.request(Method.GET, str7 + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
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
						httpresponse = httprequest.request(Method.GET, str7 + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
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
						httpresponse = httprequest.request(Method.GET, str7 + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
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
						httpresponse = httprequest.request(Method.GET, str7 + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
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
						httpresponse = httprequest.request(Method.GET, str7 + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
						log.debug("⏪ GET_SPF ⏩ Request for " + url + str7 + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
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
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					test.log(Status.INFO, "DELETE Method  ➜ " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");

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
					httpresponse = httprequest.request(Method.DELETE,str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					test.log(Status.INFO, "DELETE Method  ➜ " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");

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
					httpresponse = httprequest.request(Method.DELETE,str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					test.log(Status.INFO, "DELETE Method  ➜ " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");

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
					httpresponse = httprequest.request(Method.DELETE,str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					test.log(Status.INFO, "DELETE Method  ➜ " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");

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
					httpresponse = httprequest.request(Method.DELETE,str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					test.log(Status.INFO, "DELETE Method  ➜ " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");

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
					httpresponse = httprequest.request(Method.DELETE, str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
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
					httpresponse = httprequest.request(Method.DELETE, str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
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
					httpresponse = httprequest.request(Method.DELETE, str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
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
					httpresponse = httprequest.request(Method.DELETE, str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
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
					httpresponse = httprequest.request(Method.DELETE, str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str4 + "/" + "027cae79-7772-4912-965b-8a206e17eee7" + "/" + "c961bf76-5f7e-4d84-a405-dd4df02c09db");
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
					httpresponse = httprequest.request(Method.DELETE, str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
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
					httpresponse = httprequest.request(Method.DELETE, str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
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
					httpresponse = httprequest.request(Method.DELETE, str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
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
					httpresponse = httprequest.request(Method.DELETE, str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
					log.debug("⏪ DELETE ⏩ Request initiated for " + url + str5 + "/" + "ede71740-7101-4e8d-9415-0815886613e3");
					test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on DELETE Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access DELETE (ID) for Specific Deletions");
					htmlreport.flush();
					Assert.fail();
				}
			}
		}

		if (executefile.equals("UserJurisdiction")) {
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
		if (executefile.equals("EntityType")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.DELETE, str7 + "/" + UsersID);
				log.debug("⏪ DELETE ⏩ Request initiated for " + url + str7 + "/" + UsersID);
				test.log(Status.PASS, "DELETE (ID) Method Accomplished (!) for Specific Deletion");

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
					httpresponse = httprequest.request(Method.PUT, str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ PUT ⏩ Request for " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					test.log(Status.INFO, "PUT Method  ➜ " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");

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
					httpresponse = httprequest.request(Method.PUT, str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					log.debug("⏪ PUT ⏩ Request for " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");
					test.log(Status.INFO, "PUT Method  ➜ " + url + str3 + "/" + "af976921-01e1-45d1-97fc-eac917b3dc19");

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
					httpresponse = httprequest.request(Method.PUT, str3 + "/" + "5bfe0ff7-7251-451e-9ba8-e01db372c58e");
					log.debug("⏪ PUT ⏩ Request for " + url + str3 + "/" + "5bfe0ff7-7251-451e-9ba8-e01db372c58e");
					test.log(Status.INFO, "PUT Method  ➜ " + url + str3 + "/" + "5bfe0ff7-7251-451e-9ba8-e01db372c58e");

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
					httpresponse = httprequest.request(Method.PUT, str3 + "/" + "5bfe0ff7-7251-451e-9ba8-e01db372c58e");
					log.debug("⏪ PUT ⏩ Request for " + url + str3 + "/" + "5bfe0ff7-7251-451e-9ba8-e01db372c58e");
					test.log(Status.INFO, "PUT Method  ➜ " + url + str3 + "/" + "5bfe0ff7-7251-451e-9ba8-e01db372c58e");

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
					log.debug("⏪ PUT ⏩ Request Intiated for " + url + str5 + "/" + "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
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
					log.debug("⏪ PUT ⏩ Request Intiated for " + url + str5 + "/" + "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
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
					log.debug("⏪ PUT ⏩ Request Intiated for " + url + str5 + "/" + "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
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
					log.debug("⏪ PUT ⏩ Request Intiated for " + url + str5 + "/" + "f762be4a-a0a7-4e5c-8267-2cb8f633d0fb");
					test.log(Status.PASS,
							"PUT(ID) Method Accomplished (!) for Updating the Specific " + executefile + " Values");

				} catch (Exception e) {
					log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
					test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
					Assert.fail();
				}
			}
		}
		if (executefile.equals("UserJurisdiction")) {
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
		if (executefile.equals("EntityType")) {
			try {
				httprequest.headers("Content-Type", "application/json");
				httprequest.header("Authorization", "Bearer " + token);
				httpresponse = httprequest.request(Method.PUT, str7);
				log.debug("⏪ PUT ⏩ Request Intiated for " + url + str7);
				test.log(Status.PASS,
						"PUT(ID) Method Accomplished (!) for Updating the Specific " + executefile + " Values");

			} catch (Exception e) {
				log.debug("Failing ! ☹...Exception occur! on PUT Specific Request " + e);
				test.log(Status.FAIL, "FAIL, unable to access PUT Method for Update the Existing Region Value");
				Assert.fail();
			}
		}
	}
}
