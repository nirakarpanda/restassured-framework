package api.base;

import org.testng.annotations.BeforeClass;

import config.ReadConfigFile;
import io.restassured.RestAssured;

public class Base {
	
	@BeforeClass
	public void setUp() {
		RestAssured.baseURI=ReadConfigFile.get("baseUrl");
	}

}
