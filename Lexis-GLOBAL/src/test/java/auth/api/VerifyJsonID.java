package auth.api;

import org.testng.Assert;

import global.api.Environment;
import io.restassured.path.json.JsonPath;

public class VerifyJsonID extends Environment {

	public static void fromRegionID() {
		try {
			uniqueidr1 = JsonPath.from(ActualBodyResult).get("Id");
			log.debug("Region ID is " + uniqueidr1);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on ID Generation from Json Body" + e);
			Assert.fail();
		}

	}
	public static void fromJurisdictionID() {
		try {
			uniqueidj1 = JsonPath.from(ActualBodyResult).get("Id");
			log.debug("Jurisdiction ID is " + uniqueidj1);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on ID Generation from Json Body" + e);
			Assert.fail();
		}

	}

}
