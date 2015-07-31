package edu.bc.eagleapps.autotest.views.ksenroll.courseoffering;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import edu.bc.eagleapps.autotest.containers.ksenroll.courseoffering.ManageCourseOfferingContainer;
import edu.bc.eagleapps.autotest.utils.BrowserDriver;

public class ManageCourseOfferingView {

	private static final Logger LOGGER = Logger.getLogger(ManageCourseOfferingView.class.getName());

	private static final ManageCourseOfferingContainer manageCourseOfferingContainer = PageFactory
			.initElements(BrowserDriver.getCurrentDriver(), ManageCourseOfferingContainer.class);

	// Find a Course Offering

	public static void isManageCourseOfferingDisplayed() {
		LOGGER.info("Checking Course Offering search page is displayed");

		BrowserDriver.waitForElement(manageCourseOfferingContainer.courseOfferingManagementCriteriaSectionDiv);
		manageCourseOfferingContainer.courseOfferingManagementCriteriaSectionDiv.isDisplayed();
	}

	public static void enterTheTermCode(String termCode) {
		LOGGER.info("Enter the termCode:" + termCode);

		manageCourseOfferingContainer.termCodeInput.sendKeys(termCode);
	}

	public static void enterTheCourseCode(String courseCode) {
		LOGGER.info("Enter the courseCode:" + courseCode);

		manageCourseOfferingContainer.courseCodeInput.sendKeys(courseCode);
	}

	public static void clickShowButton() {
		LOGGER.info("Click the Show button");

		manageCourseOfferingContainer.showButton.click();
	}

	public static void checkShowCourseOfferingSuccess() {
		LOGGER.info("Check Show Course Offering was successful");

		BrowserDriver.waitForElement(manageCourseOfferingContainer.courseOfferingSearchResultDiv);
		manageCourseOfferingContainer.courseOfferingSearchResultDiv.isDisplayed();
	}

}
