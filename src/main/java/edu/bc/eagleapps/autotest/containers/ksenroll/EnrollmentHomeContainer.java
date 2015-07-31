package edu.bc.eagleapps.autotest.containers.ksenroll;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnrollmentHomeContainer {

	@FindBy(how = How.LINK_TEXT, using = "Manage Course Offerings")
	public WebElement manageCourseOfferingLink;

}
