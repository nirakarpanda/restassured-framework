package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ReadConfigFile {
	
	private static final Properties pros = new Properties();
	static {
		
		try {
			FileInputStream fis = new FileInputStream("config/config.properties");
			pros.load(fis);
		}catch (IOException e) {
			throw new RuntimeException("Failed to load config");
			
		}
	}
	
	public static String get(String key) {
		return pros.getProperty(key);
	}

}
