package testsuite3.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import apache.api.FileIO;
import apache.api.Operation;
import dataprovider.api.DP_Base;
import global.api.Environment;

public class RuleExpression_GET_with_distinct_ID extends Environment {

	@Test(dataProvider = "ProbaseURL", dataProviderClass = DP_Base.class)
	public static void ViewSpecific_RuleExpression_ID(String url) throws IOException, InterruptedException {
		try {
			sheetname = "RuleConfig_View(ID)";
			FileIO.coreutility(sheetname);
			Operation.worksheet(url);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Delte Specific Region in Sheet Page " + e);
			Assert.fail();
		}
	}
}