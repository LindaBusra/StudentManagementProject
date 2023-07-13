@US_06_smoke_test
Feature: US_06 Deans should be able to create a Vice Dean account.

  @US01_TC11_DB
  Scenario: TC11_DB_registration_DataBase
    Given user connects to the database
    And user gets the column "username" from table "public.vice_dean"
    Then verify table "public.vice_dean" and column "username" contains data "JohnSmith"
    And close the connection


  @US_006_TC12_API
  Scenario: User validates the necessary request is done by Api
    And User sets the expected data
    And User sends the post request and gets the response
    Then verify that status code is 200
    And Do assertion according to post request
    And User sends the Get request and gets the response
    Then verify that status code is 200 for get request
    And Do assertion according to Get request