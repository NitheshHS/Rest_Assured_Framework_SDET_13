package com.ty.rmgyantra.genericlib;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseClass {
	public DataBaseUtilities dbLib = new DataBaseUtilities();
	
	@BeforeSuite
	public void configBS() {

		baseURI ="http://localhost:8084";
		dbLib.connectToDB();
	}
	
	@AfterSuite
	public void configAS() throws Throwable {
		dbLib.closeDb();
	}

}
