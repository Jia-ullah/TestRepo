package com.testvagrant.codetest.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigInfo {
	
	public Properties configFile;
	
	public void configData() throws IOException{
		File file = new File(System.getProperty("user.dir")+"/config/config.properties");
		FileInputStream fis = new FileInputStream(file);
		configFile = new Properties();
		configFile.load(fis);
	}

}
