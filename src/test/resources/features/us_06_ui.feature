
@US_06_smoke_test
Feature: US_06 Deans should be able to create a Vice Dean account.


#  USER STORY-06  Deans should be able to create a Vice Dean account.

#  Acceptance Criteria
#  "Name" must be entered and cannot be left blank.
#  Surname" must be entered and cannot be left blank
#  "Birth Place" must be entered and cannot be left blank.
#  Gender must be selected and cannot be left blank.
#  Date of birth must be entered and cannot be left blank.
#  Phone number must be entered and cannot be left blank.
#  SSN must be entered and must contain a "-" after the 3rd and 5th digits and must consist of 9 digits in total and cannot be left blank.
#  User Name must be entered and cannot be left blank.
#  Password can be entered and must consist of at least 8 characters.
#  Password must contain uppercase letters, lowercase letters, and a number.


  Background: Sign in StudentManagement
    Given user is on the home page :  "login_url"
    When user clicks on login icon
    And user enters valid username "myDean_valid_username" in username input
    And user enters valid password "myDean_valid_password" in password input
    And user clicks on Login Button
    And user clicks on Menu Button
    And user clicks on Vise Dean Management Button



  @US06_TC01
  Scenario: TC_001 "Name" must be entered and cannot be left blank.
    When user passes Name field without filling
    Then user verifies Required text is visible when user does not fill name field
    When user fills in Name field with "name"
    Then user verifies Required text is not visible for name field
    Then user close the browser



  @US06_TC02
  Scenario: TC_002 "Surname" must be entered and cannot be left blank.
    And user fills in Name field with "name"
    Then user passes Surname field without filling
    Then user verifies Required text is visible when user does not fill surname field
    Then user fills in Surname field with "surname"
    Then user verifies Required text is not visible for surname field
    Then user close the browser


  @US06_TC03
  Scenario: TC_003 "Birth Place" must be entered and cannot be left blank.
    When user fills in Name field with "name"
    Then user fills in Surname field with "surname"
    When user passes Birth Place field without filling
    Then user verifies Required text is visible when user does not fill Birth Place field
    Then user fills in Birth Place field with "birthplace"
    Then user verifies Required text is not visible for Birth Place field
    Then user close the browser


  @US06_TC04

  Scenario: TC_004 Gender must be selected and cannot be left blank..
    When user fills in Name field with "name"
    And user fills in Surname field with "surname"
    And user fills in Birth Place field with "birthplace"
    And user fills in Date Of Birth field with "dateofbirth"
    And user fills in Phone number field with "phone_number"
    And user fills in SSN number field with "ssn_number"
    And user fills in username field with "username"
    And user fills in password field with "password"
    And user verifies female and male button is not selected
    Then user clicks on submit button
    Then user verifies "Vice dean Saved" text is not visible
    And user verifies female or male button is selected
    Then user clicks on submit button
    Then user verifies after click on submit button "Vice dean Saved" text is visible

#problem with line 76 ve 79




  @US06_TC05
  Scenario: TC_005 "Date of birth" must be entered and cannot be left blank.
    When user fills in Name field with "name"
    And user fills in Surname field with "surname"
    And user fills in Birth Place field with "birthplace"
    When user passes Date Of Birth field without filling
    Then user verifies Required text is visible when user does not fill Date Of Birthe field
    And user fills in Date Of Birth field with "dateofbirth"
    Then user verifies Required text is not visible for Date Of Birth field
#    Then user close the browser



  @US06_TC06
  Scenario: TC_006 "Phone number" must be entered and cannot be left blank.
    When user fills in Name field with "name"
    And user fills in Surname field with "surname"
    And user fills in Birth Place field with "birthplace"
    And user fills in Date Of Birth field with "dateofbirth"
    When user passes Phone number field without filling
    Then user verifies Required text is visible when user does not fill Phone number field
    And user fills in Phone number field with "phone_number"
    Then user verifies Required text is not visible for Phone number field
    Then user close the browser



  @US06_TC07
  Scenario: TC_007 SSN must be entered and must contain a "-" after the 3rd and 5th digits and must consist of 9 digits in total and cannot be left blank.
    When user fills in Name field with "name"
    And user fills in Surname field with "surname"
    And user fills in Birth Place field with "birthplace"
    And user fills in Date Of Birth field with "dateofbirth"
    And user fills in Phone number field with "phone_number"
    When user passes SSN field without filling
    Then user verifies Required text is visible when user does not fill SSN field
    And user fills in SSN number field with less than 11 character "77-455"
    Then user verifies "Minimum 11 character (XXX-XX-XXXX)" text is visible
    And user fills in SSN number field with invalid number "77-455-8963"
    And user clicks on submit button
    Then user verifies "Please enter valid SSN number" alert text is visible
    Then user fills in SSN number field with "ssn_number"
    Then user verifies Required text is not visible for SSN field
    Then user close the browser

#there is problem with line 126 !!!!  Then user verifies "Please enter valid SSN number" alert text is visible


  @US06_TC08
  Scenario: TC_008 User Name must be entered and cannot be left blank.
    When user fills in Name field with "name"
    And user fills in Surname field with "surname"
    And user fills in Birth Place field with "birthplace"
    And user fills in Date Of Birth field with "dateofbirth"
    And user fills in Phone number field with "phone_number"
    Then user fills in SSN number field with "ssn_number"
    When user passes username field without filling
    Then user verifies Required text is visible when user does not fill username field
    And user fills in username field with "username"
    Then user verifies Required text is not visible for username field
    Then user close the browser


  @US06_TC09
  Scenario: TC_009 Password can be entered and must consist of at least 8 characters.
    When user fills in Name field with "name"
    And user fills in Surname field with "surname"
    And user fills in Birth Place field with "birthplace"
    And user fills in Date Of Birth field with "dateofbirth"
    And user fills in Phone number field with "phone_number"
    Then user fills in SSN number field with "ssn_number"
    And user fills in username field with "username"
    When user passes password field without filling
    And user clicks on submit button
    Then user verifies Required text is visible for password field
    And user fills in password field with less than 8 character like "77455"
    Then user verifies "Minimum 8 character" text is visible for password field
    And user fills in password field with "password"
    Then user verifies Required text is not visible for password field
    Then user close the browser


  @US06_TC10
  Scenario: TC_010 Password must contain uppercase letters, lowercase letters, and a number.
    When user fills in Name field with "name"
    And user fills in Surname field with "surname"
    And user fills in Birth Place field with "birthplace"
    And user fills in Date Of Birth field with "dateofbirth"
    And user fills in Phone number field with "phone_number"
    Then user fills in SSN number field with "ssn_number"
    And user fills in username field with "username"
    When user passes password field without filling
    And user clicks on submit button
    Then user verifies Required text is visible for password field
    And user fills in password field with less than 8 character like "77455"
    Then user verifies "Minimum 8 character" text is visible for password field
    And user fills in password field with invalid password "abcdefgh"
    And user clicks on submit button
    Then user verifies "Vice dean Saved" text is not visible
    And user fills in password field with "password"
    And user clicks on submit button
    Then user verifies after click on submit button "Vice dean Saved" text is visible
    Then user close the browser









