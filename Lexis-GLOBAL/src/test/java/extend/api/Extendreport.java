package extend.api;

import com.aventstack.extentreports.Status;

import global.api.Environment;

public class Extendreport extends Environment {

	public static void vAlid_TokenGeneration() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️Token Generated Successfully");
			test.log(Status.INFO, "✔️ Token Generated Successfully");
		} else {
			log.debug("❌Token is NOT Generated.");
			test.log(Status.INFO, "❌ Token is NOT Generated.");
		}
	}

	public static void InvAlid_TokenGeneration() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("❌ Token is NOT Generated");
			test.log(Status.INFO, "❌ Token is NOT Generated.");
		} else {
			log.debug("❌Token is NOT Generated.");
			test.log(Status.INFO, "❌ Token is NOT Generated.");
		}
	}

	public static void cReateRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Region Created Successfully");
			test.log(Status.INFO, "✔️ Region Created Successfully");
		} else {
			log.debug("❌Region is NOT Created");
			test.log(Status.INFO, "❌ Region is NOT Created");
		}
	}

	public static void vIewRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Region Viewed Successfully");
			test.log(Status.INFO, "✔️ Region Viewed Successfully");
		} else {
			log.debug("❌Region is NOT Viewed");
			test.log(Status.INFO, "❌ Region is NOT Viewed");
		}
	}

	public static void vIewSpecificRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Specific Region Viewed Successfully");
			test.log(Status.INFO, "✔️ Specific Region Viewed Successfully");
		} else {
			log.debug("❌Specific Region is NOT Viewed");
			test.log(Status.INFO, "❌ Specific Region is NOT Viewed");
		}
	}

	public static void uPdateRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Region Updated Successfully");
			test.log(Status.INFO, "✔️ Region Updated Successfully");
		} else {
			log.debug("❌Region is NOT Updated");
			test.log(Status.INFO, "❌ Region is NOT Updated");
		}
	}

	public static void dEleteRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Region Deleted Successfully");
			test.log(Status.INFO, "✔️ Region Delete Successfully");
		} else {
			log.debug("❌Region is NOT Deleted");
			test.log(Status.INFO, "❌ Region is NOT Deleted");
		}
	}
	public static void vIewUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ User-Region Viewed Successfully");
			test.log(Status.INFO, "✔️ User-Region Viewed Successfully");
		} else {
			log.debug("❌User-Region is NOT Viewed");
			test.log(Status.INFO, "❌ User-Region is NOT Viewed");
		}
	}
	public static void vIewSpecificUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Specific User-Region Viewed Successfully");
			test.log(Status.INFO, "✔️ Specific User-Region Viewed Successfully");
		} else {
			log.debug("❌Specific User-Region is NOT Viewed");
			test.log(Status.INFO, "❌ Specific User-Region is NOT Viewed");
		}
	}
	public static void aSSignUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ User-Region Assigned with Specific Region Successfully.");
			test.log(Status.INFO, "✔️ User-Region Assigned with Specific Region Successfully.");
		} else {
			log.debug("❌User-Region is NOT Assigned");
			test.log(Status.INFO, "❌ User-Region is NOT Assigned");
		}
	}
	public static void dEleteUserRegion() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ User-Region Deleted the Specific Region Successfully");
			test.log(Status.INFO, "✔️ User-Region Deleted the Specific Region Successfully");
		} else {
			log.debug("❌User-Region is NOT Deleted");
			test.log(Status.INFO, "❌ User-Region is NOT Deleted");
		}
	}
	public static void vIewJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Jurisdiction Viewed Successfully");
			test.log(Status.INFO, "✔️ Jurisdiction Viewed Successfully");
		} else {
			log.debug("❌Jurisdiction is NOT Viewed");
			test.log(Status.INFO, "❌ Jurisdiction is NOT Viewed");
		}
	}
	public static void cReateJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Jurisdiction Created Successfully");
			test.log(Status.INFO, "✔️ Jurisdiction Created Successfully");
		} else {
			log.debug("❌Jurisdiction is NOT Created");
			test.log(Status.INFO, "❌ Jurisdiction is NOT Created");
		}
	}
	public static void uPdateJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Jurisdiction Updated Successfully");
			test.log(Status.INFO, "✔️ Jurisdiction Updated Successfully");
		} else {
			log.debug("❌Jurisdiction is NOT Updated");
			test.log(Status.INFO, "❌ Jurisdiction is NOT Updated");
		}
	}
	public static void dEleteJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Jurisdiction Deleted Successfully");
			test.log(Status.INFO, "✔️ Jurisdiction Deleted Successfully");
		} else {
			log.debug("❌Jurisdiction is NOT Deleted");
			test.log(Status.INFO, "❌ Jurisdiction is NOT Deleted");
		}
	}
	public static void viewSpecificJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Specific Jurisdiction Viewed Successfully");
			test.log(Status.INFO, "✔️ Specific Jurisdiction Viewed Successfully");
		} else {
			log.debug("❌Specific Jurisdiction is NOT Viewed");
			test.log(Status.INFO, "❌ Specific Jurisdiction is NOT Viewed");
		}
	}
	public static void vIewGetMyJurisdiction() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ GetMyJurisdiction Viewed Successfully");
			test.log(Status.INFO, "✔️ GetMyJurisdiction Viewed Successfully");
		} else {
			log.debug("❌GetMyJurisdiction is NOT Viewed");
			test.log(Status.INFO, "❌ GetMyJurisdiction is NOT Viewed");
		}
	}
	public static void vIewGetJurisdictions() {
		if (extendFinalOutput.equals("Pass")) {
			log.debug("✔️ Specific GetJurisdictions Viewed Successfully");
			test.log(Status.INFO, "✔️ Specific GetJurisdictions Viewed Successfully");
		} else {
			log.debug("❌Specific GetJurisdictions is NOT Viewed");
			test.log(Status.INFO, "❌ Specific GetJurisdictions is NOT Viewed");
		}
	}

}
