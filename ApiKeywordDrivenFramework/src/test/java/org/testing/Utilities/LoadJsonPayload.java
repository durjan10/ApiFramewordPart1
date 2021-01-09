package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadJsonPayload
{
	public static String loadPayload(String JsonPayloadPath) throws FileNotFoundException
	{
		File file = new File(JsonPayloadPath);
		FileReader fr = new FileReader(file);
		JSONTokener js = new JSONTokener(fr);
		JSONObject JObj = new JSONObject(js);
		
		return JObj.toString();
		
	}

}
