@US_01_smoke_test
Feature: US_01 Prospective students should be able to register in the system.


#  USER STORY-01  Prospective students should be able to register in the system.

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

  Background:
    Given user is on the home page
    When user clicks on registration icon
    And user is on the registration page

  @US01_TC01
  Scenario: TC_01 Successful User Registration
    When user fills in Name
    And user fills in Surname
    And user fills in Birth Place field
    And user fills in Phone number field
    And user chooses gender
    And user fills in Date Of Birth field
    And user fills in SSN number field
    And user fills in username field
    When user enters valid password field
    And user clicks on submit button to register
    Then user verifies that registration is successful
    Then close the application

  @US01_TC02
  Scenario: Missing Name
    When user passes Registration Name field without filling
    Then user verifies Required text is visible as a warning
    When user fills in Name
    Then user verifies Required text is not visible
    Then close the application

  @US01_TC03
  Scenario: Missing Surname
    When user fills in Name
    And user passes Surname  field
    Then user verifies Required text for Surname is visible as a warning
    When user fills in Surname
    Then user verifies that Required text  is not visible for Surname
    Then close the application

  @US01_TC04
  Scenario: Missing Birth Place
    When user fills in Name
    And user fills in Surname
    And user passes birth Place field
    Then user verifies Required text for birth Place is visible as a warning
    When user fills in Birth Place field
    Then user verifies Required text for birth Place is not visible
    Then close the application

  @US01_TC05
  Scenario: Missing Phone number
    When user fills in Name
    And user fills in Surname
    And user fills in Birth Place field
    And user passes in Phone number field
    Then user verifies Required text for  Phone number is visible as a warning
    When user fills in Phone number field
    Then user verifies Required text for Phone number is not visible
    Then close the application


  @US01_TC06
  Scenario: TC_06 Missing gender
    When user fills in Name
    And user fills in Surname
    And user fills in Birth Place field
    And user fills in Phone number field
    And user passes gender
    And user fills in Date Of Birth field
    And user fills in SSN number field
    And user fills in username field
    When user enters valid password field
    And user clicks on submit button to register
 #   Then user verifies that registration success text is visible

  @US01_TC07
  Scenario: TC_06 Missing  Date Of Birth
    When user fills in Name
    And user fills in Surname
    And user fills in Birth Place field
    And user fills in Phone number field
    And user chooses gender
    And user passes Date Of Birth field
    Then user verifies Required text for Date Of Birth is visible as a warning
    When user fills in Date Of Birth field
    Then user verifies Required text for Date Of Birth is not visible
    Then close the application

  @US01_TC08
  Scenario: TC_08 Missing  SSN number
    When user fills in Name
    And user fills in Surname
    And user fills in Birth Place field
    And user fills in Phone number field
    And user chooses gender
    And user fills in Date Of Birth field
    And user passes SSN number field
    Then user verifies Required text for SSN is visible as a warning
    When user fills in SSN number field
    Then user verifies Required text for SSN is not visible
    Then close the application

  @US01_TC09
  Scenario: TC_09
    When user fills in Name
    And user fills in Surname
    And user fills in Birth Place field
    And user fills in Phone number field
    And user chooses gender
    And user fills in Date Of Birth field
    And user fills in SSN number field
    And user passes username field
    Then user verifies Required text for username is visible as a warning
    When user fills in username field
    Then user verifies Required text for username is not visible
    Then close the application

  @US01_TC10
  Scenario: TC_10 Missing password
    When user fills in Name
    And user fills in Surname
    And user fills in Birth Place field
    And user fills in Phone number field
    And user chooses gender
    And user fills in Date Of Birth field
    And user fills in SSN number field
    And user fills in username field
    When user passes password field
    Then user verifies Required text for password  is visible as a warning
    When user enters valid password field
    Then user verifies Required text for password  is not visible
    Then close the application




  @US01_TC11
  Scenario Outline: TC_10 Invalid passwords with 7 digit pasword with at least 1 uppercase, 1 lowercase, 1 digit
    When user fills in Name
    And user fills in Surname
    And user fills in Birth Place field
    And user fills in Phone number field
    And user chooses gender
    And user fills in Date Of Birth field
    And user fills in SSN number field
    And user fills in username field
    When user enters seven character  "<password1>" with at least one uppercase, one lowercase, one digit
    Then user verifies Minimum eight character text is visible as a warning
    When user enters eight character "<password2>" with at least one uppercase, one lowercase, one digit
    Then user verifies Minimum eight character text for username is not visible

    Examples:test data
      | password1 |  password2 |
      | aBCDEF3   |   aBCDEF34  |
      | 12345aB   |  12345aBC   |


  @US01_TC12
  Scenario Outline: TC_12 Invalid passwords with 8 digit pasword with  uppercase and lowercase but not with digit
    When user fills in Name
    And user fills in Surname
    And user fills in Birth Place field
    And user fills in Phone number field
    And user chooses gender
    And user fills in Date Of Birth field
    And user fills in SSN number field
    And user fills in username field
    When user enters eight character  "<password>"with  uppercase and lowercase but not with digit
    Then user verifies that registration is successful
    Then close the application

    Examples:test data
      | password   |
      | aBCDEFgh   |
      | AACDEFgh   |

  @US01_TC13
  Scenario Outline: TC_13 passwords with 9 digit password  with at least one uppercase, one lowercase, one digit
    When user fills in Name
    And user fills in Surname
    And user fills in Birth Place field
    And user fills in Phone number field
    And user chooses gender
    And user fills in Date Of Birth field
    And user fills in SSN number field
    And user fills in username field
    When user enters nine character  "<password3>" with at least one uppercase, one lowercase, one digit
    And user clicks on submit button to register
    Then user verifies that registration is successful
    Then close the application

    Examples:test data
      | password3   |
      | aBCDEFgh1   |
      | 123CDEFgh   |
