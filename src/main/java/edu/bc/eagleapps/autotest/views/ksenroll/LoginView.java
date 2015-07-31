package edu.bc.eagleapps.autotest.views.ksenroll;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import edu.bc.eagleapps.autotest.containers.ksenroll.LoginPageContainer;
import edu.bc.eagleapps.autotest.utils.BrowserDriver;

public class LoginView {

	private static final Logger LOGGER = Logger.getLogger(LoginView.class.getName());

	private static final LoginPageContainer loginContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), LoginPageContainer.class);
	
	public static void login(String username, String password){
		LOGGER.info("Logging in with username:" + username + " password:" + password);

		loginContainer.usernameInput.sendKeys(username);
		loginContainer.passwordInput.sendKeys(password);
		loginContainer.submitButton.click();

		LOGGER.info("Login submitted");
	}
	
}
