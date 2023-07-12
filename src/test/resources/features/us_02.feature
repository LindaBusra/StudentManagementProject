@US_02_smoke_test
Feature: US_02 Admin should be able to see the Guest User List.


#  USER STORY-02  Admin should be able to see the Guest User List.

#  Acceptance Criteria
#  Admin should be able to see Name, Phone Number, SSN and User Name information in the guest user list.
#  Admin should be able to delete information of Guest User List.



  Background: Sign in StudentManagement
    Given user is on the home page :  "login_url"
    When user clicks on login icon
    And user enters valid username "myAdmin_valid_username" in username input
    And user enters valid password "myAdmin_valid_password" in password input
    And user clicks on Login Button
    And user clicks on Menu Button
    And user clicks on GuestUser Button

    #It gives error in line 20, I can not click to Guest User Button!!!!!


  @US02_TC01
  Scenario: Admin should be able to see Name, Phone Number, SSN and User Name information in the guest user list.
    Then user verifies Name, Phone Number, SSN and User Name information field is visible
    And user clicks on delete button for first user
    Then user verifies " Guest User deleted Successful" text is visible after deleting
#    Then user close the browser