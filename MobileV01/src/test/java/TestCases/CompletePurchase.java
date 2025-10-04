package TestCases;

import java.util.Set;

import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.FinalPurchasePage;
import PageObjects.HomePage;
import PageObjects.ProductPage;
import TestBases.BaseClass;

public class CompletePurchase extends BaseClass {
		@Test
		public void CompletePurchaseTest() throws InterruptedException {
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
			// click on complete purchase , will take to web view
			cp.clickVisitToWeb();
			Thread.sleep(30000);

			FinalPurchasePage fpg = new FinalPurchasePage(driver);

			// code to switch to web view and then to App view

			Set<String> contexts = driver.getContextHandles();
			for (String contextName : contexts) {
				System.out.println(contextName);
			}

			fpg.switchContext("WEBVIEW_com.androidsample.generalstore");
			fpg.setText();
			fpg.pressBack(); // pressBack() is defined in base class and page object class is extending base
								// class
			fpg.switchContext("NATIVE_APP");
		}
	}


