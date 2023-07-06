
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


#
#
#  @US06_TC02
#  Scenario: TC_002 If you are updating an appointment, then user (doctor) should see patient's info such as
#  id, start and end date, Status, physician
#    Then user verifies patient id is visible
#    Then user verifies start date is visible
#    Then user verifies end date is visible
#    Then user verifies status is visible
#    Then user verifies physician is visible
#    Then user closes the page
#
#
#
#  @US012_TC03
#  Scenario: TC_003 doctor should type in Anamnesis, Treatment, and Diagnosis as required fields
#    And user fills in Anamnesis field with "Anamnesistext"
#    And user fills in Treatments field with "Treatmentstext"
#    And user fills in Diagnosis field with "Diagnosistext"
#    And user clicks on save button
#    And user verifies Anamnesis text which is written by user is visible
#    And user verifies Treatments text which is written by user is visible
#    And user verifies Diagnosis text which is written by user is visible
#    Then user verifies appointment is saved with Appointments text is visible.
#    Then user closes the page
#
#
#  @US012_TC04
#  Scenario: TC_004 doctor should type in Anamnesis, Treatment, and Diagnosis as required fields
#    And user fills in Anamnesis field with "Anamnesistext"
#    And user fills in Treatments field with "Treatmentstext"
#    And user does not fill Diagnosis field
#    And user clicks on save button
#    Then user verifies "This field is required." text is visible.
#    Then user closes the page
#
#  @US012_TC05
#  Scenario: TC_004 doctor should type in Anamnesis, Treatment, and Diagnosis as required fields
#    And user fills in Anamnesis field with "Anamnesistext"
#    And user does not fill in Treatments field
#    And user fills in Diagnosis field with "Diagnosistext"
#    And user clicks on save button
#    Then user verifies "This field is required." text is visible.
#    Then user closes the page
#
#  @US012_TC06
#  Scenario: TC_004 doctor should type in Anamnesis, Treatment, and Diagnosis as required fields
#    And user does not fill Anamnesis field.
#    And user fills in Treatments field with "Treatmentstext"
#    And user fills in Diagnosis field with "Diagnosistext"
#    And user clicks on save button
#    Then user verifies "This field is required." text is visible.
#    Then user closes the page
#
#
#  @US012_TC07
#  Scenario: TC_005 prescription and description can be optional
#    And user fills in Anamnesis field with "Anamnesistext"
#    And user fills in Treatments field with "Treatmentstext"
#    And user fills in Diagnosis field with "Diagnosistext"
#    And user fills Prescription field with "Prescriptiontext"
#    And user fills Description field with "Descriptiontext"
#    And user clicks on save button
#    Then user verifies appointment is saved with Appointments text is visible.
#    Then user closes the page
#
#
#  @US012_TC08
#  Scenario: TC_006 prescription and description can be optional
#    And user fills in Anamnesis field with "Anamnesistext"
#    And user fills in Treatments field with "Treatmentstext"
#    And user fills in Diagnosis field with "Diagnosistext"
#    And user does not fill Prescription field
#    And user does not fill Description field
#    And user clicks on save button
#    Then user verifies appointment is saved with Appointments text is visible.
#    Then user closes the page
#
#
#
#  @US012_TC09
#  Scenario: TC_007 Status can be only selected as PENDING, COMPLETED or CANCELLED by Doctor
#    And user clicks on "UNAPPROVED" button
#    And user verifies "UNAPPROVED" is not selectable.
#    And user clicks on "PENDING" button
#    And user verifies "PENDING" is selectable.
#    And user clicks on "CANCELLED" button
#    And user verifies "CANCELLED" is selectable.
#    And user clicks on "COMPLETED" button
#    And user verifies "COMPLETED" is selectable.
#
#
#
#  @US012_TC10
#  Scenario: TC_007 Status can be only selected as PENDING, COMPLETED or CANCELLED by Doctor
#    And User selects status as "COMPLETED"
#    And user fills in Anamnesis field with "Anamnesistext"
#    And user fills in Treatments field with "Treatmentstext"
#    And user fills in Diagnosis field with "Diagnosistext"
#    And user fills Prescription field with "Prescriptiontext"
#    And user fills Description field with "Descriptiontext"
#    And user clicks on save button
#    Then user verifies status is "COMPLETED"
#    Then user closes the page

