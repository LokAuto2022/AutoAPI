package depend_1.api;

import java.util.List;

import global.api.Environment;

public class ExtractJsonValue extends Environment{

	public static void fromResult() {
		List<String> extractid =httpresponse.jsonPath().getList("Id");
		//log.debug("JSON IDs ➞➞ "+extractid);
		log.debug("List of Users IDs ➞➞ "+extractid.size());
		UsersID=extractid.get(2);
		log.debug("Specific User ID ➞➞ "+UsersID +"-(Index 2)");
		
	}

}
