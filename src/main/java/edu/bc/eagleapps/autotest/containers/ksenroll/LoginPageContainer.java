package edu.bc.eagleapps.autotest.containers.ksenroll;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageContainer {

	@FindBy(how = How.NAME, using = "loginForm")
	public WebElement loginForm;
	
	@FindBy(how = How.NAME, using = "j_username")
    public WebElement usernameInput;
	
	@FindBy(how = How.NAME, using = "j_password")
    public WebElement passwordInput;
	
	@FindBy(how = How.XPATH, using = "//input[@type=\"submit\" and @value=\"Login\"]")
    public WebElement submitButton;

}
