package TestBases;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
	


	    public AndroidDriver driver; // class-level driver

	    @BeforeClass
	    @Parameters({"deviceName","systemPort"})
	    public void ConfigureAppium(String dn,String sysport) throws MalformedURLException, URISyntaxException {
	        UiAutomator2Options options = new UiAutomator2Options();
	       // options.setDeviceName("emulator-5554");
	        options.setDeviceName(dn);
	        options.setApp("C:\\Users\\asran\\OneDrive\\Documents\\MyWorkSpace\\MobileV01\\src\\test\\resources\\General-Store.apk");
	        options.setCapability("chromedriverExecutable", "C:\\chromedrivers\\chromedriver-140.0.7339.82.exe");


	        // ✅ Use the class-level driver, not a new local variable
	        driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit(); // safe quit
	        }
	    }
	
	}
