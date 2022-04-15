package depend_1.api;

import java.io.IOException;

import auth.api.VerifyBearerToken;
import auth.api.VerifyStatusCode;
import auth.api.VerifyStatusLine;
import global.api.Environment;

public class PrePostRequest extends Environment{

	@SuppressWarnings("static-access")
	public static void tokengeneration(String url, String str1) throws InterruptedException, IOException {
		withrespectto.loginflexiuser();
		referencereqresponse.PREPOSTresponse(url, str1);
		VerifyStatusCode.prePOSTensure();
		VerifyStatusLine.prePOSTensure();
		VerifyBearerToken.ensuretoken();
	}
}
