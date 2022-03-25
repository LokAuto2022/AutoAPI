package main.api;

import java.io.IOException;

import org.testng.Assert;

import depend_1.api.FrameSuite;
import depend_1.api.Start;
import global.api.Environment;
import io.restassured.RestAssured;

public class ExecuteAPILead extends Environment {

	public void layout_a1(String url, String str1) throws InterruptedException, IOException {
		try {
			Start.noclient();
			Start.division();
			RestAssured.baseURI = url;
			log.debug("Execution Started...[[Login Authentication]]");
			log.debug("Base-URL fetched Succeed i.e." + url);
			FrameSuite.POST_Login(url, str1);

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Only Login in layout_1 " + e);
			Assert.fail();
		}
	}

	public void View(String url, String str1, String str2, String str3, String str4, String str5, String str6,
			String str7, String str8, String str9, String str10, String str11, String str12)
			throws IOException, InterruptedException {
		try {
			Start.noclient();
			Start.division();
			RestAssured.baseURI = url;
			if (executefile.equals("Region")) {
				log.debug("Execution Started....[[GET ALL REQUEST]]_[[View all " + executefile + "s ]]");
				log.debug("Base URL fetched Succeed i.e." + url);
				FrameSuite.Region_GET_View(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("UserRegion")) {
				log.debug("Execution Started....[[GET ALL REQUEST]]_[[View all " + executefile + "s ]]");
				log.debug("Base URL fetched Succeed i.e." + url);
				FrameSuite.UserRegion_GET_View(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("Jurisdiction")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started....[[GET ALL REQUEST]]_[[View all " + executefile + "s ]]");
					log.debug("Base URL fetched Succeed i.e." + url);
					FrameSuite.Jurisdiction_GET_View(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("GetMyJurisdiction")) {
					log.debug("Execution Started....[[GET ALL REQUEST]]_[[View all " + executefile
							+ "s Espcially GetMyJurisdiction]]");
					log.debug("Base URL fetched Succeed i.e." + url);
					FrameSuite.Jurisdiction_GET_View_GetMyJurisdiction(url, str1, str2, str3, str4, str5, str6, str7);
				}
			}
			if (executefile.equals("UserJurisdiction")) {
				if (Subcategory.equals("GetMyJurisdictions")) {
					log.debug("Execution Started....[[GET ALL REQUEST]]_[[View all " + executefile
							+ "s Espcially GetMyJurisdiction]]");
					log.debug("Base URL fetched Succeed i.e." + url);
					FrameSuite.UserJurisdiction_GET_All_GetMyJurisdictions(url, str1, str2, str3, str4, str5, str6,
							str7);
				}
			}
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on GET ALL Request in layout_2 " + e);
			Assert.fail();
		}
	}

	public void Create(String url, String str1, String str2, String str3, String str4, String str5, String str6,
			String str7,String str8, String str9, String str10, String str11, String str12)
			throws InterruptedException, IOException {
		try {
			Start.noclient();
			Start.division();
			RestAssured.baseURI = url;
			if (executefile.equals("Region")) {
				log.debug("Execution Started... for POST Method in [[" + executefile + " Creation]]");
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Region_POST_Create(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("UserRegion")) {
				log.debug("Execution Started... for POST Method in [[" + executefile + " Creation]]");
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.UserRegion_POST_Create(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("Jurisdiction")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started... for POST Method in [[" + executefile + " Creation]]");
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.Jurisdiction_POST_Create(url, str1, str2, str3, str4, str5, str6, str7);
				}
			}
			if (executefile.equals("UserJurisdiction")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started... for POST Method in [[" + executefile + " Creation]]");
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserJurisdiction_POST_Create(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("GetByJurisdictionID")) {
					log.debug("Execution Started....[[POST REQUEST]]_[[" + executefile
							+ " Creation Includes GetByJurisdictionID]]");
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserJurisdiction_POST_Create_GetByJurisID(url, str1, str2, str3, str4, str5, str6, str7);
				}
			}
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on POST Request in layout_3 " + e);
			Assert.fail();
		}
	}

	public void Put(String url, String str1, String str2, String str3, String str4, String str5, String str6,
			String str7, String str8, String str9, String str10, String str11, String str12)
			throws InterruptedException, IOException {

		try {
			Start.noclient();
			Start.division();
			RestAssured.baseURI = url;
			if (executefile.equals("Region")) {
				log.debug("Execution Started....[[PUT REQUEST]]_[[Update Specific " + executefile + " Details ]]");
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Region_PUT_Update(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("Jurisdiction")) {
				log.debug("Execution Started....[[PUT REQUEST]]_[[Update Specific " + executefile
						+ " Details Includes JurisdictionID]]");
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Jurisdiction_PUT_Update(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("UserJurisdiction")) {
				log.debug("Execution Started....[[PUT REQUEST]]_[[Update Specific " + executefile
						+ " Details Includes UserID_JurisdictionID]]");
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.UserJurisdiction_PUT_Update_UserIDJurisID(url, str1, str2, str3, str4, str5, str6, str7);
			}

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on PUT Request in layout_4 " + e);
			Assert.fail();
		}
	}

	public void Delete(String url, String str1, String str2, String str3, String str4, String str5, String str6,
			String str7, String str8, String str9, String str10, String str11, String str12)
			throws InterruptedException, IOException {
		try {
			Start.noclient();
			Start.division();
			RestAssured.baseURI = url;
			if (executefile.equals("Region")) {
				log.debug("Execution Started....[[DELETE REQUEST]]_[[Delete Specific " + executefile
						+ " Includes UserID & RegionID ]]");
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Region_DELETE_Delete(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("UserRegion")) {
				if (Subcategory.equals("UserIDRegionID")) {
					log.debug("Execution Started....[[DELETE REQUEST]]_[[Delete Specific " + executefile
							+ " Includes UserID ]]");
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserRegion_DELETE_Delete_UserID_RegionID(url, str1, str2, str3, str4, str5, str6, str7);
				}
			}
			if (executefile.equals("Jurisdiction")) {
				log.debug("Execution Started....[[DELETE REQUEST]]_[[Delete Specific " + executefile
						+ " Includes JurisdictionID ]]");
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Jurisdiction_DELETE_Delete_JurisdictionID(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("UserJurisdiction")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started....[[DELETE REQUEST]]_[[Delete Specific " + executefile
							+ " Includes UserID_JurisdictionID ]]");
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserJurisdiction_DELETE_Delete(url, str1, str2, str3, str4, str5, str6, str7);
				}
			}
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on DELETE Request in layout_5 " + e);
			Assert.fail();
		}
	}

	public void View_ID(String url, String str1, String str2, String str3, String str4, String str5, String str6,
			String str7, String str8, String str9, String str10, String str11, String str12)
			throws InterruptedException, IOException {
		try {
			Start.noclient();
			Start.division();
			RestAssured.baseURI = url;
			if (executefile.equals("Region")) {
				log.debug(
						"Execution Started....[[GET SPECIFIC REQUEST]]_[[View Specific " + executefile + " Details ]]");
				log.debug("Base URL fetched Succeed i.e." + url);
				FrameSuite.Region_GET_View_Specific(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("UserRegion")) {
				if (Subcategory.equals("UserID")) {
					log.debug("Execution Started....[[GET SPECIFIC REQUEST]]_[[View Specific " + executefile
							+ " Details Includes UserID]]");
					log.debug("Base URL fetched Succeed i.e." + url);
					FrameSuite.UserRegion_GET_View_Specific_UserID(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("UserIDRegionID")) {
					log.debug("Execution Started....[[GET SPECIFIC REQUEST]]_[[View Specific " + executefile
							+ " Details Includes UserID & RegionID]]");
					log.debug("Base URL fetched Succeed i.e." + url);
					FrameSuite.UserRegion_GET_View_Specific_UserID_RegionID(url, str1, str2, str3, str4, str5, str6,
							str7);
				}
			}
			if (executefile.equals("Jurisdiction")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started....[[GET SPECIFIC REQUEST]]_[[View Specific " + executefile
							+ " Details Include JurisdictionID]]");
					log.debug("Base URL fetched Succeed i.e." + url);
					FrameSuite.Jurisdiction_GET_View_Specific_JurisID(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("GetJurisdictions")) {
					log.debug("Execution Started....[[GET SPECIFIC REQUEST]]_[[View Specific " + executefile
							+ " Details GetJurisdictions Include JurisdictionID]]");
					log.debug("Base URL fetched Succeed i.e." + url);
					FrameSuite.Jurisdiction_GET_View_Specific_JurisID_GetJurisdictions(url, str1, str2, str3, str4,
							str5, str6, str7);
				}
			}
			if (executefile.equals("UserJurisdiction")) {
				if (Subcategory.equals("UserID")) {
					log.debug("Execution Started....[[GET SPECIFIC REQUEST]]_[[View Specific " + executefile
							+ " Details Include JurisdictionID]]");
					log.debug("Base URL fetched Succeed i.e." + url);
					FrameSuite.UserJurisdiction_GET_View_Specific_UserID(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("UserIDJurisdictionID")) {
					log.debug("Execution Started....[[GET SPECIFIC REQUEST]]_[[View Specific " + executefile
							+ " Details Include JurisdictionID]]");
					log.debug("Base URL fetched Succeed i.e." + url);
					FrameSuite.UserJurisdiction_GET_View_Specific_UserIDJurisID(url, str1, str2, str3, str4, str5, str6,
							str7);
				}
			}
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on GET Specific Request in layout_6 " + e);
			Assert.fail();
		}

	}
}
