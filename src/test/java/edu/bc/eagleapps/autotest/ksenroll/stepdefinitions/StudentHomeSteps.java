package edu.bc.eagleapps.autotest.ksenroll.stepdefinitions;

import java.util.logging.Logger;

import cucumber.api.java.en.And;
import edu.bc.eagleapps.autotest.views.ksenroll.StudentHomeView;

public class StudentHomeSteps {

	private static final Logger LOGGER = Logger.getLogger(StudentHomeSteps.class.getName());

	@And("^the Student Home Page is shown$")
	public void isStudentHomePageDisplayed() {
		LOGGER.info("Entering: the Student Home Page is shown");

		StudentHomeView.isStudentHomePageDisplayed();
	}

	@And("^I clicked the Enrollment Link$")
	public void clickEnrollmentLink() {
		LOGGER.info("Entering: I clicked the Enrollment Link");

		StudentHomeView.clickEnrollmentLink();
	}

}
