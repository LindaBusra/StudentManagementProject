
@US_09_smoke_test
Feature: US_09 Vice Deans should be able to view the lesson list and make updates #(Lessons - Lesson List)


#  USER STORY-09 Vice Deans should be able to view the lesson list and make updates #(Lessons - Lesson List)

#  Acceptance Criteria
#  Vice Dean should be able to view the Lesson Name, Compulsory and Credit Score created.
#  Vice Dean should be able to delete the lesson.
#  Vice Dean should be able to update the lesson information.




  Background: Sign in StudentManagement
    Given user is on the home page :  "login_url"
    When user clicks on login icon
    And user enters valid username "myViceDean_valid_username" in username input
    And user enters valid password "myViceDean_valid_password" in password input
    And user clicks on Login Button
    And user clicks on Menu Button
    And user clicks on Lesson Management Button
    Then user clicks on Lesson field



  @US09_TC01
  Scenario: TC_001 Vice Dean should be able to view the Lesson Name, Compulsory and Credit Score created.
    Then user verifies Lesson Name, Compulsory, Credit Score fields are visible
    When user enters information for new lesson and click on submit button
    Then user verifies a new lesson is created.



  @US09_TC02
  Scenario: TC_002 Vice Dean should be able to delete the lesson.
    Then user verifies Lesson Name, Compulsory, Credit Score fields are visible
    When user enters information for new lesson and click on submit button
    Then user verifies a new lesson is created.
    When user clicks on delete button for this lesson
    Then user verifies the lesson is deleted


  @US09_TC03
  Scenario: TC_003 Vice Dean should be able to update the lesson information.

    #There is no update option for lesson, it is a bug



