package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import TestBases.BaseClass;
import io.appium.java_client.android.AndroidDriver;

public class LaunchApp extends BaseClass {
@Test
	public void LaunchAppTest () {
		
		
		
			HomePage hp = new HomePage(driver);
		String homepage= hp.verifyHomePage();
		System.out.println(homepage);
		 Assert.assertEquals(homepage, "Enter name here");
		
	}
	
}
