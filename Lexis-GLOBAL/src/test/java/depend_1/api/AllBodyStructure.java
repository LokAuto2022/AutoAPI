package depend_1.api;

import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONObject;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import json.api.JsonProperty;
import dependent_2.api.CurrentTime;
import global.api.Environment;

public class AllBodyStructure extends Environment {

	@SuppressWarnings("unchecked")
	public void loginflexiuser() throws InterruptedException, IOException {
		try {
			requestParams = new JSONObject();
			SupportProperties.logincred();
			log.debug("Defined Credentials are " + "(( " + eusername + " ))" + "  &  " + "(( " + epassword + " ))");
			test.log(Status.INFO, "Defined Credentials are " + "(( " + eusername + " ))" + "  &  " + "(( " + epassword + " ))");
			String username = pro.getProperty(eusername);
			requestParams.put("Username", username);
			log.debug("Username Given ➜➜ " + "(" + username + ")");
			String password = pro.getProperty(epassword);
			requestParams.put("Password", password);
			log.debug("Password Given ➜➜" + "(" + password + ")");
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
			requestParams.put("Name", uniqueregionname + "_" + currenttime12);
			log.debug("RegionName Given i.e. " + uniqueregionname + "_" + currenttime12);
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
			requestParams.put("Name", updateregionname + "_" + currenttime12);
			log.debug("Updated RegionName Given i.e. " + updateregionname + "_" + currenttime12);
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

	@SuppressWarnings({ "unchecked" })
	public void creationJurisdiction() throws InterruptedException, IOException {
		try {
			requestParams = new JSONObject();
			SupportProperties.CRUDJurisdiction();
			CurrentTime.time12();
			CurrentTime.second();
			String JurisName = pro.getProperty("JurisName");
			requestParams.put("Name", JurisName + "_" + currenttime12);
			log.debug("Name Given i.e. " + JurisName + "_" + currenttime12);
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

	@SuppressWarnings({ "unchecked" })
	public void updationJurisdiction() throws InterruptedException, IOException {
		try {
			requestParams = new JSONObject();
			SupportProperties.CRUDJurisdiction();
			CurrentTime.time12();
			CurrentTime.second();

			requestParams.put("Id", uniqueidj1);
			log.debug("JurisdictionID Given i.e. " + uniqueidj1);

			String UpdateJurisName = pro.getProperty("UpdateJurisName");
			requestParams.put("Name", UpdateJurisName + "_" + currenttime12);
			log.debug("Name Given i.e. " + UpdateJurisName + "_" + currenttime12);

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void creation_UserJurisdiction() throws InterruptedException, IOException {
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
		//getmyJurisdictionID.add(UsersID);
		//getmyJurisdictionID.add(uniqueidr1);
		getmyJurisdictionID.add(uniqueidj1);
		requestParams.put("JurisdictionID", getmyJurisdictionID);
		log.debug("JurisdictionID Given i.e. " + getmyJurisdictionID);
		httprequest.body(requestParams.toJSONString());
	     //payload="[\r\n"
		//		+ "  \"string\"\r\n"
		//		+ "]";
	}
	@SuppressWarnings("unchecked")
	public void Creation_EntityType() throws InterruptedException, IOException {
		
		requestParams = new JSONObject();
		SupportProperties.CRUDEntity();
		
		String EntityTypeName = pro.getProperty("CName");
		requestParams.put("Name", EntityTypeName);
		log.debug("EntityType Name Given i.e. " + EntityTypeName );
		requestParams.put("RegionId", uniqueidr1);
		log.debug("Region ID Given i.e. " + uniqueidr1 );
		httprequest.body(requestParams.toJSONString());
  }
	@SuppressWarnings("unchecked")
	public void Updation_EntityType() throws InterruptedException, IOException {
		
		requestParams = new JSONObject();
		SupportProperties.CRUDEntity();
		
		String EntityTypeKey = pro.getProperty("Key");
		requestParams.put("Key", EntityTypeKey);
		log.debug("EntityType Key Given i.e. " + EntityTypeKey );
		String EntityTypeUpName = pro.getProperty("UName");
		requestParams.put("Name", EntityTypeUpName);
		log.debug("EntityType Name Given i.e. " + EntityTypeUpName );
		requestParams.put("RegionId", uniqueidr1);
		log.debug("Region ID Given i.e. " + uniqueidr1 );
		httprequest.body(requestParams.toJSONString());
  }
}
