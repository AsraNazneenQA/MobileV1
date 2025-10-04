package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductPage;
import TestBases.BaseClass;

public class ShopSelectingUnitedStates extends BaseClass {
		@Test
		public void ShopSelectingUnitedStatesTest() {
			HomePage hp = new HomePage(driver);
			// String homePage = hp.verifyHomePage();
			hp.clickCountryDropdown();
			hp.scrollToTextAndClick("United States");
			hp.enterName();
			hp.clickLetsShop();
			ProductPage pp = new ProductPage(driver);
			String products = pp.getProductPageTitle();
			System.out.println(products);
			Assert.assertEquals(products, "Products");

		}
	}

