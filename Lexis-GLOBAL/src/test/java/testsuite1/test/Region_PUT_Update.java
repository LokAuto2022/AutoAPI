package testsuite1.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import apache.api.FileIO;
import apache.api.Operation;
import dataprovider.api.DP_Base;
import global.api.Environment;

public class Region_PUT_Update extends Environment {
	@Test(dataProvider = "ProbaseURL", dataProviderClass = DP_Base.class) 
	public static void UPDATE_Specific_Region_using_ID(String url) throws IOException, InterruptedException {
		try {
			sheetname = "Region_Update";
			FileIO.coreutility(sheetname);
			Operation.worksheet(url);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Update Specific Region in Sheet Page " + e);
			Assert.fail();
		}
	}
}