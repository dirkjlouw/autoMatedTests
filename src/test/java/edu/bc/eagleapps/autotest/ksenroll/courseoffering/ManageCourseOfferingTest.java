package edu.bc.eagleapps.autotest.ksenroll.courseoffering;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:features/ksenroll/courseOffering" }, plugin = { "pretty",
		"html:target/ksenroll/courseOffering", "json:target/ksenroll/courseOffering/manageCourseOffering.json",
		"junit:target/ksenroll/courseOffering/manageCourseOffering.xml" }, tags = { "@manageCourseOffering" }, glue = {
				"classpath:edu/bc/eagleapps/autotest/ksenroll/stepdefinitions" })
public class ManageCourseOfferingTest {

}
