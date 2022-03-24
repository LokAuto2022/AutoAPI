package testsuite1.test;

import java.io.IOException;

import org.testng.annotations.Test;

import apache.api.FileIO;
import apache.api.Operation;
import dataprovider.api.DP_Base;
import global.api.Environment;

public class Region_GET_View_ID extends Environment {
	@Test(dataProvider = "ProbaseURL", dataProviderClass = DP_Base.class)
	public static void VIEW_Specific_Region_using_ID(String url) throws IOException, InterruptedException {
		try {
			sheetname = "Region_View(ID)";
			FileIO.coreutility(sheetname);
			Operation.worksheet(url);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on View Specific Region in Sheet Page " + e);

		}
	}
}