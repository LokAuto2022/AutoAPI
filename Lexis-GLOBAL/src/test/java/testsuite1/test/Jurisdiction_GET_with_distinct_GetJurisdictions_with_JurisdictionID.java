package testsuite1.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import apache.api.FileIO;
import apache.api.Operation;
import dataprovider.api.DP_Base;
import global.api.Environment;

public class Jurisdiction_GET_with_distinct_GetJurisdictions_with_JurisdictionID extends Environment {

	@Test(dataProvider = "ProbaseURL", dataProviderClass = DP_Base.class)
	public static void View_Specific_Jurisdiction_with_GetJurisdictions_using_JuristionID(String url) throws IOException, InterruptedException {
		try {
			sheetname = "Jurisdiction_View(ID)";
			FileIO.coreutility(sheetname);
			Operation.worksheet(url);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on View Specific Jurisdiction with GetMyJurisdiction in Sheet Page " + e);
			Assert.fail();
		}
	}
}