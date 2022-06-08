package apache.api;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import global.api.Environment;

public class Operation extends Environment {
	@Test
	public static void worksheet(String url) throws InterruptedException, IOException {
		try {
			for (int i = 0; i < a.size(); i++) {
				Shuffle.globalAdmin(url, i);
				Shuffle.regionalAdmin(url, i);
				Shuffle.companyAdmin(url, i);
				Shuffle.accountIT(url, i);
				Shuffle.approver(url, i);
				Shuffle.normalUser(url, i);
			}
		} catch (Exception e) {
			log.debug("Failing !☹...Exception occur! on Operation in Shuffle " + e);
			e.printStackTrace();
			Assert.fail();
		}
	}
}



