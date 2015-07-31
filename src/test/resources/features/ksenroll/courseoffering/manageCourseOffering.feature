@requires_browser
@manageCourseOffering

Feature: Test Manage Course Offering

Background:
    Given I sign in as "admin"
    And the Student Home Page is shown
    And I clicked the Enrollment Link

Scenario: Show Course Offering
	Given I navigate to Manage Course Offering
	And I enter the term "201208"
	And I enter the course "CHEM132"
	When I click the Show button
	Then I should see a list of course offerings
