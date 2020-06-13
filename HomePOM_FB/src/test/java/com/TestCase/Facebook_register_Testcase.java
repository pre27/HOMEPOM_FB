package com.TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.Library;
import com.Pages.Facebook_register;


public class Facebook_register_Testcase extends Library  {


	@BeforeClass

	public void startapp() {

		launchApplication("chrome","https://www.facebook.com/");
	}


	@Test

	public void register() {

		Facebook_register register = new Facebook_register(driver);

		register.name("adc");

		register.surname("efg");

		register.mail("adc@gmail.com");

		register.entermail("adc@gmail.com");

		register.pwd("asd");
		
		register.dob("day", "10");

	}

@AfterClass
 public void tearup() {
	
	quit();
}





}
