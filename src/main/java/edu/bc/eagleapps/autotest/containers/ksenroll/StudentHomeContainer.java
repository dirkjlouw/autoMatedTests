package edu.bc.eagleapps.autotest.containers.ksenroll;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StudentHomeContainer {

	@FindBy(how = How.ID, using = "KS-StudentHome-Enrollment")
	public WebElement enrollmentLink;

}
