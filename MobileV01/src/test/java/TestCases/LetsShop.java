package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductPage;
import TestBases.BaseClass;





public class LetsShop extends BaseClass {
	@Test
	public void LetsShopTest() {
		HomePage hp = new HomePage(driver);
		hp.enterName();
		hp.clickLetsShop();
		ProductPage pp = new ProductPage(driver);
		String products = pp.getProductPageTitle();
		System.out.println(products);
		Assert.assertEquals(products, "Products");
	}

}






