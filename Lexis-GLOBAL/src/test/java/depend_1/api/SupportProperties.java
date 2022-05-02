package depend_1.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

import global.api.Environment;

public class SupportProperties extends Environment {

	public static void logincred() throws InterruptedException, IOException {
		try {
			Thread.sleep(100);
			file = new FileInputStream(System.getProperty("user.dir") + "\\profile\\TokenAuthenticationPro.properties");
			pro = new Properties();
			pro.load(file);
			// log.debug("TestData file Loaded Succeed from Logincred.properties");

		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Login CRED PROPERTIES File Load Area " + e);
			Assert.fail();
		}
	}

	public static void CRUDRegion() throws InterruptedException, IOException {
		try {
			Thread.sleep(100);
			file = new FileInputStream(System.getProperty("user.dir") + "\\profile\\RegionPro.properties");
			pro = new Properties();
			pro.load(file);
			// log.debug("TestData file Loaded Succeed from
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on CRUD Region PROPERTIES FILE load AREA " + e);
			Assert.fail();
		}

	}
	public static void CRUDJurisdiction() throws InterruptedException, IOException {
		try {
			Thread.sleep(100);
			file = new FileInputStream(System.getProperty("user.dir") + "\\profile\\JurisdictionPro.properties");
			pro = new Properties();
			pro.load(file);
			// log.debug("TestData file Loaded Succeed from
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on CRUD Jurisdiction PROPERTIES FILE load AREA " + e);
			Assert.fail();
		}

	}
	public static void CRUDEntity() throws InterruptedException, IOException {
		try {
			Thread.sleep(100);
			file = new FileInputStream(System.getProperty("user.dir") + "\\profile\\EntityPro.properties");
			pro = new Properties();
			pro.load(file);
			// log.debug("TestData file Loaded Succeed from
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on CRUD EntityPro PROPERTIES FILE load AREA " + e);
			Assert.fail();
		}

	}
	
}