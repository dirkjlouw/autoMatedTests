package edu.bc.eagleapps.autotest.views.ksenroll;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import edu.bc.eagleapps.autotest.containers.ksenroll.StudentHomeContainer;
import edu.bc.eagleapps.autotest.utils.BrowserDriver;

public class StudentHomeView {

	private static final Logger LOGGER = Logger.getLogger(StudentHomeView.class.getName());

	private static final StudentHomeContainer studentHomeContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(), StudentHomeContainer.class);
	
	public static void isStudentHomePageDisplayed() {
		LOGGER.info("Checking Enrollment Link is displayed");

		BrowserDriver.waitForElement(studentHomeContainer.enrollmentLink);
		studentHomeContainer.enrollmentLink.isDisplayed();
	}

	public static void clickEnrollmentLink() {
		LOGGER.info("Clicking the Enrollment Link");

		BrowserDriver.waitForElement(studentHomeContainer.enrollmentLink);
		studentHomeContainer.enrollmentLink.click();
	}

}
