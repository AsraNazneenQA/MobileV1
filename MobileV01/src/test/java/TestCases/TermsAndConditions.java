package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductPage;
import TestBases.BaseClass;

public class TermsAndConditions extends BaseClass {
		@Test
		public void TermsAndConditionsTest() throws InterruptedException {
			HomePage hp = new HomePage(driver);
			hp.enterName();
			hp.clickLetsShop();
			ProductPage pp = new ProductPage(driver);

			// Scroll to Jordan Rings
			pp.scrollToText("Jordan 6 Rings");
			pp.clickAddToCart();
			pp.clickViewCart();

			CartPage cp = new CartPage(driver);
			cp.clickTCCheckBox();

			// Read terms and condition -longClickGesture
			cp.longClickTermsButton();

			String title = cp.getAlertTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Terms Of Conditions");
		}

	}

