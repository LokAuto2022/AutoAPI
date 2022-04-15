package auth.api;

import org.testng.Assert;

import global.api.Environment;
import io.restassured.path.json.JsonPath;

public class VerifyJsonID extends Environment {

	public static void fromRegionID() {
		try {
			uniqueidr1=ActualBodyResult.replaceAll("^\"|\"$", "");                                                                                                                                                                                                                                                                                                                                                                                            
			log.debug("➜ Region ID ➞➞ "+uniqueidr1);
		} catch (Exception e) {
			log.debug("❌ Failling ! 🙁...Exception occur! on Region ID Extraction from Json Body",e);
	        e.printStackTrace();
		}
	}
	public static void fromOLDRegionID() {
		try {
			uniqueidr1 = JsonPath.from(ActualBodyResult).get("Id");
			log.debug("➜ Region ID is " + uniqueidr1);
		} catch (Exception e) {
			log.debug("❌ Failling ! 🙁...Exception occur! on Region ID Extraction from Json Body",e);
			Assert.fail();
		}
		
	}
	public static void fromJurisdictionID() {
		try {
			uniqueidj1 = JsonPath.from(ActualBodyResult).get("Id");
			log.debug("➜ Jurisdiction ID is " + uniqueidj1);
		} catch (Exception e) {
			log.debug("❌ Failling ! 🙁...Exception occur! on Jurisdiction ID Extraction from Json Body", e);
			Assert.fail();
		}

	}

}
