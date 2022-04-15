package depend_1.api;

import org.apache.log4j.PropertyConfigurator;

import dependent_2.api.CurrentTime;
import global.api.Environment;

public class Start extends Environment{

	public static void noclient() {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		PropertyConfigurator.configure(projectpath + "\\log4j\\log4j.properties");
	}

	public static void division() {
		System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶");
		CurrentTime.date();
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★ ➜➜ "+user);
		
	}
	public static void accessedfile() {
		System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼▼▼▼");
		System.out.println("Accessed File ➨ "+executefile+".xlsx");
		
	}

}
