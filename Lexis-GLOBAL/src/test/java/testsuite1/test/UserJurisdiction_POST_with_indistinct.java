package testsuite1.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import apache.api.FileIO;
import apache.api.Operation;
import dataprovider.api.DP_Base;
import global.api.Environment;

public class UserJurisdiction_POST_with_indistinct extends Environment {

	@Test(dataProvider = "ProbaseURL", dataProviderClass = DP_Base.class)
	public static void Create_UserJurisdiction_depend_with_Region_ID(String url) throws IOException, InterruptedException {
		try {
			sheetname = "UserJurisdiction_Create";
			FileIO.coreutility(sheetname);
			Operation.worksheet(url);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on UserJurisdiction POST in Stage 1 " + e);
			Assert.fail();
		}
	}
}