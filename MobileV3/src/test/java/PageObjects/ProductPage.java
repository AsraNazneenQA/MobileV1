package PageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;



	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.pagefactory.AndroidFindBy;
	import org.openqa.selenium.WebElement;

	public class ProductPage extends BasePage {

		public ProductPage(AndroidDriver driver) {
			super(driver);
		}

		// locators

		@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.androidsample.generalstore:id/toolbar_title\")")
		WebElement productPageTitle;

		@AndroidFindBy(id = "com.androidsample.generalstore:id/productName")
		List<WebElement> items;

		@AndroidFindBy(id = "com.androidsample.generalstore:id/productAddCart")
		List<WebElement> addToCartButtons;

		@AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
		WebElement viewCart;

		// actions

		public String getProductPageTitle() {
			return productPageTitle.getText();
		}

		public void clickAddToCart() {

			for (int i = 0; i < items.size(); i++) {
				String productName = items.get(i).getText();
				if (productName.equalsIgnoreCase("Jordan 6 Rings")) {
					addToCartButtons.get(i).click();
					break; // stop after clicking once
				}
			}
		}

		public void clickViewCart() {
			viewCart.click();

		}

	}