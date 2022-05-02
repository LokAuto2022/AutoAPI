package depend_1.api;

import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONObject;
import org.testng.Assert;

import json.api.JsonProperty;
import dependent_2.api.CurrentTime;
import extend.api.Extendreport;
import global.api.Environment;

public class AllBodyStructure extends Environment {

	@SuppressWarnings("unchecked")
	public void loginflexiuser() throws InterruptedException, IOException {
		try {
			requestParams = new JSONObject();
			SupportProperties.logincred();
			Extendreport.definedCredential();
			String username = pro.getProperty(eusername);
			requestParams.put("Username", username);
			log.debug("Username Given ➜➜ " + "(" + username + ")");
			String password = pro.getProperty(epassword);
			requestParams.put("Password", password);
			log.debug("Password Given ➜➜" + "(" + password + ")");
			// test.log(Status.INFO, username + " and " + password);
			requestParams.put("GrantType", "Password");
			httprequest.body(requestParams.toJSONString());
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur in Username and Password Configuration! " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("unchecked")
	public void createregioninglobal() throws InterruptedException, IOException {
		try {
			requestParams = new JSONObject();
			SupportProperties.CRUDRegion();
			CurrentTime.time12();
			CurrentTime.second();
			String uniqueregionname = pro.getProperty("Name");
			requestParams.put("Name", uniqueregionname + currenttime12);
			log.debug("RegionName Given i.e. " + uniqueregionname + currenttime12);
			String uniqueregionprefix = pro.getProperty("Prefix");
			requestParams.put("Prefix", uniqueregionprefix + currentseconds);
			log.debug("Prefix Given i.e. " + uniqueregionprefix + currentseconds);
			requestParams.put("Description", pro.getProperty("Description"));
			log.debug("Description Given i.e. " + pro.getProperty("Description"));
			requestParams.put("DataCentre", pro.getProperty("DataCentre"));
			log.debug("DataCentre Given i.e. " + pro.getProperty("DataCentre"));
			requestParams.put("Hosting", pro.getProperty("Hosting"));
			log.debug("Hosting Given i.e. " + pro.getProperty("Hosting"));
			httprequest.body(requestParams.toJSONString());
			Subcategory = "BaseLine";

		} catch (Exception e) {
			log.debug("❌ Failling ! 🙁...Exception occur in Region Creation Configuration! " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("unchecked")
	public void updateregioninglobal() throws InterruptedException, IOException {
		try {
			requestParams = new JSONObject();
			SupportProperties.CRUDRegion();
			CurrentTime.time12();
			CurrentTime.second();
			String updateregionname = pro.getProperty("UpdateName");
			requestParams.put("Name", updateregionname + currenttime12);
			log.debug("Updated RegionName Given i.e. " + updateregionname + currenttime12);
			String updateregionprefix = pro.getProperty("UpdatePrefix");
			requestParams.put("Prefix", updateregionprefix + currentseconds);
			log.debug("Updated Prefix Given i.e. " + updateregionprefix + currentseconds);
			requestParams.put("Description", pro.getProperty("UpdateDescription"));
			log.debug("Updated Description Given i.e. " + pro.getProperty("UpdateDescription"));
			requestParams.put("DataCentre", pro.getProperty("UpdatedataCentre"));
			log.debug("Updated DataCentre Given i.e. " + pro.getProperty("UpdatedataCentre"));
			requestParams.put("Hosting", pro.getProperty("UpdateHosting"));
			log.debug("Updated Hosting Given i.e. " + pro.getProperty("UpdateHosting"));
			httprequest.body(requestParams.toJSONString());

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur in Region Updation Configuration! " + e);
			Assert.fail();
		}
	}

	@SuppressWarnings("unchecked")
	public void additionUserRegion() throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				requestParams = new JSONObject();
				// SupportProperties.CRUDRegion();
				// CurrentTime.time12();
				// CurrentTime.second();
				requestParams.put("UserId", UsersID);
				log.debug("UserID Given i.e. " + UsersID);
				requestParams.put("RegionId", uniqueidr1);
				log.debug("RegionID Given i.e. " + uniqueidr1);
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Add_UserRegion";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				requestParams = new JSONObject();
				// SupportProperties.CRUDRegion();
				// CurrentTime.time12();
				// CurrentTime.second();
				requestParams.put("UserId", "027cae79-7772-4912-965b-8a206e17eee7");
				log.debug("UserID Given i.e. " + "027cae79-7772-4912-965b-8a206e17eee7");
				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Add_UserRegion";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				requestParams = new JSONObject();
				// SupportProperties.CRUDRegion();
				// CurrentTime.time12();
				// CurrentTime.second();
				requestParams.put("UserId", "027cae79-7772-4912-965b-8a206e17eee7");
				log.debug("UserID Given i.e. " + "027cae79-7772-4912-965b-8a206e17eee7");
				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Add_UserRegion";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				requestParams = new JSONObject();
				// SupportProperties.CRUDRegion();
				// CurrentTime.time12();
				// CurrentTime.second();
				requestParams.put("UserId", "027cae79-7772-4912-965b-8a206e17eee7");
				log.debug("UserID Given i.e. " + "027cae79-7772-4912-965b-8a206e17eee7");
				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Add_UserRegion";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				requestParams = new JSONObject();
				// SupportProperties.CRUDRegion();
				// CurrentTime.time12();
				// CurrentTime.second();
				requestParams.put("UserId", "027cae79-7772-4912-965b-8a206e17eee7");
				log.debug("UserID Given i.e. " + "027cae79-7772-4912-965b-8a206e17eee7");
				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Add_UserRegion";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				requestParams = new JSONObject();
				// SupportProperties.CRUDRegion();
				// CurrentTime.time12();
				// CurrentTime.second();
				requestParams.put("UserId", "027cae79-7772-4912-965b-8a206e17eee7");
				log.debug("UserID Given i.e. " + "027cae79-7772-4912-965b-8a206e17eee7");
				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Add_UserRegion";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	public void creationJurisdiction() throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();
				String JurisName = pro.getProperty("JurisName");
				requestParams.put("Name", JurisName + currenttime12);
				log.debug("Name Given i.e. " + JurisName + currenttime12);
				requestParams.put("RegionId", uniqueidr1);
				log.debug("RegionID Given i.e. " + uniqueidr1);
				String Jurisprefix = pro.getProperty("JurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Yes_Jurisdiction";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();
				String JurisName = pro.getProperty("JurisName");
				requestParams.put("Name", JurisName + currenttime12);
				log.debug("Name Given i.e. " + JurisName + currenttime12);
				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				String Jurisprefix = pro.getProperty("JurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Yes_Jurisdiction";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();
				String JurisName = pro.getProperty("JurisName");
				requestParams.put("Name", JurisName + currenttime12);
				log.debug("Name Given i.e. " + JurisName + currenttime12);
				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				String Jurisprefix = pro.getProperty("JurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Yes_Jurisdiction";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();
				String JurisName = pro.getProperty("JurisName");
				requestParams.put("Name", JurisName + currenttime12);
				log.debug("Name Given i.e. " + JurisName + currenttime12);
				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				String Jurisprefix = pro.getProperty("JurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Yes_Jurisdiction";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();
				String JurisName = pro.getProperty("JurisName");
				requestParams.put("Name", JurisName + currenttime12);
				log.debug("Name Given i.e. " + JurisName + currenttime12);
				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				String Jurisprefix = pro.getProperty("JurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Yes_Jurisdiction";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();
				String JurisName = pro.getProperty("JurisName");
				requestParams.put("Name", JurisName + currenttime12);
				log.debug("Name Given i.e. " + JurisName + currenttime12);
				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				String Jurisprefix = pro.getProperty("JurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);
				httprequest.body(requestParams.toJSONString());
				Subcategory = "Yes_Jurisdiction";

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	public void updationJurisdiction() throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();

				requestParams.put("Id", uniqueidj1);
				log.debug("JurisdictionID Given i.e. " + uniqueidj1);

				String UpdateJurisName = pro.getProperty("UpdateJurisName");
				requestParams.put("Name", UpdateJurisName + currenttime12);
				log.debug("Name Given i.e. " + UpdateJurisName + currenttime12);

				requestParams.put("RegionId", uniqueidr1);
				log.debug("RegionID Given i.e. " + uniqueidr1);

				String Jurisprefix = pro.getProperty("UpdateJurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);

				httprequest.body(requestParams.toJSONString());

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("RegionalAdmin")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();

				requestParams.put("Id", uniqueidj1);
				log.debug("JurisdictionID Given i.e. " + uniqueidj1);

				String UpdateJurisName = pro.getProperty("UpdateJurisName");
				requestParams.put("Name", UpdateJurisName + currenttime12);
				log.debug("Name Given i.e. " + UpdateJurisName + currenttime12);

				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				String Jurisprefix = pro.getProperty("UpdateJurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);

				httprequest.body(requestParams.toJSONString());

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("CompanyAdmin")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();

				requestParams.put("Id", "dfa3fc4b-15ac-4e0b-a2b4-d344d22c0f61");
				log.debug("JurisdictionID Given i.e. " + "dfa3fc4b-15ac-4e0b-a2b4-d344d22c0f61");

				String UpdateJurisName = pro.getProperty("UpdateJurisName");
				requestParams.put("Name", UpdateJurisName + currenttime12);
				log.debug("Name Given i.e. " + UpdateJurisName + currenttime12);

				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				String Jurisprefix = pro.getProperty("UpdateJurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);

				httprequest.body(requestParams.toJSONString());

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("AccountIT")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();

				requestParams.put("Id", "dfa3fc4b-15ac-4e0b-a2b4-d344d22c0f61");
				log.debug("JurisdictionID Given i.e. " + "dfa3fc4b-15ac-4e0b-a2b4-d344d22c0f61");

				String UpdateJurisName = pro.getProperty("UpdateJurisName");
				requestParams.put("Name", UpdateJurisName + currenttime12);
				log.debug("Name Given i.e. " + UpdateJurisName + currenttime12);

				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				String Jurisprefix = pro.getProperty("UpdateJurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);

				httprequest.body(requestParams.toJSONString());

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("Approver")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();

				requestParams.put("Id", "dfa3fc4b-15ac-4e0b-a2b4-d344d22c0f61");
				log.debug("JurisdictionID Given i.e. " + "dfa3fc4b-15ac-4e0b-a2b4-d344d22c0f61");

				String UpdateJurisName = pro.getProperty("UpdateJurisName");
				requestParams.put("Name", UpdateJurisName + currenttime12);
				log.debug("Name Given i.e. " + UpdateJurisName + currenttime12);

				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				String Jurisprefix = pro.getProperty("UpdateJurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);

				httprequest.body(requestParams.toJSONString());

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}
		if (user.equals("NormalUser")) {
			try {
				requestParams = new JSONObject();
				SupportProperties.CRUDJurisdiction();
				CurrentTime.time12();
				CurrentTime.second();

				requestParams.put("Id", "dfa3fc4b-15ac-4e0b-a2b4-d344d22c0f61");
				log.debug("JurisdictionID Given i.e. " + "dfa3fc4b-15ac-4e0b-a2b4-d344d22c0f61");

				String UpdateJurisName = pro.getProperty("UpdateJurisName");
				requestParams.put("Name", UpdateJurisName + currenttime12);
				log.debug("Name Given i.e. " + UpdateJurisName + currenttime12);

				requestParams.put("RegionId", "480c3e49-ae9b-403e-9f1c-1a01a40e905b");
				log.debug("RegionID Given i.e. " + "480c3e49-ae9b-403e-9f1c-1a01a40e905b");

				String Jurisprefix = pro.getProperty("UpdateJurisPrefix");
				requestParams.put("Prefix", Jurisprefix + currentseconds);
				log.debug("Prefix Given i.e. " + Jurisprefix + currentseconds);

				httprequest.body(requestParams.toJSONString());

			} catch (Exception e) {
				log.debug("Failing(!)...Exception occur in Region Creation Configuration! " + e);
				Assert.fail();
			}
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void creation_UserJurisdiction() throws InterruptedException, IOException {
		if (user.equals("GlobalAdmin")) {
			requestParams = new JSONObject();
			requestParams.put("UserId", UsersID);
			log.debug("UserID Given i.e. " + UsersID);
			@JsonProperty("JurisdictionId")
			ArrayList<String> jurisdictionId = new ArrayList<String>();
			((ArrayList) jurisdictionId).add(uniqueidj1);
			requestParams.put("JurisdictionID", jurisdictionId);
			log.debug("JurisdictionID Given i.e. " + uniqueidj1);
			httprequest.body(requestParams.toJSONString());
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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void deletion_UserJurisdiction() throws InterruptedException, IOException {
		requestParams = new JSONObject();
		requestParams.put("UserId", UsersID);
		log.debug("UserID Given i.e. " + UsersID);
		@JsonProperty("JurisdictionId")
		ArrayList<String> jurisdictionId = new ArrayList<String>();
		((ArrayList) jurisdictionId).add(uniqueidj1);
		requestParams.put("JurisdictionID", jurisdictionId);
		log.debug("JurisdictionID Given i.e. " + jurisdictionId);
	    httprequest.body(requestParams.toJSONString());

	}

	@SuppressWarnings("unchecked")
	public void getmyjurisdictionID_UserJurisdiction() {
		requestParams = new JSONObject();
		@JsonProperty("MyArray")
		ArrayList<String> getmyJurisdictionID = new ArrayList<String>();
		// getmyJurisdictionID.add(UsersID);
		// getmyJurisdictionID.add(uniqueidr1);
		getmyJurisdictionID.add(uniqueidj1);
		requestParams.put("JurisdictionID", getmyJurisdictionID);
		log.debug("JurisdictionID Given i.e. " + getmyJurisdictionID);
		httprequest.body(requestParams.toJSONString());
		// payload="[\r\n"
		// + " \"string\"\r\n"
		// + "]";
	}

	@SuppressWarnings("unchecked")
	public void Creation_EntityType() throws InterruptedException, IOException {

		requestParams = new JSONObject();
		SupportProperties.CRUDEntity();

		String EntityTypeName = pro.getProperty("EntityTypeName");
		requestParams.put("Name", EntityTypeName+currenttime12);
		log.debug("EntityType Name Given i.e. " + EntityTypeName+currenttime12);
		requestParams.put("RegionId", uniqueidr1);
		log.debug("Region ID Given i.e. " + uniqueidr1);
		httprequest.body(requestParams.toJSONString());
		Subcategory="CreateEntity";
	}

	@SuppressWarnings("unchecked")
	public void Updation_EntityType() throws InterruptedException, IOException {

		requestParams = new JSONObject();
		SupportProperties.CRUDEntity();

		requestParams.put("Key", EntityKey);
		log.debug("EntityType Key Given i.e. " + EntityKey);
		String UpEntityTypeName = pro.getProperty("UpEntityTypeName");
		requestParams.put("Name", UpEntityTypeName+currenttime12);
		log.debug("EntityType Name Given i.e. " + UpEntityTypeName);
		requestParams.put("RegionId", uniqueidr1);
		log.debug("Region ID Given i.e. " + uniqueidr1);
		httprequest.body(requestParams.toJSONString());
	}
}
