package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties 
{
	public static Properties properties(String URIFILEPATH) throws IOException
	{
		File file     = new File(URIFILEPATH);
		FileInputStream fis  = new FileInputStream(file);
		Properties pr  = new Properties();
		pr.load(fis);
		return pr;
		
		
	}

}
