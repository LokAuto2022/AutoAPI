package apache.api;

import java.io.IOException;

import org.testng.annotations.Test;

import global.api.Environment;

public class Operation extends Environment {
	@Test
	public static void worksheet(String url) throws InterruptedException, IOException {
		for (int i = 0; i < a.size(); i++) {
			try {
				if (a.get(i).equals("GlobalAdmin")) {
					// String keyword = (String) a.get(i);
					String str1 = (String) a.get(i + 1);
					// System.out.println("str1 is" + str1);

					String str2 = (String) a.get(i + 2);
					// System.out.println("str2 is" + str2);

					String str3 = (String) a.get(i + 3);
					// System.out.println("str3 is" + str3);

					String str4 = (String) a.get(i + 4);
					// System.out.println("str4 is" + str4);

					String str5 = (String) a.get(i + 5);
					// System.out.println("str5 is" + str5);

					String str6 = (String) a.get(i + 6);
					// System.out.println("str6 is" + str6);

					String str7 = (String) a.get(i + 7);
					// System.out.println("str7 is" + str7);

					String str8 = (String) a.get(i + 8);
					// System.out.println("str8 is" + str8);

					String str9 = (String) a.get(i + 9);
					// System.out.println("str9 is" + str9);

					String str10 = (String) a.get(i + 10);
					// System.out.println("str10 is" + str10);

					String str11 = (String) a.get(i + 11);
					// System.out.println("str11 is" + str11);

					String str12 = (String) a.get(i + 12);
					// System.out.println("str12 is" + str12);

					eusername = (String) a.get(i + 13);
					// System.out.println("Username is " + eusername);

					epassword = (String) a.get(i + 14);
					// System.out.println("Password is " + epassword);

					String runmode = (String) a.get(i + 15);
					if (runmode.equals("Yes")) {
						if (sheetname.startsWith("Login")) {
							api.layout_a1(url, str1);
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
				}
			} catch (Exception e) {
				log.debug("Expection occur! in GlobalAdmin Operation" + e);
				e.printStackTrace();
			}
			try {
				if (a.get(i).equals("RegionalAdmin")) {
					// String keyword = (String) a.get(i);

					String str1 = (String) a.get(i + 1);
					// System.out.println("str1 is" + str1);

					String str2 = (String) a.get(i + 2);
					// System.out.println("str2 is" + str2);

					String str3 = (String) a.get(i + 3);
					// System.out.println("str3 is" + str3);

					String str4 = (String) a.get(i + 4);
					// System.out.println("str3 is" + str4);

					String str5 = (String) a.get(i + 5);
					// System.out.println("str4 is" + str5);

					String str6 = (String) a.get(i + 6);
					// System.out.println("str4 is" + str6);

					String str7 = (String) a.get(i + 7);
					// System.out.println("str4 is" + str7);

					String str8 = (String) a.get(i + 8);
					// System.out.println("str8 is" + str8);

					String str9 = (String) a.get(i + 9);
					// System.out.println("str9 is" + str9);

					String str10 = (String) a.get(i + 10);
					// System.out.println("str10 is" + str10);

					String str11 = (String) a.get(i + 11);
					// System.out.println("str11 is" + str11);

					String str12 = (String) a.get(i + 12);
					// System.out.println("str12 is" + str12);

					eusername = (String) a.get(i + 13);
					// System.out.println("Username is " + eusername);

					epassword = (String) a.get(i + 14);
					// System.out.println("Password is " + epassword);

					String runmode = (String) a.get(i + 15);
					if (runmode.equals("Yes")) {
						if (sheetname.startsWith("Login")) {
							api.layout_a1(url, str1);
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
				}
			} catch (Exception e) {
				log.debug("Expection occur! in RegionAdmin Operation" + e);
				e.printStackTrace();
			}
			try {
				if (a.get(i).equals("CompanyAdmin")) {
					// String keyword = (String) a.get(i);

					String str1 = (String) a.get(i + 1);
					// System.out.println("str1 is" + str1);

					String str2 = (String) a.get(i + 2);
					// System.out.println("str2 is" + str2);

					String str3 = (String) a.get(i + 3);
					// System.out.println("str3 is" + str3);

					String str4 = (String) a.get(i + 4);
					// System.out.println("str3 is" + str4);

					String str5 = (String) a.get(i + 5);
					// System.out.println("str4 is" + str5);

					String str6 = (String) a.get(i + 6);
					// System.out.println("str4 is" + str6);

					String str7 = (String) a.get(i + 7);
					// System.out.println("str4 is" + str7);

					String str8 = (String) a.get(i + 8);
					// System.out.println("str8 is" + str8);

					String str9 = (String) a.get(i + 9);
					// System.out.println("str9 is" + str9);

					String str10 = (String) a.get(i + 10);
					// System.out.println("str10 is" + str10);

					String str11 = (String) a.get(i + 11);
					// System.out.println("str11 is" + str11);

					String str12 = (String) a.get(i + 12);
					// System.out.println("str12 is" + str12);

					eusername = (String) a.get(i + 13);
					// System.out.println("Username is " + eusername);

					epassword = (String) a.get(i + 14);
					// System.out.println("Password is " + epassword);

					String runmode = (String) a.get(i + 15);

					if (runmode.equals("Yes")) {
						if (sheetname.startsWith("Login")) {
							api.layout_a1(url, str1);
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
				}
			} catch (Exception e) {
				log.debug("Expection occur! in CompanyAdmin Operation" + e);
				e.printStackTrace();
			}
			try {
				if (a.get(i).equals("Account-IT")) {
					// String keyword = (String) a.get(i);
					String str1 = (String) a.get(i + 1);
					// System.out.println("str1 is" + str1);

					String str2 = (String) a.get(i + 2);
					// System.out.println("str2 is" + str2);

					String str3 = (String) a.get(i + 3);
					// System.out.println("str3 is" + str3);

					String str4 = (String) a.get(i + 4);
					// System.out.println("str3 is" + str4);

					String str5 = (String) a.get(i + 5);
					// System.out.println("str4 is" + str5);

					String str6 = (String) a.get(i + 6);
					// System.out.println("str4 is" + str6);

					String str7 = (String) a.get(i + 7);
					// System.out.println("str4 is" + str7);

					String str8 = (String) a.get(i + 8);
					// System.out.println("str8 is" + str8);

					String str9 = (String) a.get(i + 9);
					// System.out.println("str9 is" + str9);

					String str10 = (String) a.get(i + 10);
					// System.out.println("str10 is" + str10);

					String str11 = (String) a.get(i + 11);
					// System.out.println("str11 is" + str11);

					String str12 = (String) a.get(i + 12);
					// System.out.println("str12 is" + str12);

					eusername = (String) a.get(i + 13);
					// System.out.println("Username is " + eusername);

					epassword = (String) a.get(i + 14);
					// System.out.println("Password is " + epassword);

					String runmode = (String) a.get(i + 15);
					if (runmode.equals("Yes")) {
						if (sheetname.startsWith("Login")) {
							api.layout_a1(url, str1);
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
				}
			} catch (Exception e) {
				log.debug("Expection occur! in Account IT Operation" + e);
				e.printStackTrace();
			}
		    try {
				if (a.get(i).equals("Approver")) {
					// String keyword = (String) a.get(i);
					String str1 = (String) a.get(i + 1);
					// System.out.println("str1 is" + str1);

					String str2 = (String) a.get(i + 2);
					// System.out.println("str2 is" + str2);

					String str3 = (String) a.get(i + 3);
					// System.out.println("str3 is" + str3);

					String str4 = (String) a.get(i + 4);
					// System.out.println("str3 is" + str4);

					String str5 = (String) a.get(i + 5);
					// System.out.println("str4 is" + str5);

					String str6 = (String) a.get(i + 6);
					// System.out.println("str4 is" + str6);

					String str7 = (String) a.get(i + 7);
					// System.out.println("str4 is" + str7);

					String str8 = (String) a.get(i + 8);
					// System.out.println("str8 is" + str8);

					String str9 = (String) a.get(i + 9);
					// System.out.println("str9 is" + str9);

					String str10 = (String) a.get(i + 10);
					// System.out.println("str10 is" + str10);

					String str11 = (String) a.get(i + 11);
					// System.out.println("str11 is" + str11);

					String str12 = (String) a.get(i + 12);
					// System.out.println("str12 is" + str12);

					eusername = (String) a.get(i + 13);
					// System.out.println("Username is " + eusername);

					epassword = (String) a.get(i + 14);
					// System.out.println("Password is " + epassword);

					String runmode = (String) a.get(i + 15);
					if (runmode.equals("Yes")) {
						if (sheetname.startsWith("Login")) {
							api.layout_a1(url, str1);
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
				}
			} catch (Exception e) {
				log.debug("Expection occur! in Approver Operation" + e);
				e.printStackTrace();
			}
			try {
				if (a.get(i).equals("NormalUser")) {
					// String keyword = (String) a.get(i);
					String str1 = (String) a.get(i + 1);
					// System.out.println("str1 is" + str1);

					String str2 = (String) a.get(i + 2);
					// System.out.println("str2 is" + str2);

					String str3 = (String) a.get(i + 3);
					// System.out.println("str3 is" + str3);

					String str4 = (String) a.get(i + 4);
					// System.out.println("str3 is" + str4);

					String str5 = (String) a.get(i + 5);
					// System.out.println("str4 is" + str5);

					String str6 = (String) a.get(i + 6);
					// System.out.println("str4 is" + str6);

					String str7 = (String) a.get(i + 7);
					// System.out.println("str4 is" + str7);

					String str8 = (String) a.get(i + 8);
					// System.out.println("str8 is" + str8);

					String str9 = (String) a.get(i + 9);
					// System.out.println("str9 is" + str9);

					String str10 = (String) a.get(i + 10);
					// System.out.println("str10 is" + str10);

					String str11 = (String) a.get(i + 11);
					// System.out.println("str11 is" + str11);

					String str12 = (String) a.get(i + 12);
					// System.out.println("str12 is" + str12);

					eusername = (String) a.get(i + 13);
					// System.out.println("Username is " + eusername);

					epassword = (String) a.get(i + 14);
					// System.out.println("Password is " + epassword);

					String runmode = (String) a.get(i + 15);
					if (runmode.equals("Yes")) {
						if (sheetname.startsWith("Login")) {
							api.layout_a1(url, str1);
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
				}
			} catch (Exception e) {
				log.debug("Expection occur! in Normal User Operation" + e);
				e.printStackTrace();
			}
		}
	}
}
