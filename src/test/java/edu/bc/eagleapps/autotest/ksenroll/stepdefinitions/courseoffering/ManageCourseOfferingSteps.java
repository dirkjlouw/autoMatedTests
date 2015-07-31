package edu.bc.eagleapps.autotest.ksenroll.stepdefinitions.courseoffering;

import java.util.logging.Logger;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.bc.eagleapps.autotest.views.ksenroll.EnrollmentHomeView;
import edu.bc.eagleapps.autotest.views.ksenroll.courseoffering.ManageCourseOfferingView;

public class ManageCourseOfferingSteps {

	private static final Logger LOGGER = Logger.getLogger(ManageCourseOfferingSteps.class.getName());

	@Given("^I navigate to Manage Course Offering$")
	public void clickManageCourseOfferingLink() {
		LOGGER.info("Entering: I navigate to Manage Course Offering");

		EnrollmentHomeView.clickManageCourseOfferingLink();
		ManageCourseOfferingView.isManageCourseOfferingDisplayed();
	}

	@And("^I enter the term \"([^\"]*)\"$")
	public void enterTheTermCode(String termCode) {
		LOGGER.info("Entering: I enter the term " + termCode);

		ManageCourseOfferingView.enterTheTermCode(termCode);
	}

	@And("^I enter the course \"([^\"]*)\"$")
	public void enterTheCourseCode(String courseCode) {
		LOGGER.info("Entering: I enter the course code " + courseCode);

		ManageCourseOfferingView.enterTheCourseCode(courseCode);
	}

	@When("^I click the Show button$")
	public void clickShowButton() {
		LOGGER.info("Entering: I click the Show button");

		ManageCourseOfferingView.clickShowButton();
	}

	@Then("^I should see a list of course offerings$")
	public void checkShowCourseOfferingSuccess() {
		LOGGER.info("Entering: I should see a list of course offerings");

		ManageCourseOfferingView.checkShowCourseOfferingSuccess();
	}

}
