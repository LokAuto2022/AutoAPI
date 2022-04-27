package extend.api;

import com.aventstack.extentreports.Status;

import global.api.Environment;

public class Resultantreport extends Environment {

	public static void vAlid_TokenGeneration() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug(" ✔️✔️👍🏽  Token Generated Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Token Generated Successfully in "+user);
		} else {
			log.debug("❌👎 Token is NOT Generated in "+user);
			test.log(Status.INFO, "❌👎 Token is NOT Generated in "+user);
		}
	}

	public static void InvAlid_TokenGeneration() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("❌👎 Token is NOT Generated in "+user);
			test.log(Status.INFO, "❌👎 Token is NOT Generated in "+user);
		} else {
			log.debug("❌👎 Token is NOT Generated in "+user);
			test.log(Status.INFO, "❌👎 Token is NOT Generated in "+user);
		}
	}

	public static void cReateRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍  Region Created Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Region Created Successfully in "+user);
			
		} else {
			log.debug("❌👎 Region is NOT Created in "+user);
			test.log(Status.INFO, "❌👎  Region is NOT Created in "+user);
		}
	}

	public static void vIewRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Region Viewed Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Region Viewed Successfully in "+user);
		} else {
			log.debug("❌👎 Region is NOT Viewed in "+user);
			test.log(Status.INFO, "❌👎 Region is NOT Viewed in "+user);
		}
	}

	public static void vIewSpecificRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Specific Region Viewed Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Specific Region Viewed Successfully in "+user);
		} else {
			log.debug("❌👎 Specific Region is NOT Viewed in "+user);
			test.log(Status.INFO, "❌👎 Specific Region is NOT Viewed in "+user);
		}
	}

	public static void uPdateRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Region Updated Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Region Updated Successfully in "+user);
		} else {
			log.debug("❌👎 Region is NOT Updated"+user);
			test.log(Status.INFO, "❌👎  Region is NOT Updated"+user);
		}
	}

	public static void dEleteRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Region Deleted Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Region Delete Successfully in "+user);
		} else {
			log.debug("❌👎 Region is NOT Deleted in "+user);
			test.log(Status.INFO, "❌👎 Region is NOT Deleted in "+user);
		}
	}

	public static void vIewUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 User-Region Viewed Successfully in "+user);
			test.log(Status.INFO, "✔️👍 User-Region Viewed Successfully in "+user);
		} else {
			log.debug("❌👎 User-Region is NOT Viewed in "+user);
			test.log(Status.INFO, "❌👎 User-Region is NOT Viewed in "+user);
		}
	}

	public static void vIewSpecificUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Specific User-Region Viewed Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Specific User-Region Viewed Successfully in "+user);
		} else {
			log.debug("❌👎 Specific User-Region is NOT Viewed in "+user);
			test.log(Status.INFO, "❌👎 Specific User-Region is NOT Viewed in "+user);
		}
	}

	public static void aSSignUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 User-Region Assigned with Specific Region Successfully in "+user);
			test.log(Status.INFO, "✔️👍 User-Region Assigned with Specific Region Successfully in "+user);
		} else {
			log.debug("❌👎 User-Region is NOT Assigned in "+user);
			test.log(Status.INFO, "❌👎 User-Region is NOT Assigned in "+user);
		}
	}

	public static void dEleteUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Deleted the Specific Region in UserRegion Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Deleted the Specific Region in UserRegion Successfully in "+user);
		} else {
			log.debug("❌👎 Specific Region is NOT Deleted in UserRegion "+user);
			test.log(Status.INFO, "❌👎 User-Region is NOT Deleted in UserRegion "+user);
		}
	}

	public static void vIewJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Jurisdiction Viewed Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Jurisdiction Viewed Successfully in "+user);
		} else {
			log.debug("❌👎 Jurisdiction is NOT Viewed  in "+user);
			test.log(Status.INFO, "❌👎 Jurisdiction is NOT Viewed in "+user);
		}
	}

	public static void cReateJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Jurisdiction Created Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Jurisdiction Created Successfully in "+user);
		} else {
			log.debug("❌👎 Jurisdiction is NOT Created in "+user);
			test.log(Status.INFO, "❌👎 Jurisdiction is NOT Created in "+user);
		}
	}

	public static void uPdateJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Jurisdiction Updated Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Jurisdiction Updated Successfully in "+user);
		} else {
			log.debug("❌👎 Jurisdiction is NOT Updated in "+user);
			test.log(Status.INFO, "❌👎 Jurisdiction is NOT Updated in "+user);
		}
	}

	public static void dEleteJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Jurisdiction Deleted Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Jurisdiction Deleted Successfully in "+user);
		} else {
			log.debug("❌👎 Jurisdiction is NOT Deleted in "+user);
			test.log(Status.INFO, "❌👎 Jurisdiction is NOT Deleted in "+user);
		}
	}

	public static void viewSpecificJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Specific Jurisdiction Viewed Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Specific Jurisdiction Viewed Successfully in "+user);
		} else {
			log.debug("❌👎 Specific Jurisdiction is NOT Viewed in "+user);
			test.log(Status.INFO, "❌👎 Specific Jurisdiction is NOT Viewed in "+user);
		}
	}

	public static void vIewGetMyJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 GetMyJurisdiction Viewed Successfully in "+user);
			test.log(Status.INFO, "✔️👍 GetMyJurisdiction Viewed Successfully in "+user);
		} else {
			log.debug("❌👎 GetMyJurisdiction is NOT Viewed in "+user);
			test.log(Status.INFO, "❌👎 GetMyJurisdiction is NOT Viewed in "+user);
		}
	}

	public static void vIewGetJurisdictions() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️👍 Specific GetJurisdictions Viewed Successfully in "+user);
			test.log(Status.INFO, "✔️👍 Specific GetJurisdictions Viewed Successfully in "+user);
		} else {
			log.debug("❌👎 Specific GetJurisdictions is NOT Viewed in "+user);
			test.log(Status.INFO, "❌👎 Specific GetJurisdictions is NOT Viewed in "+user);
		}
	}

}
