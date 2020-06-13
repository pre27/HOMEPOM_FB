package com.TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.Library;
import com.Pages.Facebook_login;

public class Facebook_loginTestcase extends Library {
	
	Facebook_login login;
	
	@BeforeClass
	
	public void startapp() {
		
		launchApplication("chrome","https://www.facebook.com/");
		
	}
	
	
	@Test
	
	public void login() {
		
		login= new Facebook_login(driver);
		
		login.enterusername("adc@gmail.com");
		
		login.enterpassword("adc");
		
		login.submitbutton();
		
		
		
	}
	
	
	@AfterClass
	
	public void tearup() {
		
		quit();
		
	
	}
	
	
	
	
	
	
	

}
