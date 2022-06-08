package extend.api;

import com.aventstack.extentreports.Status;

import global.api.Environment;

public class Extendreport extends Environment {

	public static void definedCredential() {
		if (executefile.equals("TOKEN_VALIDATION")) {
			log.debug("Defined "+Subcategory+" Inputs are " + "(( " + eusername + " ))" + "  &  " + "(( " + epassword + " ))");
			test.log(Status.INFO, "Defined " + Subcategory + " Inputs are " + "[[ " + eusername + " ]]" + " & " + "[[ "
					+ epassword + " ]]");
		}
	}
}





