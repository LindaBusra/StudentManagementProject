
@US_07_smoke_test
Feature: US_07 Deans should be able to see the messages sent by users.


#  USER STORY-07  Deans should be able to see the messages sent by users.

#  Acceptance Criteria
#  Deans should be able to see the delete button.
#  Deans should be able to view messages, authors, emails, sending dates and subject information.
#  Deans should be able to delete messages.



  Background: Sign in StudentManagement
    Given user is on the home page :  "login_url"
    When user clicks on login icon
    And user enters valid username "myDean_valid_username" in username input
    And user enters valid password "myDean_valid_password" in password input
    And user clicks on Login Button
    And user clicks on Menu Button
    And user clicks on Contact Get All Button



  @US07_TC01
  Scenario: TC_001 Deans should be able to see the delete button.

    #When I try to login as Dean I can not see delete button



  @US07_TC02
  Scenario: TC_002 Deans should be able to view messages, authors, emails, sending dates and subject information.
    Then user verifies Name, Email, Date, subject, Message fields are visible



  @US07_TC03
  Scenario: TC_003 Deans should be able to delete messages.

  #When I try to login as Dean I can not see delete button








