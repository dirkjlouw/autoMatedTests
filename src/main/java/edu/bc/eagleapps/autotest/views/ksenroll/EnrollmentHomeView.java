package edu.bc.eagleapps.autotest.views.ksenroll;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import edu.bc.eagleapps.autotest.containers.ksenroll.EnrollmentHomeContainer;
import edu.bc.eagleapps.autotest.utils.BrowserDriver;

public class EnrollmentHomeView {

	private static final Logger LOGGER = Logger.getLogger(EnrollmentHomeView.class.getName());

	private static final EnrollmentHomeContainer enrollmentHomeContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(), EnrollmentHomeContainer.class);

	public static void isDisplayedCheck() {
		LOGGER.info("Checking Manage Course Offering Link is displayed");

		BrowserDriver.waitForElement(enrollmentHomeContainer.manageCourseOfferingLink);
		enrollmentHomeContainer.manageCourseOfferingLink.isDisplayed();
	}

	public static void clickManageCourseOfferingLink() {
		LOGGER.info("Clicking the Manage Course Offering Link");

		BrowserDriver.waitForElement(enrollmentHomeContainer.manageCourseOfferingLink);
		enrollmentHomeContainer.manageCourseOfferingLink.click();
	}

}
