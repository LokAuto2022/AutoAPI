package depend_1.api;

import java.util.List;

import global.api.Environment;

public class ExtractJsonValue extends Environment{

	public static void fromResult() {
		try {
			List<String> extractid =httpresponse.jsonPath().getList("Id");
			//log.debug("JSON IDs ➞➞ "+extractid);
			log.debug("List of Users IDs ➞➞ "+extractid.size());
			UsersID=extractid.get(0);
			log.debug("Index 0 User ID ➞➞ "+UsersID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.debug("❌ Failling ! 🙁...Exception occur on ID Extraction from Users"+e);
			e.printStackTrace();
		}
		
	}

}
