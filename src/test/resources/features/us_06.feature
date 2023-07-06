
@US_06_smoke_test
Feature: US_06 Deans should be able to create a Vice Dean account.

  Background: Sign in StudentManagement
    Given user is on the home page :  "https://managementonschools.com/login"
    When user clicks on login icon
    And user enters valid username "AdminProject09" in username input
    And user enters valid password "12345678" in password input
    And user clicks on Login Button
    And user clicks on Menu Button
    And user clicks on Vise Dean Management Button



  @US06_TC01
  Scenario: TC_001 "Name" must be entered and cannot be left blank.
    When user passes Name field without filling
    Then user verifies Required text is visible when user does not fill name field
    When user fills in Name field with "Ada"
    Then user verifies Required text is not visible for name field
    Then user close the browser



  @US06_TC02
  Scenario: TC_002 "Surname" must be entered and cannot be left blank.
    And user fills in Name field with "Ada"
    Then user passes Surname field without filling
    Then user verifies Required text is visible when user does not fill surname field
    Then user fills in Surname field with "Berg"
    Then user verifies Required text is not visible for surname field
    Then user close the browser


  @US06_TC03
  Scenario: TC_003 "Birth Place" must be entered and cannot be left blank.
    When user fills in Name field with "Ada"
    Then user fills in Surname field with "Berg"
    When user passes Birth Place field without filling
    Then user verifies Required text is visible when user does not fill Birth Place field
    Then user fills in Birth Place field with "Norway"
    Then user verifies Required text is not visible for Birth Place field
    Then user close the browser


  @US06_TC04
  Scenario: TC_004 "Date of birth" must be entered and cannot be left blank.
    When user fills in Name field with "Ada"
    And user fills in Surname field with "Berg"
    And user fills in Birth Place field with "Norway"
    When user passes Date Of Birth field without filling
    Then user verifies Required text is visible when user does not fill Date Of Birthe field
    Then user fills in Date Of Birth field with "29.11.2000"
    Then user verifies Required text is not visible for Date Of Birth field
    Then user close the browser

  @US06_TC05
  Scenario: TC_005 "Phone number" must be entered and cannot be left blank.
    When user fills in Name field with "Ada"
    And user fills in Surname field with "Berg"
    And user fills in Birth Place field with "Norway"
    And user fills in Date Of Birth field with "29.11.2000"
    When user passes Phone number field without filling
    Then user verifies Required text is visible when user does not fill Phone number field
    Then user fills in Phone number field with "355-478-7894"
    Then user verifies Required text is not visible for Phone number field
    Then user close the browser



  @US06_TC06
  Scenario: TC_006 SSN must be entered and must contain a "-" after the 3rd and 5th digits and must consist of 9 digits in total and cannot be left blank.
    When user fills in Name field with "Ada"
    And user fills in Surname field with "Berg"
    And user fills in Birth Place field with "Norway"
    And user fills in Date Of Birth field with "29.11.2000"
    And user fills in Phone number field with "355-478-7894"
    When user passes SSN field without filling
    Then user verifies Required text is visible when user does not fill SSN field
    Then user fills in SSN number field with "777-455-8963"
    Then user verifies Required text is not visible for SSN field
    Then user close the browser



