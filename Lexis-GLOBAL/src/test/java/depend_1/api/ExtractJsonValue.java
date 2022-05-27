package depend_1.api;

import java.util.List;

import global.api.Environment;

public class ExtractJsonValue extends Environment {

	public static void fromResult() {
		try {
			List<String> extractid = httpresponse.jsonPath().getList("Id");
			// log.debug("JSON IDs ➞➞ "+extractid);
			log.debug("List of Users IDs ➞➞ " + extractid.size());
			UsersID = extractid.get(0);
			log.debug("Index 0 User ID ➞➞ " + UsersID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug("❌ Failling ! 🙁...Exception occur on ID Extraction from Users" + e);
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unused")
	public static void entityResult() {
		try {
			List<String> extractKey = httpresponse.jsonPath().getList("Key");
			log.debug("List of EntityKey ➞➞ " + extractKey.size());
			List<String> extractName = httpresponse.jsonPath().getList("Name");
			//log.debug("List of  EntityName ➞➞ " + extractName.size());

			String EntityKey0 = extractKey.get(0);
			String Entityname0 = extractName.get(0);
			//log.debug("Index 0 EntityKey ➞➞ " + EntityKey0);
			//log.debug("Index 0 Entityname ➞➞ " + Entityname0);
			if (EntityKey0.contains("(entityapi)")) {
				EntityKey=EntityKey0;
			}

			String EntityKey1 = extractKey.get(1);
			String Entityname1 = extractName.get(1);
			//log.debug("Index 1 EntityKey ➞➞ " + EntityKey1);
			//log.debug("Index 1 Entityname ➞➞ " + Entityname1);
			if (EntityKey1.contains("(entityapi)")) {
				EntityKey=EntityKey1;
			}

			String EntityKey2 = extractKey.get(2);
			String Entityname2 = extractName.get(2);
			//log.debug("Index 2 EntityKey ➞➞ " + EntityKey2);
			//log.debug("Index 2 Entityname ➞➞ " + Entityname2);
			if (EntityKey2.contains("(entityapi)")) {
				EntityKey=EntityKey2;
			}

			String EntityKey3 = extractKey.get(3);
			String Entityname3 = extractName.get(3);
			//log.debug("Index 3 EntityKey ➞➞ " + EntityKey3);
			//log.debug("Index 3 Entityname ➞➞ " + Entityname3);
			if (EntityKey3.contains("(entityapi)")) {
				EntityKey=EntityKey3;
			}

			String EntityKey4 = extractKey.get(4);
			String Entityname4 = extractName.get(4);
			//log.debug("Index 4 EntityKey ➞➞ " + EntityKey4);
			//log.debug("Index 4 Entityname ➞➞ " + Entityname4);
			if (EntityKey4.contains("(entityapi)")) {
				EntityKey=EntityKey4;
			}

			String EntityKey5 = extractKey.get(5);
			String Entityname5 = extractName.get(5);
			//log.debug("Index 5 EntityKey ➞➞ " + EntityKey5);
			//log.debug("Index 5 Entityname ➞➞ " + Entityname5);
			if (EntityKey5.contains("(entityapi)")) {
				EntityKey=EntityKey5;
			}

			/*
			 * String EntityKey6 = extractKey.get(6); String Entityname6 =
			 * extractName.get(6); //log.debug("Index 6 EntityKey ➞➞ " + EntityKey6);
			 * //log.debug("Index 6 Entityname ➞➞ " + Entityname6); if
			 * (EntityKey6.contains("(entityapi)")) { EntityKey=EntityKey6; }
			 */
			
			/*
			 * String EntityKey7 = extractKey.get(7); String Entityname7 =
			 * extractName.get(7); //log.debug("Index 7 EntityKey ➞➞ " + EntityKey6);
			 * //log.debug("Index 7 Entityname ➞➞ " + Entityname6); if
			 * (EntityKey7.contains("(entityapi)")) { EntityKey=EntityKey7; }
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug("❌ Failling ! 🙁...Exception occur on EntityKey Extraction from Users " + e);
			e.printStackTrace();
		}

	}

}
