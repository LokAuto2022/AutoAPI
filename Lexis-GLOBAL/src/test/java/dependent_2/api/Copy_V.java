package dependent_2.api;

import org.testng.Assert;

import global.api.Environment;

public class Copy_V extends Environment {

	//@SuppressWarnings("unused")
	public static void inClipboard() {
		
	}

	public static void inPastevRobot()   {
		try {
			//Robot rpa = new Robot();
			//rpa.keyPress(KeyEvent.VK_CONTROL);
			//rpa.keyPress(KeyEvent.VK_V);
			//rpa.keyRelease(KeyEvent.VK_CONTROL);
			//rpa.keyRelease(KeyEvent.VK_V);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Paste VIA ROBOT Techniques Area " + e);
			Assert.fail();
		}
	}

	//@SuppressWarnings("unused")
	public static void inPastefrmClipboard() throws Exception, Exception {
		try {
			//String idresult = (String) clipboard.getData(DataFlavor.stringFlavor);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Paste from Clipboard Area " + e);
			Assert.fail();
		}
	}
}
