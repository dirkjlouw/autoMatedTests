package edu.bc.eagleapps.autotest.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserDriver {

	private static WebDriver webDriver;
	
	public static WebDriver getCurrentDriver() {
		return webDriver;
	}

	public static WebElement waitForElement(WebElement elementToWaitFor){
		WebDriverWait wait = new WebDriverWait(webDriver, 10);

	    return wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
	}

	/**
	 * Configure our WebDriver to support JavaScript and be able to find the
	 * PhantomJS binary
	 */
	public static void buildDriver() {
		if (webDriver == null) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setJavascriptEnabled(true);
			capabilities.setCapability("takesScreenshot", false);
			capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
					System.getProperty(AutomatedTestConstants.PHANTOMJS_BINARY));

			webDriver = new PhantomJSDriver(capabilities);
		}

		navigateToApplication();
	}

	public static void destroyDriver() {
		webDriver.quit();
		webDriver = null;
	}

	private static void navigateToApplication() {
		webDriver.get(System.getProperty(AutomatedTestConstants.KS_ENROLL_APP_URL));
	}

}

