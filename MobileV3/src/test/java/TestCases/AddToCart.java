package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductPage;
import TestBases.BaseClass;

public class AddToCart extends BaseClass {
		@Test
		public void AddToCartTest() throws InterruptedException {
			HomePage hp = new HomePage(driver);
			hp.enterName();
			hp.clickLetsShop();
			ProductPage pp = new ProductPage(driver);

			// Scroll to Jordan Rings
			pp.scrollToText("Jordan 6 Rings");
			pp.clickAddToCart();
			pp.clickViewCart();

			CartPage cp = new CartPage(driver);
			String lastPageProduct = cp.getAddedproductName();
			System.out.println(lastPageProduct);
			Assert.assertEquals(lastPageProduct, "Jordan 6 Rings");
		}

	}


