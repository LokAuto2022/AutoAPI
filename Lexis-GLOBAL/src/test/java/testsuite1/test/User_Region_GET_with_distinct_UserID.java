package testsuite1.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import apache.api.FileIO;
import apache.api.Operation;
import dataprovider.api.DP_Base;
import global.api.Environment;

public class User_Region_GET_with_distinct_UserID  extends Environment {
	@Test(dataProvider = "ProbaseURL", dataProviderClass = DP_Base.class)
	public static void VIEW_Specific_UserRegion_includes_UserID(String url) throws IOException, InterruptedException {
		try {
			sheetname = "UserRegion_View(ID)";
			FileIO.coreutility(sheetname);
			Operation.worksheet(url);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on View Specific UserRegion in UserID in Sheet Page " + e);
			Assert.fail();
		}
	}
}
