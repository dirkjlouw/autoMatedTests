package edu.bc.eagleapps.autotest.ksenroll.stepdefinitions;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.logging.Logger;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import edu.bc.eagleapps.autotest.utils.AutomatedTestConstants;
import edu.bc.eagleapps.autotest.utils.BrowserDriver;
import edu.bc.eagleapps.autotest.views.ksenroll.LoginView;

public class LoginSteps {

	private static final Logger LOGGER = Logger.getLogger(LoginSteps.class.getName());
	
	@Before({ "@requires_browser" })
	public void buildDriver() {
		String phantomJSBinary = System.getProperty(AutomatedTestConstants.PHANTOMJS_BINARY);
		assertNotNull(phantomJSBinary);
		assertTrue(new File(phantomJSBinary).exists());

		String ksenrollAppURL = System.getProperty(AutomatedTestConstants.KS_ENROLL_APP_URL);
		assertNotNull(ksenrollAppURL);

		BrowserDriver.buildDriver();
	}

	@After({ "@requires_browser" })
	public void destroyDriver() {
		BrowserDriver.destroyDriver();
	}

	@Given("^I sign in as \"([^\"]*)\"$")
	public void loginWithUser(String username) {
		LOGGER.info("Entering: I sign in as " + username);

		LoginView.login(username, username);
	}

}
