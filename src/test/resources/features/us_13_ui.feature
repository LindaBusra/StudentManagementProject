@US_13_smoke_test
Feature: US_13 Vice Deans should be able to create a teacher.


#  USER STORY-13 Vice Deans should be able to create a teacher.

#  Acceptance Criteria
#  The lesson that the teacher will enter should be able to be selected.
#  "Name" must be entered and cannot be left blank.
#  Surname" must be entered and cannot be left blank
#  "Birth Place" must be entered and cannot be left blank.
#  E-mail must be entered and cannot be left blank.
#  Phone number must be entered and cannot be left blank.
#  If the teacher has an advisory role, the ‘Is Advisor Teacher’ option should be able to be selected.
#  Gender must be selected and cannot be left blank.
#  Date of birth must be entered and cannot be left blank.
#  SSN must be entered and must contain a "-" after the 3rd and 5th digits and must consist of 9 digits in total and cannot be left blank.
#  User Name must be entered and cannot be left blank.
#  Password can be entered and must consist of at least 8 characters.
#  Password must contain uppercase letters, lowercase letters, and a number.




  Background: Sign in StudentManagement
    Given user is on the home page :  "login_url"
    When user clicks on login icon
    And user enters valid username "myViceDean_valid_username" in username input
    And user enters valid password "myViceDean_valid_password" in password input
    And user clicks on Login Button
    And user clicks on Menu Button
    And user clicks on Teacher Management Button



  @US13_TC01
  Scenario: TC_001 Vice Deans should be able to create a teacher.
#    When user selects the lesson that the teacher will enter
    And user verifies Reguired text is visible before enter the name
    Then user enters the name

    And user verifies Reguired text is visible before enter the surname
    Then user enters the surname

    And user verifies Reguired text is visible before enter the Birth Place
    Then user enters the Birth Place

    And user verifies Reguired text is visible before enter the Email
    Then user enters the Email

    And user verifies Reguired text is visible before enter the Phone Number
    Then user enters the Phone Number

    Then user clicks on Is Advisor Teacher option
    And user verifies Is Advisor Teacher option is selected
    Then user clicks on male or female radio button
    And user verifies Reguired text is visible before enter the Date Of Birth
    Then user enters the Date Of Birth

    And user verifies Reguired text is visible before enter the SSN Number
    When user enters the SSN number which is less than 11 characters
    Then user verifies Minimum 11 character text is visible
    When user enters an invalid SSN number
    And user verifies Reguired text is visible before enter the Username
    Then user enters the Username
    And user verifies Reguired text is visible before enter the Password
    Then user enters the Password

    And user clicks on submit button for create a new teacher
    Then user verifies Please enter valid SSN number text is visible
    And user enters a valid SSN Number
    And user clicks on submit button for create a new teacher






