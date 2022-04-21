package testsuite1.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import apache.api.FileIO;
import apache.api.Operation;
import dataprovider.api.DP_Base;
import global.api.Environment;

public class Token_Validation_Valid extends Environment {

	@Test(dataProvider = "ProbaseURL", dataProviderClass = DP_Base.class)
	public static void All_USER_LOGIN_Validation(String url) throws IOException, InterruptedException {
		try {
			sheetname = "Login_Valid";
			FileIO.coreutility(sheetname);
			Operation.worksheet(url);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! ON All User Login Validation Sheet Page " + e);
			Assert.fail();
		}
	}
}