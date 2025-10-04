package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import TestBases.BaseClass;

public class ValidateToastMessage extends BaseClass {
		@Test
		public void ValidateToastMessageTest() {
			HomePage hp = new HomePage(driver);
			hp.clickLetsShop();
			String msg = hp.getToastMsg();
			System.out.println(msg);
			Assert.assertEquals(msg, "Please enter your name");
		}

	}

