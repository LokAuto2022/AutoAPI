package main.api;

import java.io.IOException;

import org.testng.Assert;

import depend_1.api.FrameSuite;
import depend_1.api.Start;
import global.api.Environment;
import io.restassured.RestAssured;

public class ExecuteAPILead extends Environment {

	public void allUsersValidation(String url, String str1) throws InterruptedException, IOException {
		try {
			Start.noclient();
			Start.division();
			RestAssured.baseURI = url;
			log.debug("Execution Started ➜ To Validate TOKEN Generation with " +Subcategory+" Data in "+user);  
			log.debug("Base Static URL fetched Succeed i.e." + url);
			FrameSuite.POST_Login(url, str1);

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Only Login in layout_1 ", e);
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
			if (executefile.equals("REGION")) {
				log.debug("Execution Started...VIEW ALL "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Region_GET_View(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("USER_REGION")) {
				log.debug("Execution Started...VIEW ALL "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.UserRegion_GET_View(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("JURISDICTION")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started...VIEW ALL "+ executefile +" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.Jurisdiction_GET_View(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("GetMyJurisdiction")) {
					log.debug("Execution Started...VIEW ALL "+ executefile +" includes "+Subcategory+" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.Jurisdiction_GET_View_GetMyJurisdiction(url, str1, str2, str3, str4, str5, str6, str7);
				}
			}
			if (executefile.equals("USER_JURISDICTION")) {
				if (Subcategory.equals("GetMyJurisdictions")) {
					log.debug("Execution Started...VIEW ALL "+ executefile +" includes "+Subcategory+" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserJurisdiction_GET_All_GetMyJurisdictions(url, str1, str2, str3, str4, str5, str6,
							str7);
				}
			}
			if (executefile.equals("ENTITY_TYPE")) {
				log.debug("Execution Started...VIEW ALL "+ executefile +" includes "+Subcategory+" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.EntityType_GET_View(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("ENTITY_SUBTYPE")) {
				log.debug("Execution Started...VIEW ALL "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.EntitySubType_GET_View_EntityTypeID(url, str1, str2, str3, str4, str5, str6, str7);
			}
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on GET ALL Request in layout_2 " + e);
			Assert.fail();
		}
	}

	public void Create(String url, String str1, String str2, String str3, String str4, String str5, String str6,
			String str7, String str8, String str9, String str10, String str11, String str12)
					throws InterruptedException, IOException {
		try {
			Start.noclient();
			Start.division();
			RestAssured.baseURI = url;
			if (executefile.equals("REGION")) {
				log.debug("Execution Started...CREATE A NEW "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Region_POST_Create(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("USER_REGION")) {
				log.debug("Execution Started...ASSIGN SPECIFIC REGION TO "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.UserRegion_POST_Create(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("JURISDICTION")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started...CREATE A NEW "+ executefile +" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.Jurisdiction_POST_Create(url, str1, str2, str3, str4, str5, str6, str7);
				}
			}
			if (executefile.equals("USER_JURISDICTION")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started...CREATE A NEW "+ executefile +" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserJurisdiction_POST_Create(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("GetByJurisdictionID")) {
					log.debug("Execution Started...GET_BY_JURISDICTION_ID"+ executefile +" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserJurisdiction_POST_Create_GetByJurisID(url, str1, str2, str3, str4, str5, str6, str7);
				}
			}
			if (executefile.equals("ENTITY_TYPE")) {
				log.debug("Execution Started...CREATE A NEW "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.EntityType_POST_Create(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("ENTITY_SUBTYPE")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started...CREATE A NEW "+ executefile +" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.EntitySubType_POST_Create(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("Clone")) {
					log.debug("Execution Started...CREATE A NEW "+ executefile +" Clone in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.EntitySubType_POST_Create_Clone(url, str1, str2, str3, str4, str5, str6, str7);	
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
			if (executefile.equals("REGION")) {
				log.debug("Execution Started...UPDATE THE EXISTING "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Region_PUT_Update(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("JURISDICTION")) {
				log.debug("Execution Started...UPDATE THE EXISTING "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Jurisdiction_PUT_Update(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("USER_JURISDICTION")) {
				log.debug("Execution Started...UPDATE_DEFULT_JURISDICTION in "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.UserJurisdiction_PUT_UpdateDefaultJurisdiction_UserIDJurisID(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("ENTITY_TYPE")) {
				log.debug("Execution Started...UPDATE THE EXISTING "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.EntityType_PUT_Update(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("ENTITY_SUBTYPE")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started...UPDATE THE EXISTING "+ executefile +" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.EntitySubType_PUT_Update(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("StartVersionChange")) {
					log.debug("Execution Started...UPDATE THE EXISTING Version "+ executefile +" StartVersionChange in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.EntitySubType_PUT_Update_StartVersionChange(url, str1, str2, str3, str4, str5, str6, str7);
				}
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
			if (executefile.equals("REGION")) {
				log.debug("Execution Started...DELETE THE "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Region_DELETE_Delete(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("USER_REGION")) {
				if (Subcategory.equals("UserIDRegionID")) {
					log.debug("Execution Started...DELETE THE "+ executefile +" include "+Subcategory+" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserRegion_DELETE_Delete_UserID_RegionID(url, str1, str2, str3, str4, str5, str6, str7);
				}
			}
			if (executefile.equals("JURISDICTION")) {
				log.debug("Execution Started...DELETE THE "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Jurisdiction_DELETE_Delete_JurisdictionID(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("USER_JURISDICTION")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started...DELETE THE "+ executefile +" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserJurisdiction_DELETE_Delete(url, str1, str2, str3, str4, str5, str6, str7);
				}
			}
			if (executefile.equals("ENTITY_TYPE")) {
				log.debug("Execution Started...DELETE THE "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.EntityType_DELETE_Delete(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("ENTITY_SUBTYPE")) {
				log.debug("Execution Started...DELETE THE "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.EntitySubType_DELETE_Delete(url, str1, str2, str3, str4, str5, str6, str7);
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
			if (executefile.equals("REGION")) {
				log.debug("Execution Started...VIEW SPECIFIC "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.Region_GET_View_Specific(url, str1, str2, str3, str4, str5, str6, str7);
			}
			if (executefile.equals("USER_REGION")) {
				if (Subcategory.equals("UserID")) {
					log.debug("Execution Started...VIEW SPECIFIC "+ executefile +" Include "+Subcategory+ " in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserRegion_GET_View_Specific_UserID(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("UserIDRegionID")) {
					log.debug("Execution Started...VIEW SPECIFIC "+ executefile +" Include "+Subcategory+ " in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserRegion_GET_View_Specific_UserID_RegionID(url, str1, str2, str3, str4, str5, str6,str7);
				}
			}
			if (executefile.equals("JURISDICTION")) {
				if (Subcategory.equals("BaseLine")) {
					log.debug("Execution Started...VIEW SPECIFIC "+ executefile +" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.Jurisdiction_GET_View_Specific_JurisID(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("GetJurisdictions")) {
					log.debug("Execution Started...VIEW SPECIFIC "+ executefile +" includes "+Subcategory+" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.Jurisdiction_GET_View_Specific_JurisID_GetJurisdictions(url, str1, str2, str3, str4,
							str5, str6, str7);
				}
			}
			if (executefile.equals("USER_JURISDICTION")) {
				if (Subcategory.equals("UserID")) {
					log.debug("Execution Started...VIEW SPECIFIC "+ executefile +" includes "+Subcategory+" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserJurisdiction_GET_View_Specific_UserID(url, str1, str2, str3, str4, str5, str6, str7);
				}
				if (Subcategory.equals("UserIDJurisdictionID")) {
					log.debug("Execution Started...VIEW SPECIFIC "+ executefile +" includes "+Subcategory+" in "+user);
					log.debug("Base URL fetched Succeed i.e. " + url);
					FrameSuite.UserJurisdiction_GET_View_Specific_UserIDJurisID(url, str1, str2, str3, str4, str5, str6,
							str7);
				}
			}
			if (executefile.equals("ENTITY_TYPE")) {
				log.debug("Execution Started...VIEW SPECIFIC "+ executefile +" in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.EntityType_GET_View_Specific_EntityType(url, str1, str2, str3, str4, str5, str6, str7);

			}
			if (executefile.equals("ENTITY_SUBTYPE")) {
				log.debug("Execution Started...VIEW SPECIFIC "+ executefile +" IsVersionChangedEnabled in "+user);
				log.debug("Base URL fetched Succeed i.e. " + url);
				FrameSuite.EntitySubType_GET_View_Specific_IsVersionChangeEnabled(url, str1, str2, str3, str4, str5, str6, str7);

			}
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on GET Specific Request in layout_6 " + e);
			Assert.fail();
		}

	}
}
