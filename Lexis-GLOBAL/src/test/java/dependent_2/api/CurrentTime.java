package dependent_2.api;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;

import global.api.Environment;

public class CurrentTime extends Environment {

	public static String time12() {
		try {
			f = new SimpleDateFormat("HH.mm.ss");
			currenttime12 = f.format(new Date());
			// System.out.println("Time = "+currenttime12);

		} catch (Exception e) {
			log.debug("Faling(!)...Exception occur! on Current time in Response Time " + e);
			Assert.fail();
		}
		return currenttime12;
	}

	public static void hour() {
		try {
			f = new SimpleDateFormat("H");
			currenthour = f.format(new Date());
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Hour in Response Time " + e);
			Assert.fail();
		}
	}

	public static void minute() {
		try {
			f = new SimpleDateFormat("mm");
			currentminute = f.format(new Date());
			// System.out.println("Current Minutes = "+currentminute);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Minute in Response Time " + e);
			Assert.fail();
		}
	}

	public static void second() {
		try {
			f = new SimpleDateFormat("ss");
			currentseconds = f.format(new Date());
			// System.out.println("Current Seconds = "+currentseconds);
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on Seconds in Response Time " + e);
			Assert.fail();
		}
	}

	public static void date() {
		try {
			millis = System.currentTimeMillis();
			date = new java.util.Date(millis);
		    System.out.println(date); 
		} catch (Exception e) {
			log.debug("Failing(!)...Exception occur! on CurrentDates in Response Time " + e);
            Assert.fail();
		}
	}
}