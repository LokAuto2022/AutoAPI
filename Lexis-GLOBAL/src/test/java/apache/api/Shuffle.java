package apache.api;

import global.api.Environment;

public class Shuffle extends Environment {

	public static void globalAdmin(String url, int i) {
		try {
			if (a.get(i).equals("GlobalAdmin")) {
				user = (String) a.get(i);
				// System.out.println(user);
				str1 = (String) a.get(i + 1);
				// System.out.println("str1 is " + str1);

				str2 = (String) a.get(i + 2);
				// System.out.println("str2 is " + str2);

				str3 = (String) a.get(i + 3);
				// System.out.println("str3 is " + str3);

				str4 = (String) a.get(i + 4);
				// System.out.println("str4 is " + str4);

				str5 = (String) a.get(i + 5);
				// System.out.println("str5 is " + str5);

				str6 = (String) a.get(i + 6);
				// System.out.println("str6 is " + str6);

				str7 = (String) a.get(i + 7);
				// System.out.println("str7 is " + str7);

				str8 = (String) a.get(i + 8);
				// System.out.println("str8 is " + str8);

				str9 = (String) a.get(i + 9);
				// System.out.println("str9 is " + str9);

				str10 = (String) a.get(i + 10);
				// System.out.println("str10 is " + str10);

				str11 = (String) a.get(i + 11);
				// System.out.println("str11 is " + str11);

				str12 = (String) a.get(i + 12);
				// System.out.println("str12 is " + str12);

				eusername = (String) a.get(i + 13);
				// System.out.println("Username is " + eusername);

				epassword = (String) a.get(i + 14);
				// System.out.println("Password is " + epassword);

				String runmode = (String) a.get(i + 15);
				// System.out.println("Runmode is " + runmode);
				if (runmode.equals("Yes")) {
					if (sheetname.startsWith("Login")) {
						api.allUsersValidation(url, str1);
					}
					if (sheetname.endsWith("Create")) {
						api.Create(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("View")) {
						api.View(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("View(ID)")) {
						api.View_ID(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Update")) {
						api.Put(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Delete")) {
						api.Delete(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
				}
				if (runmode.equals("No")) {
					System.err.println("Flag switched -OFF- for GlobalAdmin");
				}
			}
		} catch (Exception e) {
			log.debug("Expection occur! in GlobalAdmin Operation" + e);
			e.printStackTrace();
		}
	}

	public static void regionalAdmin(String url, int i) {
		try {
			if (a.get(i).equals("RegionalAdmin")) {
				user = (String) a.get(i);
				// System.out.println(user);
				str1 = (String) a.get(i + 1);
				//System.out.println("str1 is " + str1);

				str2 = (String) a.get(i + 2);
				//System.out.println("str2 is " + str2);

				str3 = (String) a.get(i + 3);
				//System.out.println("str3 is " + str3);

				str4 = (String) a.get(i + 4);
				//System.out.println("str4 is " + str4);

				str5 = (String) a.get(i + 5);
				//System.out.println("str5 is " + str5);

				str6 = (String) a.get(i + 6);
				//System.out.println("str6 is " + str6);

				str7 = (String) a.get(i + 7);
				//System.out.println("str7 is " + str7);

				str8 = (String) a.get(i + 8);
				//System.out.println("str8 is " + str8);

				str9 = (String) a.get(i + 9);
				//System.out.println("str9 is " + str9);

				str10 = (String) a.get(i + 10);
				//System.out.println("str10 is " + str10);

				str11 = (String) a.get(i + 11);
				//System.out.println("str11 is " + str11);

				str12 = (String) a.get(i + 12);
				//System.out.println("str12 is " + str12);

				eusername = (String) a.get(i + 13);
				//System.out.println("Username is " + eusername);

				epassword = (String) a.get(i + 14);
				//System.out.println("Password is " + epassword);

				runmode = (String) a.get(i + 15);
				if (runmode.equals("Yes")) {
					if (sheetname.startsWith("Login")) {
						api.allUsersValidation(url, str1);
					}
					if (sheetname.endsWith("View")) {
						api.View(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("View(ID)")) {
						api.View_ID(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Create")) {
						api.Create(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Update")) {
						api.Put(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Delete")) {
						api.Delete(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
				}
				if (runmode.equals("No")) {
					System.err.println("Flag switched -OFF- for ReginalAdmin");
				}
			}
		} catch (Exception e) {
			log.debug("Expection occur! in RegionAdmin Operation" + e);
			e.printStackTrace();
		}
	}
    public static void companyAdmin(String url, int i) {
		try {
			if (a.get(i).equals("CompanyAdmin")) {
				user = (String) a.get(i);
				// System.out.println(user);
				str1 = (String) a.get(i + 1);
				// System.out.println("str1 is " + str1);

				str2 = (String) a.get(i + 2);
				// System.out.println("str2 is " + str2);

				str3 = (String) a.get(i + 3);
				// System.out.println("str3 is " + str3);

				str4 = (String) a.get(i + 4);
				// System.out.println("str3 is " + str4);

				str5 = (String) a.get(i + 5);
				// System.out.println("str4 is " + str5);

				str6 = (String) a.get(i + 6);
				// System.out.println("str4 is " + str6);

				str7 = (String) a.get(i + 7);
				// System.out.println("str4 is " + str7);

				str8 = (String) a.get(i + 8);
				// System.out.println("str8 is " + str8);

			    str9 = (String) a.get(i + 9);
				// System.out.println("str9 is " + str9);

				str10 = (String) a.get(i + 10);
				// System.out.println("str10 is " + str10);

				str11 = (String) a.get(i + 11);
				// System.out.println("str11 is " + str11);

				str12 = (String) a.get(i + 12);
				// System.out.println("str12 is " + str12);

				eusername = (String) a.get(i + 13);
				// System.out.println("Username is " + eusername);

				epassword = (String) a.get(i + 14);
				// System.out.println("Password is " + epassword);

				runmode = (String) a.get(i + 15);

				if (runmode.equals("Yes")) {
					if (sheetname.startsWith("Login")) {
						api.allUsersValidation(url, str1);
					}
					if (sheetname.endsWith("Create")) {
						api.Create(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("View")) {
						api.View(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("View(ID)")) {
						api.View_ID(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Update")) {
						api.Put(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Delete")) {
						api.Delete(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
				}
				if (runmode.equals("No")) {
					System.err.println("Flag switched -OFF- for CompanyAdmin");
				}
			}
		} catch (Exception e) {
			log.debug("Expection occur! in CompanyAdmin Operation" + e);
			e.printStackTrace();
		}
	}
	
	public static void accountIT(String url, int i) {
		try {
			if (a.get(i).equals("AccountIT")) {
				user = (String) a.get(i);
				// System.out.println(user);
				str1 = (String) a.get(i + 1);
				// System.out.println("str1 is" + str1);

				str2 = (String) a.get(i + 2);
				// System.out.println("str2 is" + str2);

				str3 = (String) a.get(i + 3);
				// System.out.println("str3 is" + str3);

				str4 = (String) a.get(i + 4);
				// System.out.println("str3 is" + str4);

				str5 = (String) a.get(i + 5);
				// System.out.println("str4 is" + str5);

				str6 = (String) a.get(i + 6);
				// System.out.println("str4 is" + str6);

				str7 = (String) a.get(i + 7);
				// System.out.println("str4 is" + str7);

				str8 = (String) a.get(i + 8);
				// System.out.println("str8 is" + str8);

			    str9 = (String) a.get(i + 9);
				// System.out.println("str9 is" + str9);

				str10 = (String) a.get(i + 10);
				// System.out.println("str10 is" + str10);

				str11 = (String) a.get(i + 11);
				// System.out.println("str11 is" + str11);

				str12 = (String) a.get(i + 12);
				// System.out.println("str12 is" + str12);

				eusername = (String) a.get(i + 13);
				// System.out.println("Username is " + eusername);

				epassword = (String) a.get(i + 14);
				// System.out.println("Password is " + epassword);

				runmode = (String) a.get(i + 15);

				if (runmode.equals("Yes")) {
					if (sheetname.startsWith("Login")) {
						api.allUsersValidation(url, str1);
					}
					if (sheetname.endsWith("View")) {
						api.View(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("View(ID)")) {
						api.View_ID(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Create")) {
						api.Create(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Update")) {
						api.Put(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Delete")) {
						api.Delete(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
				}
				if (runmode.equals("No")) {
					System.err.println("Flag switched -OFF- for AccountIT");
				}
			}
		} catch (Exception e) {
			log.debug("Expection occur! in CompanyAdmin Operation" + e);
			e.printStackTrace();
		}
	}

	public static void approver(String url, int i) {
		try {
			if (a.get(i).equals("Approver")) {
				user = (String) a.get(i);
				// System.out.println(user);
				str1 = (String) a.get(i + 1);
				// System.out.println("str1 is" + str1);

				str2 = (String) a.get(i + 2);
				// System.out.println("str2 is" + str2);

				str3 = (String) a.get(i + 3);
				// System.out.println("str3 is" + str3);

				str4 = (String) a.get(i + 4);
				// System.out.println("str3 is" + str4);

				str5 = (String) a.get(i + 5);
				// System.out.println("str4 is" + str5);

				str6 = (String) a.get(i + 6);
				// System.out.println("str4 is" + str6);

				str7 = (String) a.get(i + 7);
				// System.out.println("str4 is" + str7);

				str8 = (String) a.get(i + 8);
				// System.out.println("str8 is" + str8);

				str9 = (String) a.get(i + 9);
				// System.out.println("str9 is" + str9);

				str10 = (String) a.get(i + 10);
				// System.out.println("str10 is" + str10);

				str11 = (String) a.get(i + 11);
				// System.out.println("str11 is" + str11);

				str12 = (String) a.get(i + 12);
				// System.out.println("str12 is" + str12);

				eusername = (String) a.get(i + 13);
				// System.out.println("Username is " + eusername);

				epassword = (String) a.get(i + 14);
				// System.out.println("Password is " + epassword);

				String runmode = (String) a.get(i + 15);
				if (runmode.equals("Yes")) {
					if (sheetname.startsWith("Login")) {
						api.allUsersValidation(url, str1);
					}
					if (sheetname.endsWith("View")) {
						api.View(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("View(ID)")) {
						api.View_ID(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Create")) {
						api.Create(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Update")) {
						api.Put(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Delete")) {
						api.Delete(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
				}
				if (runmode.equals("No")) {
					System.err.println("Flag switched -OFF- for Approver");
				}
			}
		} catch (Exception e) {
			log.debug("Expection occur! in Approver Operation" + e);
			e.printStackTrace();
		}

	}

	public static void normalUser(String url, int i) {
		try {
			if (a.get(i).equals("NormalUser")) {
				user = (String) a.get(i);
				// System.out.println(user);
				str1 = (String) a.get(i + 1);
				// System.out.println("str1 is" + str1);

				str2 = (String) a.get(i + 2);
				// System.out.println("str2 is" + str2);

				str3 = (String) a.get(i + 3);
				// System.out.println("str3 is" + str3);

				str4 = (String) a.get(i + 4);
				// System.out.println("str3 is" + str4);

				str5 = (String) a.get(i + 5);
				// System.out.println("str4 is" + str5);

				str6 = (String) a.get(i + 6);
				// System.out.println("str4 is" + str6);

				str7 = (String) a.get(i + 7);
				// System.out.println("str4 is" + str7);

				str8 = (String) a.get(i + 8);
				// System.out.println("str8 is" + str8);

				str9 = (String) a.get(i + 9);
				// System.out.println("str9 is" + str9);

				str10 = (String) a.get(i + 10);
				// System.out.println("str10 is" + str10);

				str11 = (String) a.get(i + 11);
				// System.out.println("str11 is" + str11);

				str12 = (String) a.get(i + 12);
				// System.out.println("str12 is" + str12);

				eusername = (String) a.get(i + 13);
				// System.out.println("Username is " + eusername);

				epassword = (String) a.get(i + 14);
				// System.out.println("Password is " + epassword);

				runmode = (String) a.get(i + 15);
				if (runmode.equals("Yes")) {
					if (sheetname.startsWith("Login")) {
						api.allUsersValidation(url, str1);
					}
					if (sheetname.endsWith("View")) {
						api.View(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("View(ID)")) {
						api.View_ID(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Create")) {
						api.Create(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Update")) {
						api.Put(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
					if (sheetname.endsWith("Delete")) {
						api.Delete(url, str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
					}
				}
				if (runmode.equals("No")) {
					System.err.println("Flag switched -OFF- for NormalUser");
				}
			}
		} catch (Exception e) {
			log.debug("Expection occur! in Normal User Operation" + e);
			e.printStackTrace();
		}
	}
}
