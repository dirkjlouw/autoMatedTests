package edu.bc.eagleapps.autotest.containers.ksenroll.courseoffering;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ManageCourseOfferingContainer {

	// Find a Course Offering

	@FindBy(how = How.ID, using = "courseOfferingManagementCriteriaSection")
	public WebElement courseOfferingManagementCriteriaSectionDiv;

	@FindBy(how = How.NAME, using = "termCode")
	public WebElement termCodeInput;

	@FindBy(how = How.NAME, using = "inputCode")
	public WebElement courseCodeInput;

	@FindBy(how = How.ID, using = "show_button")
	public WebElement showButton;

	@FindBy(how = How.ID, using = "KS-CourseOfferingManagement-CourseOfferingListSection")
	public WebElement courseOfferingSearchResultDiv;

}
