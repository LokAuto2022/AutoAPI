package dataprovider.api;

import org.testng.annotations.DataProvider;

import global.api.Environment;

public class DP_Base extends Environment {
	@DataProvider(name = "ProbaseURL")
	String[] getBaseurl() {
		String[] basurl = { "https://lnmjapi.adappt.ai/" };
		return basurl;
	}

}
