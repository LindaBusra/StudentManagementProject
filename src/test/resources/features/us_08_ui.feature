
@US_08_smoke_test
Feature: US_08 Vice Deans should be able to create a lesson.  (Lessons - Add Lesson)


#  USER STORY-08 Vice Deans should be able to create a lesson. (Lessons - Add Lesson)

#  Acceptance Criteria
#  Vice Dean should be able to enter the name of lesson.
#  Vice Dean should be able to mark whether the course is compulsory or not.
#  Vice Dean should be able to enter the Credit Score.



  Background: Sign in StudentManagement
    Given user is on the home page :  "login_url"
    When user clicks on login icon
    And user enters valid username "myViceDean_valid_username" in username input
    And user enters valid password "myViceDean_valid_password" in password input
    And user clicks on Login Button
    And user clicks on Menu Button
    And user clicks on Lesson Management Button
    Then user clicks on Lesson field



  @US08_TC01
  Scenario: TC_001 Vice Dean should be able to enter the name of lesson.
    When user passes Lesson Name field without filling
    Then user verifies Required text is visible for Lesson Name field
    And user enters name of lesson as "Norwegian"
    Then user verifies "Required" text is not visible for Lesson Name field.



  @US08_TC02
  Scenario: TC_002 Vice Dean should be able to mark whether the course is compulsory or not.
    And user enters name of lesson as "Norwegian"
    And user clicks on compulsory checkbox
    Then user verifies compulsory checkbox is marked



  @US08_TC03
  Scenario: TC_003 Vice Dean should be able to enter the Credit Score.
    And user enters name of lesson as "Norwegian"
    And user clicks on compulsory checkbox
    Then user verifies "Required" text is visible for Credit Score field.
    And user enters the Credit Score as "1500"
    And user verifies "Required" text is not visible for Credit Score field.
    When user clicks on Submit Button
    Then user verifies "Lesson Created" text is visible for this new lesson









