
@US_10_smoke_test
Feature: US_10 Vice Deans should be able to create a lesson schedule. (Lesson Program - Add Lesson Program)


#  USER STORY-10 Vice Deans should be able to create a lesson schedule. (Lesson Program - Add Lesson Program)

#  Acceptance Criteria
#  Vice Dean should be able to select a course.
#  Vice Dean should be able to select a semester.
#  Vice Dean should be able to select a day for the course.
#  Vice Dean should be able to select the start and end time for the course.




  Background: Sign in StudentManagement
    Given user is on the home page :  "login_url"
    When user clicks on login icon
    And user enters valid username "myViceDean_valid_username" in username input
    And user enters valid password "myViceDean_valid_password" in password input
    And user clicks on Login Button
    And user clicks on Menu Button
    And user clicks on Lesson Management Button
    Then user clicks on Lesson Program field



  @US10_TC01
  Scenario: TC_001 Vice Dean should be able to select a course.
    And user verifies that user can select "Selenium" course
    And user verifies that user can select "FALL_SEMESTER" semester
    And user verifies that user can select "WEDNESDAY" for the course
    And user verifies that user can select the start and end time for the course
    Then user clicks on Submit Button for Add Lesson Program













