package testsuite1.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import apache.api.FileIO;
import apache.api.Operation;
import dataprovider.api.DP_Base;
import global.api.Environment;

public class UserJurisdiction_PUT_with_distinct_UpdateDefaultJurisdiction_with_JurisdictionID_UserID extends Environment {

	@Test(dataProvider = "ProbaseURL", dataProviderClass = DP_Base.class)
	public static void View_Specific_UserJurisdiction_UpdateDefaultJurisdiction_using_JurisdictionID_UserID(String url) throws IOException, InterruptedException {
		try {
			sheetname = "UserJurisdiction_Update";
			FileIO.coreutility(sheetname);
			Operation.worksheet(url);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Delte Specific Region in Sheet Page " + e);
			Assert.fail();
		}
	}
}